package java_collections_streams.annotation.custom.caching_system;

public class Main {
    public static void main(String[] args) {
        MathService service = new MathService();

        Object result1 = CacheHandler.invokeWithCache(service, "expensiveComputation", 4);
        System.out.println("Result: " + result1);

        Object result2 = CacheHandler.invokeWithCache(service, "expensiveComputation", 4);
        System.out.println("Result: " + result2);

        Object result3 = CacheHandler.invokeWithCache(service, "expensiveComputation", 6);
        System.out.println("Result: " + result3);
 }
}
