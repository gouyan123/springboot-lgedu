package com.gouyan.springbootanalysis.event;

import org.springframework.context.ApplicationEvent;

/**定义事件*/
public class MyApplicationEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    public MyApplicationEvent(Object source) {
        super(source);
    }
}