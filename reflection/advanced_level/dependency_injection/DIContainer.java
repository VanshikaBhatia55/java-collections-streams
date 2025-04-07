package java_collections_streams.reflection.advanced_level.dependency_injection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public <T> T getInstance(Class<T> clazz) throws Exception{
        if(instances.containsKey(clazz)){
            return clazz.cast(instances.get(clazz));
        }

        T instance = clazz.getDeclaredConstructor().newInstance();
        instances.put(clazz, instance);

        for(Field field : clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(Inject.class)){
                Class<?> fieldType = field.getType();
                Object dependency = getInstance(fieldType);
                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }
        return instance;
    }
}
