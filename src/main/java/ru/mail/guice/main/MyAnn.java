package ru.mail.guice.main;

import com.google.inject.BindingAnnotation;
import java.lang.annotation.*;


@BindingAnnotation
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnn {
}
