package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class averageTable implements CommandLineRunner {
    /**
     * Calcul de la moyene d'un array
     * @param table
     * @return
     */
    public static Double average(Double[] table){
        //calculate sum of all array elements
        Double sum = 0.0;
        for(int i=0; i < table.length ; i++)
            sum = sum + table[i];
        //calculate average value
        double average = sum / table.length;
        return average;
    }
    @Override
    public void run(String... args) throws Exception {
        Double[] numbers = new Double[]{1.0, 2.0, 3.0, 4.0};
        System.out.println("Avarage : "+average(numbers));
    }
}
