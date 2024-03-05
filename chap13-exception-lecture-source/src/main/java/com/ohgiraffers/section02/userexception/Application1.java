package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.ExceptionTest;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(50000, 30000);
//            et.checkEnoughMoney(-50000, 30000);
            et.checkEnoughMoney(50000, -30000);
//            et.checkEnoughMoney(30000, 50000);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
