package com.example.springqualifier.case2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration public class AutowireProviderJava {
    @Bean public <T> GenFaceTopJava<T> genTopJ() { return () -> "GenFaceTop<T>"; }
    @Bean public <T> GenFaceMiddleJava<T> genMidJ() { return () -> "GenFaceMid<T>"; }
    @Bean public GenFaceMiddleJava<Boolean> genMidJFix() { return () -> "GenFaceMid<Boolean>"; }
    @Bean public AutowireParadeJava paradeJ() { return new AutowireParadeJava(); }
} 