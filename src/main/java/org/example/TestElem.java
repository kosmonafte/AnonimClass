package org.example;

import java.util.Comparator;

public class TestElem {
    private String name;
    private int number;

    public TestElem(String name, int number){
        this.name = name;
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
