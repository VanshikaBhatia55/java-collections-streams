package java_collections_streams.reflection.advanced_level.custom_logging_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();

        Greeting proxyGreeting = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingInvocationHandler(greeting)
        );
        proxyGreeting.sayHello("Harshit");
    }
}
