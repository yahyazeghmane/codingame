package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;

public class PlusGrandInArray  implements CommandLineRunner {
    /**
     * retourne le max d'un array
     * @param array
     * @return
     */
    public static Integer findLargest(Integer[] array){
        int max = array[0];
        for(int val: array){
            if (val>max){
                max = val;
            }
        }
        return max;
    }

    @Override
    public void run(String... args) throws Exception {
        Integer[] array= {1,21,65,100,2,120};

        int max = findLargest(array);
        System.out.println("LE PLUS GRAND NBRE DU ARRAY est "+max);
    }
}
