package Problem6;

import java.util.ArrayList;

public class MyList<T extends Number> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<T>();
    }

    public void add(T value) {
        list.add(value);
    }

    public int toInteger(T value) {
        return value.intValue();
    }

    public T largest() {
        T largest = list.get(0);
        for(T number: list) {
            if(toInteger(number) > toInteger(largest)) {
                largest = number;
            }
        }
        return largest;
    }

    public T smallest() {
        T smallest = list.get(0);
        for(T number: list) {
            if(toInteger(number) < toInteger(smallest)) {
                smallest = number;
            }
        }
        return smallest;
    }
}