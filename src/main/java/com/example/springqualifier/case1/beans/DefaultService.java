package com.example.springqualifier.case1.beans;

/**
 * *
 * <p>Created by irina on 5/2/2022.</p>
 * <p>Project: spring-qualifier</p>
 * *
 */
public class DefaultService implements GenericService<Object> {
    @Override
    public void serviceMethod(Object var1) {
        System.out.println("default service method with "+ var1);
    }
}
