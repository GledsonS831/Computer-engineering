package br.edu.ifpb;

import java.util.Comparator;

public class ComparatorByState implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.getState().compareTo(o2.getState());
    }
}
