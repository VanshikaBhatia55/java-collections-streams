package java_collections_streams.reflection.intermediate_level.dynamic_method_invocation;

import reflection_annotation.reflection.intermediate.dynamic_method_invocation.MathOperations;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Operation name: (add, subtract, multiply)");
        String methodName = scanner.nextLine();
        double input1 = scanner.nextDouble();
        double input2 = scanner.nextDouble();
        MathOperations operation = new MathOperations();
        Method method = operation.getClass().getDeclaredMethod(methodName, double.class, double.class);
        System.out.println(method.invoke(operation, input1, input2));
    }
}
