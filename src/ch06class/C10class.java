package ch06class;

public class C10class {

}

class MyClass10 {

    //특별한 이유가 없다면
    //필드는 private 으로
    //관련된 메소드를(getter, setter) public으로 작성
    //읽기전용으로 하고 싶으면 getter 만 쓰기 전용으로 하고싶으면 setter만 목적에 맞게 사용
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
