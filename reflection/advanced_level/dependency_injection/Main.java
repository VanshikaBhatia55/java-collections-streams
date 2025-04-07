package java_collections_streams.reflection.advanced_level.dependency_injection;

public class Main {
    public static void main(String[] args) throws Exception{
        DIContainer container = new DIContainer();
        UserService userService = container.getInstance(UserService.class);

        userService.performAction();
    }
}
