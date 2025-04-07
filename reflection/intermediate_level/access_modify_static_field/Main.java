package java_collections_streams.reflection.intermediate_level.access_modify_static_field;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("java_collections_streams.reflection.intermediate_level.access_modify_static_field.Configuration");
        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, "123AB");
        System.out.println(field.get(null));
    }
}
