public class TestaData {
    public static void main(String []args){
        Data d1 = new Data(21, 8, 2019);
        System.out.println(d1.getDia()+" "+d1.getMes()+" "+d1.getAno());
        System.out.println(d1.getMesExtenso());
        Data d2 = new Data(01, 04, -9);
        Data d3 = new Data(14, 8, 2020);
        System.out.println(d2.getMesExtenso());
        System.out.println(d3.isBissexto());
    }
}
