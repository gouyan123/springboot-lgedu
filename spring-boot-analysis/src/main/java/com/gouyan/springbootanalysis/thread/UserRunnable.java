package com.gouyan.springbootanalysis.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Component
public class UserRunnable implements Runnable{
    /**@Async 表示与父线程异步；且启动类必须使用@EnableAsync激活@Async注解；*/
    @Async
    @Override
    public void run() {
        try{
            for (int i = 0; i <10 ; i++) {
                System.out.println("============"+i);
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}