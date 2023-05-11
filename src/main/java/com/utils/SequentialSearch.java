package com.utils;

import java.util.ArrayList;
import java.util.Objects;

public class SequentialSearch {

    public void search(ArrayList<Long> list, Long valueToSearch) {
        double startedAt = System.nanoTime();

        for (Long number : list) {
            if (Objects.equals(valueToSearch, number)) {
                System.out.println(
                        "Value " + number + " found in " + ((System.nanoTime() - startedAt) / 1000000) + " milliseconds in Sequential Search.");
                return;
            }
        }
        System.out.println("Value " + valueToSearch + " not found");
    }
}
