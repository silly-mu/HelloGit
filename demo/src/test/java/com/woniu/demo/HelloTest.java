package com.woniu.demo;

import org.junit.Test;

public class HelloTest {
    @Test
    public void test(){
        Hello h = new Hello();
        String s = h.sayHello("Maven");
        System.out.println(s);
    }
}
