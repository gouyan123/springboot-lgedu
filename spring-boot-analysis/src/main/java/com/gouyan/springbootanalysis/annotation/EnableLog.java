package com.gouyan.springbootanalysis.annotation;

import com.gouyan.springbootanalysis.importor.MyImportSelector;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyImportSelector.class)
public @interface EnableLog {
    String name();
}