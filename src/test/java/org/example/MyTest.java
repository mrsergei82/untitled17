package org.example;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void someTest(){
        System.out.println("My Test");
    }

    @RepeatedTest(3)
    void myTest(){
        System.out.println("Test2");
    }
}
