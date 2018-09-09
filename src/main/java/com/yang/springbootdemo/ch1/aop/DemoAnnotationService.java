package com.yang.springbootdemo.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截式的add操作")
    public void add() {}
}
