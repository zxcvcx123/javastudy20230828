package ch07extends.lecture;

public class C08super {
    public static void main(String[] args) {
        MySubClass08 o1 = new MySubClass08();
        o1.method();
    }
}

class MyClass08 {
    void method() {
        System.out.println("부모 메소드");
    }
}

class MySubClass08 extends MyClass08 {
    @Override
    void method(){
        System.out.println("자식의 메소드");
        super.method();
    }
}