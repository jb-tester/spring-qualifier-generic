package com.example.springqualifier.case2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class AutowireParadeJava {
    @Autowired public GenFaceMiddleJava<Boolean> fieldGenMiddleC;
    @Autowired public GenFaceMiddleJava<Integer> fieldGenMiddleD; // Inspection error on field name.
    @Autowired @Qualifier("genTopJ") public GenFaceTopJava<Integer> fieldGenTopE; // Inspection error on qualifier name.
} 