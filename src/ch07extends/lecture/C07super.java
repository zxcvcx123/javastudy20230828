package ch07extends.lecture;

public class C07super {
    public static void main(String[] args) {
        MySubClass07 o1 = new MySubClass07();
        o1.method1();
    }
}

class MyClass07 {

    void method1(){
        System.out.println("부모 클래스 메소드 기능");
    }
}

class MySubClass07 extends MyClass07 {

    @Override
    void method1() {
        if(true) {
            super.method1(); // 부모 클래스의 메소드 호출
            //System.out.println("부모 클래스 메소드 기능은 유지");
        }
        System.out.println("자식 클래스의 재정의한 메소드");
    }
}