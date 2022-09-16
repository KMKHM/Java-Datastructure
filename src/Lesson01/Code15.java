package Lesson01;

import java.util.Arrays;
import java.util.Scanner;

public class Code15 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] data = new int[n];

        for(int i=0; i<n; i++) {
            int tmp = kb.nextInt();
            int j = i - 1;
            System.out.println(i+" "+j);
            while(j>=0 && data[j]>tmp) {
                data[j+1] = data[j];
                System.out.println(data[j+1]+" "+data[j]);
                System.out.println(Arrays.toString(data));
                j--;
            }
            data[j+1] = tmp;
            System.out.println(j);
            System.out.println(Arrays.toString(data));
        }

        kb.close();

    }
}
