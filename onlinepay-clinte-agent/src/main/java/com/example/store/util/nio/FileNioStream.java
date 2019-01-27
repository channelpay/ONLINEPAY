package com.example.store.util.nio;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.swing.Box.Filler;
import ch.qos.logback.core.util.TimeUtil;
import io.micrometer.core.instrument.util.TimeUtils;

/**
 * 简单学习NIO
 * 
 * @author ONEC
 *
 */
public class FileNioStream {

    public static void main(String[] args) throws IOException {
        // FileNioStream.fileIoTrans();
        // fileNioTrans();
        // socketChannle();
        // fileNioReadWrite();
        // tarnsfer();
        selector();
    }

    /**
     * 传统方式i/o读取
     */
    public static void fileIoTrans() {
        StringBuffer sb = new StringBuffer();
        InputStream in = null;
        String param = "";
        try {
            in = new BufferedInputStream(new FileInputStream("I:\\filetest.txt"));
            byte[] bytesize = new byte[1024];
            int temp;
            while ((temp = in.read(bytesize)) != -1) {
                param += temp;
            }
            // for (int i = 0; i < bytesize.length; i++) {
            // System.out.println("读取到的数据是：" + (char) bytesize[i]);
            // }
            System.out.println("生成的数据是：" + param.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Nio 读取文件内容
     * 
     * @throws IOException
     */
    public static void fileNioTrans() throws IOException {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("I:\\filetest.txt", "rw");
            FileChannel fileChannel = randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(11);
            int byteread = fileChannel.read(buffer);
            System.out.println("filechannle读取的数据大小：" + byteread);
            while (byteread != -1) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    System.out.println("读取到的数据是：" + (char) buffer.get());

                }
                buffer.compact();
                byteread = fileChannel.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    /**
     * Nio 读写结合示例（文件拷贝）
     * 
     * @throws IOException
     */
    public static void fileNioReadWrite() throws IOException {
        // 文件输入channel
        FileInputStream in = new FileInputStream("I:\\filetest.txt");
        FileChannel infChannel = in.getChannel();

        // 文件输出channle
        File file = new File("I:\\sfiletest.txt");
        if (file.exists()) {
            file.createNewFile();
        }
        FileOutputStream out = new FileOutputStream(file);
        FileChannel outChannel = out.getChannel();

        // 创建buffer
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            int byteIn = infChannel.read(buffer);
            if (-1 == byteIn) {
                break;
            }
            // 重设position 为0 limit 为position
            buffer.flip();
            outChannel.write(buffer);
            // 重置position 为0 limit 为position
            buffer.clear();
        }
        in.close();
        infChannel.close();
        out.close();
        outChannel.close();
    }

    /**
     * 通道之间的数据传输 transferFrom FileChannel的transferFrom()方法可以将数据从源通道传输到FileChannel中 transferTo
     */
    public static void tarnsfer() {

        try {
            RandomAccessFile formFile =
                    new RandomAccessFile("I:\\opt\\tomcat7\\logs\\trx.log", "rw");
            FileChannel formChannel = formFile.getChannel();

            RandomAccessFile toFile = new RandomAccessFile("I:\\trx.log", "rw");
            FileChannel toChannel = toFile.getChannel();

            long count = formChannel.size();
            long position = 0;
            System.out.println("是否读取到文件：" + count);
            // toChannel.transferFrom(formChannel, position, count);
            toChannel.transferTo(position, count, formChannel);
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            toChannel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 选择器的使用
     */
    public static void selector() {

        // 只能使用非阻塞的通道： 如socketchannle 和serversocketchannle
        try {
            SocketChannel socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            Selector selector = Selector.open();// 打开选择器
            SelectionKey selectionKey = socketChannel.register(selector, SelectionKey.OP_READ);//
            // 创建时间。。持续监控
            while (true) {
                int readyChannl = selector.select();
                System.out.println("监控连接事件状态：" + LocalDateTime.now());
                if (0 == readyChannl) {
                    continue;
                }
                Set<SelectionKey> selects = selector.selectedKeys();
                Iterator<SelectionKey> keysIt = selects.iterator();
                while (keysIt.hasNext()) {
                    SelectionKey key = keysIt.next();
                    if (key.isAcceptable()) {// 通道连接就绪
                        System.out.println("接收就绪：");
                    }
                    if (key.isConnectable()) {// 通道连接就绪
                        System.out.println("连接就绪：");
                    }
                    if (key.isReadable()) {// 通道连接就绪
                        System.out.println("读取就绪：");
                    }
                    if (key.isWritable()) {// 通道连接就绪
                        System.out.println("写操作就绪：");
                    }
                }
                keysIt.remove();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * nio socketchannle
     * 
     * @throws IOException
     */
    public static void socketChannle() throws IOException {

        ByteBuffer byteBuffer = ByteBuffer.allocate(11);
        SocketChannel socketChannel = null;
        try {
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);
            socketChannel.connect(new InetSocketAddress("localhost", 8815));
            if (socketChannel.finishConnect()) {
                int i = 0;
                while (true) {
                    TimeUtils.secondsToUnit(12, TimeUnit.SECONDS);
                    byteBuffer.clear();
                    String info = "这个简单信息是要发给你的：";
                    byteBuffer.put(info.getBytes());
                    while (byteBuffer.hasRemaining()) {
                        System.err.println("------:" + byteBuffer);
                        socketChannel.write(byteBuffer);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socketChannel != null) {
                socketChannel.close();
            }
        }
    }


}
