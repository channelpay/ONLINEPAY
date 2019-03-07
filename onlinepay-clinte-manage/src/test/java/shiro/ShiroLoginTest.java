package shiro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.ManageApplicationTests;

/**
 * 测试shiro 登陆已经注册
 * 
 * @author 26500
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroLoginTest extends ManageApplicationTests {

//    @Resource
//    private ILoginService loginService;

    /**
     * shiro 注册用户
     */
    @Test
    public void register() {
        //loginService.addUser(null);
    }
}
