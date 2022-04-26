import com.mashibing.controller.BaseController;
import com.mashibing.dao.BaseDao;
import com.mashibing.dao.TeacherDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注意给测试类起名字的时候千万不要定义成test
 *
 * 测试的方法不可以有参数，不可以有返回值
 */
public class MyTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01(){
//        PersonController personController = context.getBean("personController", PersonController.class);
//        personController.save();

//        PersonController personController02 = context.getBean("personController", PersonController.class);
//        System.out.println(personController);
//        System.out.println(personController02==personController);//单例的@Scope(value = "singleton")，多例@Scope(value = "prototype")
//        PersonService personService = context.getBean("personService", PersonService.class);
//        System.out.println(personService);


    }

    @Test
    public void test02(){
        BaseController baseController = context.getBean("baseController", BaseController.class);
        baseController.save();
    }
}
