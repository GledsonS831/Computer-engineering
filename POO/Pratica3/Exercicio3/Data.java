public class Data {
    public int dia, mes, ano;
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    public String printDia(int d){
        if(d < 10){
            return "0"+d;
        }
        return Integer.toString(d);
    }
    public String printMes(int m){
        if(m < 10){
            return "0"+m;
        }
        return Integer.toString(m);
    }

    public String toString(){
        return printDia(dia)+"/"+printMes(mes)+"/"+ano;
    }
}
