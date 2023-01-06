package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;

public class CountNombreDePairePourN implements CommandLineRunner {
    /**
     * Dans cet exercice, on souhaiterait connaître le nombre de paires qu'il est possible d'obtenir sachant
     * que l'ordre des opposants dans une paire n'a pas d'importance.
     * Par exemple, avec 4 joueurs nommés A, B, C et D, il est possible d'obtenir 6 paires différentes : AB, AC,
     * AD, BC, BD, CD.
     * la formulle mathematique est : n*(n-1) avec n c'est le nombre de l'éléements
     */
    /*
    *
    * */
    public static int count(int n){
        return n*(n-1)/2;
    }
    @Override
    public void run(String... args) throws Exception {
        int nb = 1000;
        int n = count(nb);
        System.out.println("Nombre de paires dans l'ensemble de "+nb +" est : "+n);
    }
}
