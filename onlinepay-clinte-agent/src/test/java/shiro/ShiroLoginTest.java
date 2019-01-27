package shiro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.BookstoreApplicationTests;
import com.example.store.service.shiro.ILoginService;

/**
 * 测试shiro 登陆已经注册
 * 
 * @author 26500
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroLoginTest extends BookstoreApplicationTests{

    @Resource
    private ILoginService loginService;

    /**
     * shiro 注册用户
     */
    @Test
    public void register() {
        loginService.addUser(null);
    }
}
