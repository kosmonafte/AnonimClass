package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class SearchMaxElem<T> {
    ArrayList<T> elems;

    public SearchMaxElem(ArrayList<T> elems) {
        this.elems = elems;
    }

    public T getMin(Comparator<T> comparator) {
        T res = this.elems.get(0);
        for (int i = 0; i < this.elems.size(); i++) {
            if (comparator.compare(res, this.elems.get(i)) < 0) {
                res = this.elems.get(i);
            }
        }
        return res;
    }
}
