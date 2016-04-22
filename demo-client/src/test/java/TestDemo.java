import com.comm.service.DemoClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lijuntao on 2016/4/20.
 */

public class TestDemo {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:applicationContent-beans.xml"});
        context.start();

        DemoClientService demoService = (DemoClientService)context.getBean("demoClientService"); // 获取远程服务代理
        String str = demoService.sayHello("world"); // 执行远程方法
        System.out.println(str);
    }

}
