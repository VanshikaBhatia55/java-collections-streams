package java_collections_streams.reflection.basic_level.access_private_field;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {

        Person person1 = new Person(22,"Vanshika");

        Class<?> cls = person1.getClass();

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person1, 23);

        System.out.println(person1.getAge());
    }
}
