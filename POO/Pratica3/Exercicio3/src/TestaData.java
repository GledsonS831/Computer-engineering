import java.util.LinkedList;

public class TestaData {
    public static void main(String []args){
        ListaDatas lista1 = new ListaDatas();
        Data d1 = new Data(12, 8, 2014);
        Data d2 = new Data(10, 10, 1990);
        Data d3 = new Data(3, 10, 1992);
        Data d4 = new Data(21, 10, 2019);
        Data d5 = new Data(1, 2, 2018);
        Data d6 = new Data(5, 2, 2019);
        Data d7 = new Data(9, 8, 2020);
        lista1.insereData(d1);
        lista1.insereData(d2);
        lista1.insereData(d3);
        lista1.insereData(d4);
        lista1.insereData(d5);
        lista1.insereData(d6);
        lista1.insereData(d7);
        LinkedList<Data> meses = new LinkedList<Data>();
        //retornando uma lista com as datas do mes especificado
        meses = lista1.datasMes(8);
        for(Data i: meses){
            System.out.println(i.toString());
        }
        LinkedList<Data> fer = new LinkedList<>();
        fer.add(d1);
        fer.add(d4);
        fer.add(d3);
        lista1.adicionaFeriado(fer);
        System.out.println(lista1.isFeriado(d3));
    }
}
