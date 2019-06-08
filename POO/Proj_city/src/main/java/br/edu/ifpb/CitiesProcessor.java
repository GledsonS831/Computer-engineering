package br.edu.ifpb;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CitiesProcessor {
    private Set<City> citiesSet = new TreeSet<City>();

    public TreeSet<City> buildSetOfCities(Path filepath) throws IOException {
        TreeSet<City> listaCity = new TreeSet<City>();
        List<String> linhas = Files.readAllLines(filepath, Charset.defaultCharset());
        for(int i = 0; i < linhas.size(); i++){
            City city = new City();
            String []frase = linhas.get(i).split(", ");
            for(int j = 0; j < 3; j++){
                city.setCities(frase[0]);
                city.setState(frase[1]);
                int n = Integer.parseInt(frase[2]);
                city.setCode(n);
            }
            listaCity.add(city);
        }
        return listaCity;
    }
    public void setCitiesSet(Set<City> city){
        this.citiesSet = city;
    }

    public void writeSetOfCitiesDestino(Path pathDestino, Comparator<City> comparator) throws IOException {
        List<City> city = new LinkedList<>();
        city.addAll(citiesSet);
        city.sort(comparator);
        List<String> listaFinal = new LinkedList<String>();
        for(City c: city){
            listaFinal.addAll(Collections.singleton(c.toString()));
        }
        Files.write(pathDestino, listaFinal, Charset.defaultCharset());
    }
}
