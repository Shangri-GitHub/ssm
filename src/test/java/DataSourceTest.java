

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * 从上下文拿到Bean
 */
public class DataSourceTest {
    private ApplicationContext ctx = null;

    @Before
    public void setUp() {
        System.out.println("setUp");
        ctx = new ClassPathXmlApplicationContext("beans.xml");
    }

    @After
    public void cleanUp() {
        System.out.println("cleanUp");
        ctx = null;
    }

    @Test
    public void testDataSource() {
        System.out.println("testDataSource");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Assert.assertNotNull(dataSource);


    }
}
