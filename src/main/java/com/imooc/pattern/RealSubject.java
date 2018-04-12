package com.imooc.pattern;

public class RealSubject implements Subject {
    @Override
    public void hello() {
        System.out.println("real subject execute hello");
    }

    @Override
    public void request() {
        System.out.println("real subject execute request");
    }
}
