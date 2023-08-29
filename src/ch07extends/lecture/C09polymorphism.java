package ch07extends.lecture;

public class C09polymorphism {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();

        o2.method();



    }
}

class MyClass09 {
    public void method(){
        System.out.println("부모 메소드");
    }
}

class MySubClass09 extends  MyClass09 {

    @Override
    public void method() {
        System.out.println("자식 메소드");
    }
}