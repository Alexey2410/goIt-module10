package org.goit.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonDataWriter {

    public <T> void write(List<T> data, String fileName){
        String result = convertToJson(data);

        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte[] buffer = result.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private <T> String convertToJson(List<T> data){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type collectionType = new TypeToken<T>(){}.getType();
        String json = gson.toJson(data, collectionType);
        return json;
    }

}
