package org.goit.task2;

import java.util.ArrayList;
import java.util.List;

public class TextToJsonConvertorTest {
    public static void main(String[] args) {
        FileDataReader reader = new FileDataReader();

        ArrayList<String[]> data = reader.readData(
                "../task2/src/main/resources/in/file.txt"
                );

        List<User> users = StringToObjectConvertor.convert(User.class, data);

        JsonDataWriter writer = new JsonDataWriter();
        writer.write(users,
                "../task2/src/main/resources/out/user.json");
    }
}
