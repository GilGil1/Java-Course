package com;

import com.springcourse.PrototypeBean;
import com.springcourse.SingletonBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.applet.AppletContext;

@Configuration
@ComponentScan("com")
public class Test {

    public static void main(String[] args) {
        try {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(Test.class);
            SingletonBean b1 = ctx.getBean(SingletonBean.class);
            SingletonBean b2 = ctx.getBean("singletonBean", SingletonBean.class);


            PrototypeBean b3 = ctx.getBean(PrototypeBean.class);
            PrototypeBean b4 = ctx.getBean("prototypeBean", PrototypeBean.class);

            PrototypeBean b5 = ctx.getBean("proto6", PrototypeBean.class); // Wrong Class
            System.out.println("b1 x:" + b1.x);
            System.out.println("b2 x:" + b2.x);
            System.out.println("b3 x:" + b3.x);
            System.out.println("b4 x:" + b4.x);
            System.out.println("b5 x:" + b5.x);
            System.out.println("Hello World!"); // Display the string.
            ((AnnotationConfigApplicationContext) ctx).close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
