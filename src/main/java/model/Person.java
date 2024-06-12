package model;

public class Person { //extends Object 생략됨 = to.String()생략
    private String name;
    private int age;

    //디폴트 생성자
    public Person (){}

    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() { //부모가 가지고 있는 toString 재정의
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
