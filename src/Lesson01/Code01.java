package Lesson01;

public class Code01 {
    // class 밖에서는 어느것도 선언할 수 없다.
    static int num; // maing 함수 밖에서 선언(전역 변수), Class 바깥에서는 선언 못한다.
    // static 키워드에 대해서는 후에 이야기.
    // 당분간 함수 외부의 변수에 대해서는 static 키워드를 넣어주도록 하자.
    public static void main(String[] args) {

        int anotherNum = 5; //main 함수안에서 선언(지역 변수)
        num = 2;

        System.out.println(num + anotherNum); // 여기의 +는 정수끼리
        System.out.println("Num: " + num); // 문자열 + 정수 : 문자열이 하나라도 있다면 모두 문자열로 합쳐준다.
        System.out.println("anotherNum: " + anotherNum);
        System.out.println("Sum: " + num + anotherNum); // left associativity에 의해 25가 출력(왼쪽이 먼저 연산)
        System.out.println("Sum: " + (num + anotherNum)); // 괄호에 의해 7 이라는 값이 정상적으로 출력된다.
    }
}
