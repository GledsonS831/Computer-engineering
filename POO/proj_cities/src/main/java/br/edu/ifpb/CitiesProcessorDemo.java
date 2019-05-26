package br.edu.ifpb;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.Set;

public class CitiesProcessorDemo {
    public static void main(String[] args){
        CitiesProcessor cp = new CitiesProcessor();
        Set<City> set = cp.buildSetOfCities(Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Cieties_duplicatas2.txt"));

        cp.setCities(set);
        cp.writeSetOfCities(Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Cities_por_name.txt"), Comparator.naturalOrder());

        ComparatorByZipCode comparatorZip = new ComparatorByZipCode();
        cp.writeSetOfCities(Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Cities_por_ZipCode.txt"), comparatorZip);

        ComparatorByState comparatorState = new ComparatorByState();
        cp.writeSetOfCities(Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Cities_por_State.txt"), comparatorState);


    }
}
