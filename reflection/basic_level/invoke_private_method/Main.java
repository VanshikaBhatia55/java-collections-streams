package java_collections_streams.reflection.basic_level.invoke_private_method;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Class<?> cls =  calculator.getClass();

        Method method = cls.getDeclaredMethod("multiply",int.class,int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(calculator,5,10);
        System.out.println("Multiplication Result: " + result);


    }
}
