package org.goit.task2;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class StringToObjectConvertor {

    public static <T> T createObjectFromString(Class<T> clazz, String value1, Integer value2) {
        try {
            Constructor<T> constructor = clazz.getDeclaredConstructor(String.class, Integer.class);
            return constructor.newInstance(value1, value2);
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate object", e);
        }
    }

    public static <T> List<T> convert(Class<T> clazz, List<String[]> data){
        List<T> result = new ArrayList<T>();
        for(String [] values : data ){
            result.add(createObjectFromString( clazz, values[0], Integer.valueOf(values[1])));
        }

        return result;
    }
}
