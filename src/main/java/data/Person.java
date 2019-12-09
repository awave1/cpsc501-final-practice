package data;

public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void setPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}