package org.example;

public class Triangle {



    public void areaTriangle(int a, int b, int c) {
        double p =(a+b+c)/2;

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);

    }



}
