package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStaticField;
    public static int staticField;

    public Product() {}

    public void NonStaticMethod() {

        System.out.println("Product 클래스의 nonStaticMethod 호출함");
    }

    public static void StaticMethod() {

        System.out.println("Product 클래스의 StaticMethod 호출함");
    }

    public abstract void abstMethod();
}
