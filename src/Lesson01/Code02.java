package Lesson01;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        int number = 123;

        Scanner kb = new Scanner(System.in); // kb라는 이름의 Scanner를 만들었다.

        System.out.print("Please enter an Integer: ");

        int input = kb.nextInt();

        if (input == number) {
            System.out.println("Numbers match! :-)");
        } else {
            System.out.println("Numbers do not match! :-(");
        }

        kb.close();
    }
}
