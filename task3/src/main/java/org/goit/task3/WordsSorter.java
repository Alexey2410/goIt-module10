package org.goit.task3;

import java.util.*;

public class WordsSorter {

    public static List<Map.Entry<String, Integer>> sortUniqueWord(Map<String, Integer> uniqueWords) {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(uniqueWords.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        return list;
    }

}
