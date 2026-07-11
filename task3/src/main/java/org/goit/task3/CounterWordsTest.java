package org.goit.task3;

import java.util.*;

public class CounterWordsTest {

    static void main(String[] args) {

        FileWordsReader fileValidator = new FileWordsReader();

        Map<String, Integer> uniqueWords = fileValidator.readWords(
                "../task3/src/main/resources/in/words.txt");


        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(uniqueWords.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for(Map.Entry<String, Integer> line : list){

            System.out.println(line.getKey() + " " + line.getValue());
        }

//        for (Map.Entry<String, Integer> uw :
//                uniqueWords.entrySet()) {
//            System.out.println(uw.getKey() + " " + uw.getValue());
//        }
    }
}
