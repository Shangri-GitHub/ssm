import com.alibaba.fastjson.JSON;
import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.log4j.Logger;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})



public class BaseTest {
    private static Logger logger = Logger.getLogger(BaseTest.class);
    @Resource
    private UserService userService;
    @Test
    public void test1() {
        Integer num = userService.deleteUser(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(num);
        logger.info(JSON.toJSONString(num));
    }

}
