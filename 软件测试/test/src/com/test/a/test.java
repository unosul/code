package com.test.a;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        try{
            System.out.println("请输入两个数（50以内）");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a >= 0 && a <= 50 && b >= 0 && b <= 50) {
                System.out.println("请输入符号（+，-）");
                String text = scanner.next();
                if (text.equals("+")) {
                   t =  a + b;
                    System.out.println(a + text + b + " = " + t);
                } else if (text.equals("-")) {
                    if (a >= b){
                        t = a - b;
                        System.out.println(a + text + b + " = " + t);
                    }else {
                        t = b -a;
                        System.out.println(b + text + a + " = " + t);
                    }
                }else {
                    System.out.println("符号有误");
                }
            }else {
                System.out.println("数字有误");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
