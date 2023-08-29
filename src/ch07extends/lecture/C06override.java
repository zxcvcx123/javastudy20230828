package ch07extends.lecture;

public class C06override {
    public static void main(String[] args) {
        MyClass06 o1 = new MyClass06();
        o1.method10();

        MySubClass061 o2 = new MySubClass061();

    }

}

class MyClass06 {

    public void method10() {
        System.out.println("부모클래스의 메소드");
    }
}

class MySubClass061 extends  MyClass06 {
    @Override //컴파일시 재정의한 메소드인지 검증
    public void method10() {
        System.out.println("자식클래스의 메소드");
    }
}
