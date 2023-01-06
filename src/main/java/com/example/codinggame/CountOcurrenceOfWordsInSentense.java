package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
//@Component
public class CountOcurrenceOfWordsInSentense implements CommandLineRunner {

    /**
     * Print repeating words and their frequency in a given string.
     * ignore case and extra spaces and comma.
     *  "Here is a string of words, Words are repeated here"
     *  Here: 2
     *  is: 1
     *  words: 2
     *      *
     *  ANOTHER DESCRIPTION OF THE SAME PROBLEM by another guy
     *  In a given string (sentence) extract all the words
     *  that were repeated and how many time they were repeated,
     *  your search must ignore the case.
     * @param val
     * @param arr
     * @return
     */
    public static int count(String val, String[] arr){
        int count = 0;
        for(String s: arr){
            if(s.equals(val)){
                count++;
            }
        }
        return count;
    }
    public static void getRepeatedWords(String s){
        String[] splited = s.replaceAll(",", "").toLowerCase().split("\\s+");
        HashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        for (String ss : splited) {
            int count = count(ss, splited);
            hm.put(ss, count);
        }
        System.out.println(hm.toString());
    }
    @Override
    public void run(String... args) throws Exception {
        getRepeatedWords("Here is a string of   words  , Words are repeated here");
    }
}
