package br.edu.ifpb;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CitiesProcessor {
    public Set<City> citiesSet;

    public void setCities(Set<City> cititesSet){
        this.citiesSet = cititesSet;
    }

    public TreeSet<City> buildSetOfCities(Path filePath){
        List<String> lista;
        City city;
        String[] palavra;
        int cod;
        TreeSet<City> citiesNoDuplicatas = new TreeSet<>();
        try{
            lista = Files.readAllLines(filePath, Charset.defaultCharset());
            for(int i = 0; i < lista.size(); i++){
                palavra = lista.get(i).split(", ");
                city = new City();
                city.setName(palavra[0]);
                city.setState(palavra[1]);
                cod = Integer.parseInt(palavra[2]);
                city.setCod(cod);
                citiesNoDuplicatas.add(city);
            }
        }
        catch (IOException e){
            System.out.println("Erro");
        }

        return citiesNoDuplicatas;
    }
    public void writeSetOfCities(Path pathDestino, Comparator<City> comparator){
        List<City> listCity = new LinkedList<>(citiesSet);
        listCity.sort(comparator);
        List<String> lista = new LinkedList<>();
        for(int i = 0; i < listCity.size(); i++){
            lista.add(listCity.get(i).toString());
        }
        try{
            Files.write(pathDestino, lista, Charset.defaultCharset(), StandardOpenOption.CREATE);
        }
        catch (IOException e){
            System.out.println("erro");
        }
    }

}
