package org.goit.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileWordsReader {

    public Map<String, Integer> readWords(String fileName){
        Map<String, Integer> result = new HashMap<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        if(result.containsKey(word)){
                            result.put(word, result.get(word) + 1);
                        }
                        else {
                            result.put(word, 1);
                        }
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
