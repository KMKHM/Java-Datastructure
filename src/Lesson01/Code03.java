package Lesson01;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        String str = "Hello";
        String input = null;

        Scanner kb = new Scanner(System.in);
        System.out.print("please type a String: ");

        // 문자열 입력 받기 => Hello, World를 입력해도 Hello,만 인식한다.
        input = kb.next();
        // == 연산자는 Primitive Type에 대해서만 검사가 가능하다.
        if (str.equals(input)) {
            System.out.println("String match! :-");
        } else {
            System.out.println("String do not match! :-(");
        }

        kb.close();
    }
}
