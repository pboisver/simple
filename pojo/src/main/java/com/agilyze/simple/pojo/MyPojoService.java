package com.agilyze.simple.pojo;

public class MyPojoService {

    private final String[] args;

    public MyPojoService(String[] args) {

        this.args = args;
    }


    public void sayHi() {

        for (String buddy : args) {

            final String greeting = String.format("Hey there, %s", buddy);

            System.out.println(greeting);

        }

    }
}
