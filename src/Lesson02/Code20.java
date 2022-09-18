package Lesson02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

    //전역 변수: Code20이라는 클래스 내에서 사용가능
    static String [] name = new String [1000];
    static String [] number = new String[1000];
    static int n = 0;

    public static void main(String[] args){

        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            while (inFile.hasNext()) { // 더 읽을 것이 남아있을 때 까지 detect end of file
                name[n] = inFile.next();
                number[n] = inFile.next();
                n++;
            }

            inFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }

        bubbleSort(); // 전역 변수이므로 매개변수 넘겨줄 필요가 없다

        for (int i=0; i<n; i++) {
            System.out.println(name[i] + " :" + number[i]);
        }
    }

    static void bubbleSort() {
        for (int i=n-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (name[j].compareTo(name[j+1]) > 0) { // name은 문자이므로 부등호로 비교 못 한다....
                    // compareTo
                    //swap name[j] and name[j+1]
                    String tmp = name[j];
                    name[j] = name[j+1];
                    name[j+1] = tmp;

                    tmp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = tmp;
                }
            }
        }
    }
}
