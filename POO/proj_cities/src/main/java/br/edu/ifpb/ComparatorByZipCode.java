package br.edu.ifpb;

import java.util.Comparator;

public class ComparatorByZipCode implements Comparator<City> {
    @Override
    public int compare(City city1, City city2){
        return Integer.compare(city1.getCod(), city2.getCod());
    }
}
