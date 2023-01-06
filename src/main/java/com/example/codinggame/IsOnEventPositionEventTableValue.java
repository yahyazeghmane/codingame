package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//@Component
public class IsOnEventPositionEventTableValue implements CommandLineRunner {
    /**
     * renvoie si l'indice d'un nombre est paire ou non
     * si l'indice du nombre x est paire renvoie true sinon renvoi false
     * @param table
     * @param value
     * @return
     */
    public static boolean isEventPosition(int[] table, int value){
        if(table.length == 0){
            return false;
        }

        for(int i=0; i< table.length; i++){
            if(i%2 == 0 && table[i] == value){
                return true;
            }
        }
        return false;
    }
    @Override
    public void run(String... args) throws Exception {
        int[] t1 = new int[]{1,2,3,4,78,0};
        System.out.println(isEventPosition(t1,2));;//false
        System.out.println(isEventPosition(t1,3));;//true
        System.out.println(isEventPosition(t1,4));;//true

    }
}
