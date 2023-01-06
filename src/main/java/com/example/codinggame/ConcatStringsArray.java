package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class ConcatStringsArray implements CommandLineRunner {
    /**
     * Concatanation d'un tableau de String en
     * Utilisant StringBuilder
     * @param strings
     * @return
     */
    public static String concat(String[] strings){
        StringBuilder sb = new StringBuilder();
        for(String s : strings){
            sb.append(s);
        }
        return sb.toString();
    }
    @Override
    public void run(String... args) throws Exception {
        String[] str = {"str", "sidi", "zeghmane"};
        String s = concat(str);
        System.out.println(s);
    }
}
