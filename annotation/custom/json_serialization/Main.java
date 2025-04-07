package java_collections_streams.annotation.custom.json_serialization;

public class Main {
    public static void main(String[] args) {
        User user = new User("vanshika", 22, "vanshika@gmail.com");
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
