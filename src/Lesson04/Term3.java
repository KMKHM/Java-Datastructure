package Lesson04;

public class Term3 {
    public int coef;
    public int expo;

    public Term3(int c, int e) {
        coef = c;
        expo = e;
    }

    public int calcTerm(int x) { // 계산
        return (int)(coef * Math.pow(x, expo));
    }

    public void printTerm() { // -x^2 => -1x^2
        System.out.print(coef + "x^" + expo);
    }
}
