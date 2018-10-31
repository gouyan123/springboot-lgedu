package com.gouyan.springbootanalysis;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

    /**bean属性设置完成之后触发；这里可以对 指定的bean做一些处理；例如，返该对象的代理对象；*/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.err.println("=========postProcessBeforeInitialization=========" + bean.getClass());
        //返回具体实例的代理对象
        return bean;
    }

    /**bean的init()方法执行之后触发的*/
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.err.println("=========postProcessAfterInitialization=========" + bean.getClass());
        return bean;
    }
}