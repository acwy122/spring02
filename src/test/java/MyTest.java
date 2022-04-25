import com.mashibing.controller.PersonController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注意给测试类起名字的时候千万不要定义成test
 *
 * 测试的方法不可以有参数，不可以有返回值
 */
public class MyTest {

    @Test
    public void test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonController personController = context.getBean("personController", PersonController.class);
        System.out.println(personController);
    }
}
