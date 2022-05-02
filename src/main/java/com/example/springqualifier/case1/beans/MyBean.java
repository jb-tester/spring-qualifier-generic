package com.example.springqualifier.case1.beans;

/**
 * *
 * <p>Created by irina on 5/2/2022.</p>
 * <p>Project: spring-qualifier</p>
 * *
 */
public class MyBean {
    public MyBean(GenericService<Object> genericService) {
        genericService.serviceMethod("foo");
    }
}
