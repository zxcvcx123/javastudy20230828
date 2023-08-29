package ch06class;

public class C07method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        MyClass07 o2 = new MyClass07();
        o1.mymethod1();
        o2.mymethod1();

        o1.name = "자바";
        o2.name = "스프링";

        o1.printName();
        o2.printName();
    }
}

class MyClass07 {

    String name;

    void printName() {
        System.out.println("이름: " + name);
    }

    void mymethod1() {
        System.out.println("MyClass07 클래스에 mymethod1() 메소드가 실행 됐습니다.");
    }

}
