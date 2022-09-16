package Lesson01;

import java.util.Scanner;

public class Code13 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int [] data = new int[n];

        for(int i=0; i<n; i++) {
            data[i] = kb.nextInt();
        }
        kb.close();

        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                int val = 0;
                for (int k=i; k<j; k++){
                    val = val*10 + data[k];
                }
                boolean isPrime = true;
                for(int k=2; k*k<val && isPrime; k++){
                    if(val%k ==0) {
                        isPrime= false;
                    }
                }
                if (isPrime && val>sum){
                    sum = val;
                }
            }
        }

        if(sum>0){
            System.out.println(sum);
        } else{
            System.out.println("No Prime Number!");
        }
    }
}
