package org.spring.springboot;

import org.spring.springboot.web.DiConfig;
import org.spring.springboot.web.UseFunctionService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[]args)
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class); //1
        UseFunctionService useFunctionService =
                context.getBean(UseFunctionService.class);//2
        System.out.println(useFunctionService.SayHello("di"));
        context.close();

    }
}
