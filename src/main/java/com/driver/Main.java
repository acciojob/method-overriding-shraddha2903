package com.driver;

public class Main {
    public static void main(String args[])
    {
        B ob_b = new B();
        System.out.print(ob_b.meth());
    }
    public static class A {
        public String meth()
        {
            return "Invoking method from class A";
        }

    }
    public static class B extends A{
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";

        }
    }
}