package com.gouyan.springbootanalysis.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**方式二：将MyApplicationListener实例化到spring容器*/
@Component
/**实现ApplicationListener接口创建 监听器，并用onApplicationEvent(MyApplicationEvent event)方法监听MyApplicationEvent事件*/
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("接收到事件："+event.getClass());
    }
}