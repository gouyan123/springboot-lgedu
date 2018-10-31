package com.gouyan.springbootanalysis.importor;

import com.gouyan.springbootanalysis.annotation.EnableLog;
import com.gouyan.springbootanalysis.config.MyConfig;
import com.gouyan.springbootanalysis.model.People;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //获取注解的属性信息
        System.out.println(importingClassMetadata.getAllAnnotationAttributes(EnableLog.class.getName()));
       //这里可以获取到注解的详细信息，然后根据信息去动态的返回需要被spring容器管理的bean
        return new String[]{"com.gouyan.springbootanalysis.model.User",People.class.getName(),MyConfig.class.getName()};
    }
}