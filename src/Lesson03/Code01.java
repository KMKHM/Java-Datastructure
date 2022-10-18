package Lesson03;

public class Code01 {
    public static void main(String[] args) {
        Person1 a;
        a = new Person1();
        a.name = "John";
        a.number = "01091518299";

        System.out.println("Name: " + a.name + ", Number: " + a.number);

        Person1 [] members = new Person1[10];
        members[0] = a;
        members[1] = new Person1();
        members[1].name = "David";
        members[1].number = "010915258299";

        System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
    }

}
