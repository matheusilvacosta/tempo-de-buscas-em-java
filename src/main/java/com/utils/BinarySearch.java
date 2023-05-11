package com.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class BinarySearch {
    
    public void search(ArrayList<Long> list, Long valueToSearch) {  
        Collections.sort(list);
        
        double startedAt = System.nanoTime();
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (Objects.equals(list.get(mid), valueToSearch)) {
                System.out.println(
                        "Value " + list.get(mid) + " found in " + ((System.nanoTime() - startedAt)/1000000) + " milliseconds in Binary Search.");
                return;
            } else if (list.get(mid) < valueToSearch) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Value not found");
    }
}
