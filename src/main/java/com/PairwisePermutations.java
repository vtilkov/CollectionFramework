package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PairwisePermutations {
    public static void main(String[] args) {

        int N = 8; // лист размерностью N, где N — чётное число
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) { // а содержимое — числа от 1 до N
            list.add(i);
        }

        System.out.println("До перестановок: " + list);

        // Поменяйте местами попарно его элементы. То есть первый со вторым, третий с четвёртым и т.д.
        for (int i = 0; i < list.size(); i += 2) {
            Collections.swap(list, i, i + 1); // меняем местами элементы i и i+1
        }

        System.out.println("После перестановок: " + list);
    }
}
