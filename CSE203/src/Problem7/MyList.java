package Problem7;

import java.util.ArrayList;

public class MyList<T extends Comparable<T>> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T value) {
        list.add(value);
    }

    public T largest() {
        T largest = list.get(0);
        for(T number: list) {
            if(number.compareTo(largest) > 0) {
                largest = number;
            }
        }
        return largest;
    }

    public T smallest() {
        T smallest = list.get(0);
        for(T number: list) {
            if(smallest.compareTo(number) > 0) {
                smallest = number;
            }
        }
        return smallest;
    }
}