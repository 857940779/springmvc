import com.springmvc.service.DataService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: luohanwen
 * @Date: 2019/9/19 11:07
 */
public class ServiceTest {

    public static ApplicationContext ctx;
    public static DataService dataService;

    @BeforeClass
    public static void init() {
        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        dataService = ctx.getBean(DataService.class);
        System.out.println("-----------------");
    }

    @Test
    public void test() {
        dataService.getData();
    }
}