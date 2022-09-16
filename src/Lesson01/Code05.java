package Lesson01;

import java.util.Arrays;

public class Code05 {
    public static void main(String[] args) {
        // declarethe array
        int [] grades;

        //allocate memory for 5 dices
        grades = new int [5];

        // 위의 두 라인은 다음과 같이 작성할 수 있다.
        // int [] grades = new int [5];

        grades[0] = 100;
        grades[1] = 76;
        grades[2] = 92;
        grades[3] = 93;
        grades[4] = 94;

        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades[4]);
    }
}
