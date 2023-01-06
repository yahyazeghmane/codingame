package com.example.codinggame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;


//@Component
public class FilterDiplicatesArrayData implements CommandLineRunner {
    /**
     * Filter les entiers dupliqués en concervant l'order initial
     * @param inputArray
     * @return
     */
    public static int[] onlyUniqueElements(final int[] inputArray)
    {
        final Set<Integer> set = new HashSet<>();
        final int[] tmp = new int[inputArray.length];
        int index = 0;
        for (final int i: inputArray)
            if (set.add(i))
                tmp[index++] = i;

        return Arrays.copyOfRange(tmp, 0, index);
    }

    @Override
    public void run(String... args) throws Exception {
        int[] myNum = {10, 20, 30, 40,40,10,10,10,1,1,0};
        System.out.println( Arrays.toString(onlyUniqueElements(myNum)));;
    }
}
