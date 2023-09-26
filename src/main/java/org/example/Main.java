package org.example;

import java.util.ArrayList;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<TestElem> elems = new ArrayList<>();

        elems.add(new TestElem("testname", 23));
        elems.add(new TestElem("name", 54));
        elems.add(new TestElem("oleg", 87));

        SearchMaxElem<TestElem> search = new SearchMaxElem<>(elems);

        TestElem test = search.getMin(new Comparator<TestElem>() {
            @Override
            public int compare(TestElem o1, TestElem o2) {
                int res;
                if (o1.getNumber() < o2.getNumber()) {
                    res = 1;
                } else if (o1.getNumber() > o2.getNumber()){
                    res = -1;
                } else {
                    res = 0;
                }
                return res;
            }
        });

        System.out.println(test);
    }
}