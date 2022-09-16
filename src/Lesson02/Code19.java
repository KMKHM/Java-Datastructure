package Lesson02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
    public static void main(String[] args){
        //String fileName = "input.txt";
        String [] name = new String [1000]; // 문자열 배열 선언
        String [] number = new String[1000];
        int n = 0;

        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            while (inFile.hasNext()) { // 더 읽을 것이 남아있을 때 까지 detect end of file
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();

        } catch (FileNotFoundException e) {
            // input.txt가 없으면 이 블록을 실행한다.
            System.out.println("No file");
            //return 현재 실행되고 있는 함수를 종료 => main 함수를 종료하므로 프로그램 종료와 같다.
            System.exit(1);
        }

        for (int i=0; i<n; i++) {
            System.out.println(name[i] + " :" + number[i]);
        }
    }
}
