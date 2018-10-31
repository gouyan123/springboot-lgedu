package com.gouyan.springbootanalysis.annotation;

import com.gouyan.springbootanalysis.importor.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableImportConfig {
}