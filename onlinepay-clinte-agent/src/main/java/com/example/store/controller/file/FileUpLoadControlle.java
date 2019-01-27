package com.example.store.controller.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件的上传与下载
 * 
 * @author ONEC
 *
 */
@RestController
public class FileUpLoadControlle {

    @RequestMapping(value = "upload", method = RequestMethod.POST,
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUpLoad(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        File convfile = new File("d:\\" + multipartFile.getOriginalFilename());
        convfile.createNewFile();
        FileOutputStream outStream = new FileOutputStream(convfile);
        outStream.write(multipartFile.getBytes());
        outStream.close();
        return "file over";
    }

    /**
     * 实现文件下载
     * 
     * @return
     * @throws FileNotFoundException
     */
    @RequestMapping(value="downLoad")
    public ResponseEntity<Object> downLoadFile() throws FileNotFoundException {
        String filename = "D://hxt_acp_sdk.properties";
        File file = new File(filename);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition",
                String.format("attachment; filename=\\%s\\", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");
        ResponseEntity<Object> responseEntity =
                ResponseEntity.ok().headers(headers).contentLength(file.length())
                        .contentType(MediaType.parseMediaType("application/txt")).body(resource);
        return responseEntity;
    }
}
