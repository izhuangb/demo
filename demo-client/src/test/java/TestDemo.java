import com.comm.service.DemoClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lijuntao on 2016/4/20.
 */

public class TestDemo {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:applicationContent-beans.xml"});
        context.start();

        DemoClientService demoService = (DemoClientService)context.getBean("demoClientService"); // ��ȡԶ�̷������
        String str = demoService.sayHello("world"); // ִ��Զ�̷���
        System.out.println(str);
    }

}
