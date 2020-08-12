import com.zhou.config.MyConfig;
import com.zhou.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: Trizhou
 * @Date: 2020/7/23
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
    
    public Integer test(Integer n) {
        return n;
    }
}
