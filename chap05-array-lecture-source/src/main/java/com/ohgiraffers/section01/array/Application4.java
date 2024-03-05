package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application4 {

    public static void main(String[] args) {

        /*
        * [카드뽑기]
        * 1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND 를 저장
        * 2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 를 저장
        * 3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다.
        * 4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다.
        *
        * ====== 출력예시 ======
        * 당신이 뽑은 카드는 DIAMOND 9 카드 입니다.
        * */

        String mark[] = new String[]{"SPADE" , "CLOVER" , "HEART" , "DIAMOND"};
        String num[] = new String[]{"1","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        int randomMark = (int)(Math.random() * mark.length);
        int randomNum = (int)(Math.random() * num.length);


        System.out.println("당신이 뽑은 카드는 " + mark[randomMark] + " " + num[randomNum] + " 입니다.");

    }
}
