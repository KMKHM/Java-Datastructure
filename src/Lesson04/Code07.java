package Lesson04;

import java.util.Scanner;

public class Code07 {

    static Polynomial2 [] polys = new Polynomial2[100]; // 다항식을 저장할 배열
    static int n = 0; // 현재 polys에 저장된 다항식의 개수

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("$ ");
            String command = kb.next();

            if (command.equals("create")) {
                char name = kb.next().charAt(0); // 문자열을 입력받고 문자로 인식받기.

                polys[n] = new Polynomial2(); // polys는 참조 변수들의 배열
                polys[n].name = name;
                polys[n].terms = new Term2[100];
                polys[n].nTerms = 0;
                n++;
            } else if (command.equals("add")) { // add f 2 3
                char name = kb.next().charAt(0); // add할 다항식의 이름
                int index = find(name);

                if (index == -1) {
                    System.out.println("No Such Polynomial exits");
                } else {
                    int c = kb.nextInt();
                    int e = kb.nextInt();
                    polys[index].addTerm(c, e);
                }

            } else if (command.equals("calc")) {
                char name = kb.next().charAt(0);
                int index = find(name);

                if (index == -1) {
                    System.out.println("No Such Polynomial exits");
                } else {
                    int x = kb.nextInt();
                    int result = polys[index].calcPolynomial(x);
                    System.out.println(result);
                }
            } else if (command.equals("print")) {
                char name = kb.next().charAt(0);
                int index = find(name);

                if (index == -1) {
                    System.out.println("No Such Polynomial exits");
                } else {
                    polys[index].printPolynomial();
                }
            } else if (command.equals("exit")) {
                break;
            }
        }


        kb.close();

    }

    private static int find(char name) { // 다항식에 있는 거라고 보기 힘든 메서드이므로 놔둔다.
        for (int i=0; i<n; i++) {
            if (polys[i].name == name) {
                return i;
            }
        }
        return -1;
    }
}
