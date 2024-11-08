package com.placementtraining;
import java.util.*;
public class unionoftwoarrays {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 4, 4, 5, 4};
        int[] list2 = {1, 2, 7, 5};

        Set<Integer> set = new HashSet<>();
        for (int i : list1) {
            set.add(i);
        }
        for (int i : list2) {
            set.add(i);
        }

        for (int i : set) {
            System.out.print(i + " ");
        }
    }
}