package java_collections_streams.reflection.basic_level.class_information;

import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String className = input.next();

        Class<?> cls = Class.forName(className);

        Method[] method = cls.getDeclaredMethods();
        Field[] field = cls.getDeclaredFields();
        Constructor[] constructor = cls.getDeclaredConstructors();

//        Constructor constructor = cls.getDeclaredConstructor(String.class, int.class);
//        System.out.println(constructor.getName());

        for (Field fields : field) {
            System.out.println(fields.getName());
        }
        for (Constructor constructors : constructor) {
            System.out.println(constructors.getName());
        }
        for (Method methods : method) {
            System.out.println(methods.getName());
        }
    }
}
