package com.selfStudy.java;

import com.selfStudy.Customer;

import java.util.ArrayList;

public class HelloWorld {

    private static final Customer cust = new Customer();
    public static final int NUM = 1;

    public static void main(String[] args) {
        int suni = 1;
        System.out.println("helloworld!!" + suni);
        String[] arr = new String[]{"tom", "jerry", "lei"};
        for (String s : arr) {
            System.out.println(s);
        }

        ArrayList<Number> list = new ArrayList<Number>();
        list.add(123);
        list.add(1452);
        list.add(442);
        list.add(745645);

        for (Number number : list) {
            System.out.println(number);
        }
        testMain();
    }

    public static void testMain(){
        System.out.println("测试类");
    }
}
