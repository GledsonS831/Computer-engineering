public class Data {
    private int dia, mes, ano;
    public Data(int d, int m, int a){
        if((d < 0 || d > 31) || (m < 1 || m > 12) || a <= 0){
            dia = 1;
            mes = 1;
            ano = 1;
        }
        else{
            this.dia =d;
            this.mes = m;
            this.ano = a;
        }
    }

    public int getDia(){return dia;}
    public int getMes(){return mes;}
    public int getAno(){return  ano;}
    public String getMesExtenso(){
        String sd = null, sm = null, sa;
        if(dia < 10){
            sd = "0"+Integer.toString(dia);
        }
        else{
            sd = Integer.toString(dia);
        }
        if(mes < 10){
            sm = "0"+Integer.toString(mes);
        }
        else{
            sm = Integer.toString(mes);
        }
        sa = Integer.toString(ano);
        String zeros = "";
        int t = sa.length();
        for(int i = t; i < 4; i++){
            zeros+="0";
        }
        return sd+"/"+sm+"/"+zeros+sa;
    }
}
