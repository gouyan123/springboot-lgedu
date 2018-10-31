package com.gouyan.springbootanalysis;

import com.gouyan.springbootanalysis.annotation.EnableLog;
import com.gouyan.springbootanalysis.config.MyConfig;
import com.gouyan.springbootanalysis.model.*;
import com.gouyan.springbootanalysis.thread.UserRunnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

//@SpringBootApplication
/*激活异步，即激活@Async注解*/
//@EnableAsync
//@Import({User.class,People.class, MyConfig.class})
@EnableLog(name = "com.gouyan.springbootanalysis")
public class SpringBootAnalysisApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootAnalysisApplication.class, args);
//        System.out.println(context.getBean(ServerBean.class));
//        context.getBean(Runnable.class).run();
//        System.out.println("end");
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(People.class));
    }
}
