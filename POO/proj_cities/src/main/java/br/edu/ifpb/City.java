package br.edu.ifpb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeSet;

public class City implements Comparable<City> {
    private int cod;
    private String state;
    private String name;

    public void setName(String name){this.name = name;}
    public String getName(){ return this.name;}

    public void setCod(int cod){this.cod = cod;}
    public int getCod(){return this.cod;}

    public void setState(String state){this.state = state;}
    public String getState(){return this.state;}

    @Override
    public int compareTo(City city) {
        return this.getName().compareTo(city.getName());
    }
    @Override
    public boolean equals(Object o){
        if(o.getClass() != getClass() || o == null){
            return false;
        }
        if(this == o) {return true;}
        if(this.hashCode() - o.hashCode() == 0){return true;}
        return false;
    }
    @Override
    public int hashCode(){
        return this.getName().charAt(0);
    }

    @Override
    public String  toString(){
        return getName()+ ", " + getState() + ", " + getCod();
    }
}
