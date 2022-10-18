package Lesson03;

public class Code01_2 {
    public static void main(String[] args) {
       // 객체의 주소를 참조 변수 first에 넣는다.
        Person1 first = new Person1() ; // 참조 변수 first 선언, 이름이 없는 Person1 타입의 객체 생성
        first.name = "John";
        first.number = "01091518299";

        // second라는 새로운 참조 변수 선언
        Person1 second = first; // second의 참조 변수 값(주소)에 first의 참조 변수 값을 넣는다.
        second.name = "Tom";
        second.number = "01091528299";


        Person1 [] members = new Person1[10]; //배열의 각 칸도 참조 변수이다.
        members[0] = first;
        members[1] = second;
//        members[2].name = "first";
//        members[2].number = "first";
        members[2] = new Person1();
        members[2].name = "david";
        members[2].number = "1234";
        System.out.println("Name: " + members[0].name + ", Number: " + members[0].number);
        System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
        System.out.println("Name: " + members[2].name + ", Number: " + members[2].number);
    }
}
