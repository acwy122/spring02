import com.mashibing.controller.PersonController;
import com.mashibing.service.PersonService;
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
        PersonController personController02 = context.getBean("personController", PersonController.class);
        System.out.println(personController);
        System.out.println(personController02==personController);//单例的@Scope(value = "singleton")，多例@Scope(value = "prototype")
        PersonService personService = context.getBean("personService", PersonService.class);
        System.out.println(personService);
    }
}
