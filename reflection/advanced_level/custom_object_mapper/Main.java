package java_collections_streams.reflection.advanced_level.custom_object_mapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Vanshika");
        data.put("age", 22);
        data.put("email", "vanshika@gmail.com");

        User user = ObjectMapper.toObject(User.class, data);
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
    }
}
