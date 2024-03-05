package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.ExceptionTest;
import com.ohgiraffers.section02.userexception.exception.MoneyNegativeExecption;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyExecption;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeExecption;

import java.util.regex.PatternSyntaxException;

public class Application2 {
    public static void main(String[] args) throws Exception {

        ExceptionTest et = new ExceptionTest();

        try {

            et.checkEnoughMoney(40000, 30000);
        }catch (NotEnoughMoneyExecption e) {

            System.out.println("NotEnoughMoneyException 발생!");
            System.out.println(e.getMessage());
        }catch (PriceNegativeExecption e) {

            System.out.println("PriceNegativeException 발생!");
            System.out.println(e.getMessage());
        }catch (MoneyNegativeExecption e) {

            System.out.println("MoneyNegativeException 발생!");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally 블럭 내용 동작!");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
