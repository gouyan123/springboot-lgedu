package com.gouyan.springbootanalysis.importor;

import com.gouyan.springbootanalysis.config.MyConfig;
import com.gouyan.springbootanalysis.model.People;
import com.gouyan.springbootanalysis.model.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(People.class);
        registry.registerBeanDefinition(People.class.getName(),bdb.getBeanDefinition());

        BeanDefinitionBuilder bdb2 = BeanDefinitionBuilder.rootBeanDefinition(User.class);
        registry.registerBeanDefinition(User.class.getName(),bdb2.getBeanDefinition());

        BeanDefinitionBuilder bdb3 = BeanDefinitionBuilder.rootBeanDefinition(MyConfig.class);
        registry.registerBeanDefinition(MyConfig.class.getName(),bdb3.getBeanDefinition());
    }
}