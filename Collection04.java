package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Collection04 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        List<Integer> sub = numbers.subList(3, 7);
        
        sub.add(11);

        System.out.println("Sub List : " + sub);
        System.out.println("Original List : " + numbers);

    }
}