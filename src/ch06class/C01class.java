package ch06class;

class MyClass01 {
    // instance fields
    // 인스턴스가 가져야하는 속성들

    // instance methods
    // 인스턴스가 가져야 하는 기능들

    int age;
}
public class C01class {

    public static void main(String[] args) {
        MyClass01 mc1 = new MyClass01();
        mc1.age = 30;
        System.out.println(mc1.age);

        MyClass01 mc2 = mc1;

        System.out.println(mc2.age);


    }

}
