package com.mondal.Inheretance;

public class A {
    int a = 20;
    static int b = 30;
    A(){
        System.out.println("Class A Constructor");
    }
    static  {
        System.out.println("Class A' Static Block");
    }
    {
        System.out.println("Class A Instance Block");
    }
}
