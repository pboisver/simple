package com.agilyze.simple.pojo;

public class SimplePojoApplication {

    public static void main(String[] args) {

        System.out.println("Starting up simple POJO application");

        MyPojoService service = new MyPojoService(args);

        service.sayHi();
    }
}
