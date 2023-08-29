package ch06class;

public class C06class {

    public static void main(String[] args) {

        MyClass05 mc1 = new MyClass05();
        MyClass05 mc2 = new MyClass05();
        mc1.myage(27);
        mc2.myage(28);
    }

}

class MyClass05 {
    //속성 fields
    int age;
    static String model;

    //기능
    static void myage(int age){
        System.out.println("나의 나이는 " + age + "살 입니다.");

    }
}