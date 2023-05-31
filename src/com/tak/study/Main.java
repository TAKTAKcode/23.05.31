package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        //x축 최소거리 ㅡ
        int xMin = Math.min(x, w-x);

        //y축 최소거리 ㅣ
        int yMin = Math.min(y, h-y);

        // x와 y축 최소거리 중 가장 작은 값
        System.out.println(Math.min(xMin, yMin));

    }

}
