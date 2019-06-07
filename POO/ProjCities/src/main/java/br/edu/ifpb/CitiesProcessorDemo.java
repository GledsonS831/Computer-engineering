package br.edu.ifpb;

import sun.security.tools.PathList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Set;

public class CitiesProcessorDemo
{
    public static void main( String[] args ) throws IOException
    {
        CitiesProcessor cp = new CitiesProcessor();
        Path or = Paths.get("C://Users//Gledson//Documents//Texto//Cieties_duplicatas.txt");
        Path des = Paths.get("C:\\Users\\Gledson\\Documents\\Texto\\resp//Cities_ordered_by_name.txt");
        Path des2 = Paths.get("C:\\Users\\Gledson\\Documents\\Texto\\resp//Cities_ordered_by_zipCode.txt");
        Path des3 = Paths.get("C:\\Users\\Gledson\\Documents\\Texto\\resp//Cities_ordered_by_state.txt");
        Set<City> set = cp.buildSetOfCities(or);
        cp.setCitiesSet(set);
        cp.writeSetOfCitiesDestino(des, Comparator.naturalOrder());

        ComparatorByZipCode comparadorZip = new ComparatorByZipCode();
        cp.writeSetOfCitiesDestino(des2, comparadorZip);

        ComparatorByState comparadorState = new ComparatorByState();
        cp.writeSetOfCitiesDestino(des3, comparadorState);

    }
}
