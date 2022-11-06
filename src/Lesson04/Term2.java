package Lesson04;

public class Term2 { // 항
    public int coef; // 계수: 정수
    public int expo; // 차수: 음이 아닌 정수

    public int calcTerm(int x) { // 계산
        return (int)(coef * Math.pow(x, expo));
    }

    public void printTerm() { // -x^2 => -1x^2
        System.out.print(coef + "x^" + expo);
    }
}
