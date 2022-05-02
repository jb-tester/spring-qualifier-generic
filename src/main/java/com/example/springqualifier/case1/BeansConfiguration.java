package com.example.springqualifier.case1;

import com.example.springqualifier.case1.beans.AnotherService;
import com.example.springqualifier.case1.beans.DefaultService;
import com.example.springqualifier.case1.beans.GenericService;
import com.example.springqualifier.case1.beans.MyBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 5/2/2022.</p>
 * <p>Project: spring-qualifier</p>
 * *
 */
@Configuration
public class BeansConfiguration {

    @Bean
    @Qualifier("main")
    public GenericService<?> mainService() {
        return new AnotherService();
    }

   /* @Bean
    public DefaultService defaultService() {
        return new DefaultService();
    }*/
    @Bean
    public MyBean mybean(@Qualifier("main") GenericService<Object> genericService) // error
    {
        return new MyBean(genericService);
    }
}
