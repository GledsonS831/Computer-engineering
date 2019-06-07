package br.edu.ifpb;

public class City implements Comparable<City>{
    private String Cities;
    private String State;
    private int Code;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this.getClass() != obj.getClass() || obj == null) return false;
        City c =  (City) obj;
        return Cities == c.Cities;
    }

    @Override
    public int hashCode() {
        return this.Cities.charAt(0);
    }

    @Override
    public int compareTo(City o) {
        return this.getCities().compareTo(o.getCities());
    }

    @Override
    public String toString() {
        return this.Cities+","+this.State+","+this.Code;
    }
    public void setCities(String c){this.Cities = c;}
    public void setState(String s){this.State = s;}
    public void setCode(int code){this.Code = code;}

    public String getCities() {return Cities;}
    public String getState(){return State;}
    public int getCode(){return Code;}
}
