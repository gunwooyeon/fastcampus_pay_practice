package common;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface WebAdapter {
    @AliasFor(annotation = Component.class)
    String value() default "";
}

/*
# H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Datasource
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:test
spring.datasource.username=user
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-rop
 */