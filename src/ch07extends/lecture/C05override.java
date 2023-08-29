package ch07extends.lecture;

public class C05override {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05();

        o1.method1();

        MySubClass051 o2 = new MySubClass051();
        o2.method1();
        o2.method2();

    }
}

class MyClass05 {
    public void method1() {
        System.out.println("어떤 기능");
    }
}

class MySubClass051 extends MyClass05 {

    public void method1() {
        System.out.println("다시 정의함");
    }

    public void method2() {
        System.out.println("추가된 기능");
    }
}