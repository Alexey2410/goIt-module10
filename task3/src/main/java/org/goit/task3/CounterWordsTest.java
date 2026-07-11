package org.goit.task3;

import java.util.*;

public class CounterWordsTest {

    static void main(String[] args) {

        FileWordsReader wordsReader = new FileWordsReader();

        Map<String, Integer> uniqueWords = wordsReader.readWords(
                "../task3/src/main/resources/in/words.txt");


        List<Map.Entry<String, Integer>> list = WordsSorter.sortUniqueWord(uniqueWords);
        for(Map.Entry<String, Integer> line : list){

            System.out.println(line.getKey() + " " + line.getValue());
        }

//        for (Map.Entry<String, Integer> uw :
//                uniqueWords.entrySet()) {
//            System.out.println(uw.getKey() + " " + uw.getValue());
//        }
    }
}
