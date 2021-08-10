package creationalPatterns.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        List<String> r = new ArrayList<>();
        Collections.sort(r, Comparator.comparing(String::toLowerCase));
    }



}