package org.goit.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileDataReader {

    public ArrayList<String[]> readData(String fileName){
        ArrayList<String[]> result = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean skippedFirst = false;
            while ((line = reader.readLine()) != null) {
                if(!skippedFirst){
                    skippedFirst = true;
                    continue;
                }
                String[] parts = line.split("\\s+");
                result.add(parts);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
