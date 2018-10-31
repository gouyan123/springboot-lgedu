package com.gouyan.springbootanalysis;

import com.gouyan.springbootanalysis.annotation.EnableLog;
import com.gouyan.springbootanalysis.config.MyConfig;
import com.gouyan.springbootanalysis.event.MyApplicationEvent;
import com.gouyan.springbootanalysis.event.MyApplicationListener;
import com.gouyan.springbootanalysis.model.*;
import com.gouyan.springbootanalysis.thread.UserRunnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
/*激活异步，即激活@Async注解*/
//@EnableAsync
//@Import({User.class,People.class, MyConfig.class})
//@EnableLog(name = "com.gouyan.springbootanalysis")
public class SpringBootAnalysisApplication {
    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAnalysisApplication.class, args);
//        System.out.println(context.getBean(ServerBean.class));
//        context.getBean(Runnable.class).run();
//        System.out.println("end");
//        System.out.println(context.getBean(User.class));
//        System.out.println(context.getBean(Dog.class));
//        System.out.println(context.getBean(Cat.class));
//        System.out.println(context.getBean(People.class));
        SpringApplication application = new SpringApplication(SpringBootAnalysisApplication.class);
        //application为事件源，注册监听器
        application.addListeners(new MyApplicationListener());
        //启动应用获取上下文
        ConfigurableApplicationContext context = application.run(args);
        // context发布事件
        context.publishEvent(new MyApplicationEvent(new Object()));
        // 关闭上下文
        context.close();
    }
}
