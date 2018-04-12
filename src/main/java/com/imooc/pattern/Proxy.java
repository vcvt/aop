package com.imooc.pattern;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void hello() {

    }

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("before");
        try {
            realSubject.request();
        } catch (Exception e) {
            System.out.println("ex: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("finally");
        }
    }
}
