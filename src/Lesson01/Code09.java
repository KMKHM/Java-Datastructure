package Lesson01;

import java.util.Arrays;
import java.util.Scanner;

public class Code09 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] nums = new int[n];

        for(int i = 0; i<n; i++) {
            nums[i] = kb.nextInt();
        }

        kb.close();

        int tmp = nums[n-1];
        for(int i = n-2; i>=0; i--) {
            nums[i+1] = nums[i];
        }
        nums[0] = tmp;

        System.out.println(Arrays.toString(nums));
    }
}
