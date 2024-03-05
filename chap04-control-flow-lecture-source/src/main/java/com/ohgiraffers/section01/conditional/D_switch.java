package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void simpleSwitchStatment(){

        /*
        * [switch문 표현식]
        * switch(비교할변수) {
        *   case 비교값1 : 비교할변수의 값 == 비교값1 인 경우 실행할 구문 ; break;
        *   case 비교값2 : 비교할변수의 값 == 비교값2 인 경우 실행할 구문 ; break;
        *   default : 위 case에 모두 해당하지 않는 경우 실행할 구문; break;
        * }
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 입력 : ");
        int firstNum = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();

        System.out.print("연산 기호 입력(+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        /* 연산 결과를 저장할 변수 */
        int result = 0;

        switch (op) {

            case '+' : result = firstNum + secondNum; break;
            case '-' : result = firstNum - secondNum; break;
            case '*' : result = firstNum * secondNum; break;
            case '/' : result = firstNum / secondNum; break;
            case '%' : result = firstNum % secondNum; break;

            default:
                System.out.println("잘못된 연산자를 입력하였습니다."); break;
        }
        System.out.println(firstNum + " " + op + " " + secondNum + " = " + result);
    }

    public void switchVendingMachine() {

        /* <switch-case>문 이용 실습
        *   1. Scanner를 이용해 음료 이름(String)과 갯수(int)를 입력받는다.
        *   2. switch-case 문을 사용해 전체 가격을 구한다.
        *   3. ['음료이름'을 '개수'개 선택하셨습니다. '가격'을 투입해주세요. ]
        *       위와 같이 출력되도록 한다.
        *
        * */

        System.out.println("======Ohgiraffers Vending Machine======");

        /* 코카콜라 1,700원 / 환타 1,200원 / 하늘보리 1,000원 / 핫식스 2,000원 */
        System.out.println("코카콜라    환타    하늘보리    핫식스");
        System.out.println("=======================================");

        Scanner sc = new Scanner(System.in);


        System.out.print("음료이름을 골라주세요 : ");
        String name = sc.nextLine();

        System.out.print("갯수를 선택해주세요 : ");
        int num = sc.nextInt();

        int result = 0;

        switch (name){

            case "코카콜라" : result = 1700 * num; break;
            case "환타" : result = 1200 * num; break;
            case "하늘보리" : result = 1000 * num; break;
            case "핫식스" : result = 2000 * num; break;

            default:
                System.out.println("잘못된 음료 이름을 고르셨습니다."); return;

        }
        System.out.println(name + "을 " + num + "개 선택하셨습니다." + result +"원을 투입해주세요.");

    }
}
