import com.back.service.DemoService;
import com.comm.service.DemoClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lijuntao on 2016/5/3.
 */
public class TestDemo {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath*:applicationContent-beans.xml"});
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        for(int i=1; i<20;i++){
            String str = demoService.sayHello("world"); // 执行远程方法
            System.out.println(str);
        }

    }

}

