package com.wzx;

import com.wzx.event.TestApplication;
import com.wzx.event.TestApplicationEvent;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CommonsTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication
                                                                .run(CommonsTestApplication.class, args);
//        TestApplication testApplication = new TestApplication();
//        testApplication.setName("zhangsan");
//        testApplication.setAge(23);
//        TestApplicationEvent testApplicationEvent = new TestApplicationEvent(testApplication);
//        applicationContext.publishEvent(testApplicationEvent);
    }
}
