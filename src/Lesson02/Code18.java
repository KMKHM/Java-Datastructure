package Lesson02;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int[n];

        for (int i=0; i<n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        bubbleSort(n, data);
    }

    // 정수 배열은 다음과 같이 넣는다.
    // 정렬만 하는 것이 임무이므로 어떠한 값을 return할 필요없다.
    static void bubbleSort(int n, int [] array) {
        for (int i=n-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (array[j] > array[j+1]) {
                    swap(array[j], array[j+1]);
                }
            }
        }
    }

    static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
