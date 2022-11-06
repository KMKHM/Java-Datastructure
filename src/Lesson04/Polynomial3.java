package Lesson04;

public class Polynomial3 {
    public char name; // 다항식의 이름
    public int nTerms = 0; // 다항식을 구성하는 항의 개수
    public Term3[] terms; // 다항식을 저장할 배열

    public Polynomial3() {
        nTerms = 0;
        terms = new Term3 [100];
    }

    public Polynomial3(char name) { // 위의 것과 생성자 이름이 같아도 되고 구분만 할 수 있으면 된다.
        this.name = name; // this. 은 그 객체를 가리킨다. 4 라인의 name을 가라킨다.
        nTerms = 0;
        terms = new Term3 [100];
    }

    public int calcPolynomial(int x) {
        int result = 0;
        for (int i=0; i<nTerms; i++) {
            result += terms[i].calcTerm(x);
        }
        return result;
    }



    public void printPolynomial() {
        for (int i=0; i<nTerms; i++) {
            terms[i].printTerm();
            System.out.print("+");
        }
        System.out.println();
    }

    public void addTerm(int c, int e) {
        int index = findTerm(e);

        if (index != -1) {
            terms[index].coef += c; // -5x^3 + 3x^3
        } else {
            int i = nTerms -1; // 마지막 항
            while (i>=0 && terms[i].expo < e) {
                terms[i+1] = terms[i];
                i--;
            }
            terms[i+1] = new Term3(c, e);
            nTerms++;
        }
    }

    public int findTerm(int e) {
        for (int i=0; i<nTerms && terms[i].expo>=e; i++) {
            if (terms[i].expo == e) {
                return i;
            }
        }
        return -1;
    }
}
