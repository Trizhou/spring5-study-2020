import com.zhou.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: Trizhou
 * @Date: 2020/7/21
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在Spring中管理了，要使用直接去取
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
