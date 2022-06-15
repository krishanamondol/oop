package com.mondal.inheritance_rules.method_dispatch;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        ref = a;
        ref.method();
        B krishna;
        krishna = b;
        krishna.method();
        C mondal;
        mondal = c;
        mondal.method();
    }
}
