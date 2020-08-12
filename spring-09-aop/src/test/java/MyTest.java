import com.zhou.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Date: 2020/7/30 9:37
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口
        UserService userService = context.getBean("userService", UserService.class);
        userService.update();
    }
}
