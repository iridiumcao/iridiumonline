package org.iridium.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class MainApp {
    public static void main(String[] args) {
        String beanFilePath = "spring-config.xml"; // don't use absolute path
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beanFilePath);

        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
        String message = helloWorld.getMessage();
        System.out.println(message);
    }
}
