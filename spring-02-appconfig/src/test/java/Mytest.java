import com.song.config.MyConfig;
import com.song.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/9 2:52
 */
public class Mytest {
    public static void main(String[] args) {
        //如果完全使用配置类方法去做，我们就只能通过annotationconfig上下文来获取容器，通过配置类的class对象来加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
