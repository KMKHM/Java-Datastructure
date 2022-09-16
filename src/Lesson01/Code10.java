package Lesson01;

public class Code10 {
    public static void main(String[] args) {
        for (int n=1; n<=100000; n++){
            boolean isPrime = true;
            for (int i=2; i*i<=n; i++){
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n);
            }
        }
    }

}
