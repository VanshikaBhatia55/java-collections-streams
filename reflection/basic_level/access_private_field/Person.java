package java_collections_streams.reflection.basic_level.access_private_field;

public class Person {
    private int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
