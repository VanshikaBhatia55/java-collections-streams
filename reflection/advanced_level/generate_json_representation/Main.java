package java_collections_streams.reflection.advanced_level.generate_json_representation;

public class Main {
    public static void main(String[] args) throws Exception{
        User user = new User("vanshika", 22, "vanshika@gamil.com");
        String json = JSONRepresentation.convertIntoJSON(user);
        System.out.println(json);
    }
}
