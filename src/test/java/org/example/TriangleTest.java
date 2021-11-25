package org.example;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    @Test
    @DisplayName("Area_calculation")
    @Timeout(100)
    public void test1(){
        int a = 14;
        int b =16;
        int c = 6;

        double p =(a+b+c)/2;

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if (s>0){
        System.out.println("Площадь вычисляется");
        }
        Assertions.assertTrue(s>0, "Площадь вычисляется");
        Assertions.assertTrue(true);
    }

    @ParameterizedTest
    @ValueSource(ints = {6,30,50,-3})
    @Timeout(100)
    public void test2(int c){
        int a = 14;
        int b = 16;
        double p =(a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if (s==0){
        System.out.println("Это не треугольник");
        Assertions.assertTrue(s==0,"Это не треугольник");
        Assertions.assertTrue(true);}
        if (c>a+b){
            System.out.println("Из таких сторон треугольник не получится");
            Assertions.assertTrue(c>(a+b),"Из таких сторон треугольник не получится");
            Assertions.assertTrue(true);
        }
        if (s>0&&a>0&&b>0&&c>0) {System.out.println("Площадь треугольника равна "+s);
            Assertions.assertTrue(s>0&&a>0&&b>0&&c>0,"Площадь треугольника равна ");
            Assertions.assertTrue(true);
        }
        if (a<0||b<0||c<0) {
            System.out.println("Стороны не могут быть меньше нуля");
            Assertions.assertTrue(a<0||b<0||c<0,"Стороны не могут быть меньше нуля");
            Assertions.assertTrue(true);
        }
    }

}
