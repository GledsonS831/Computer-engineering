import java.util.Arrays;
import java.util.LinkedList;

public class ListaDatas {
    private Data[] allDatas = new Data[5];
    private LinkedList<Data> feriados = new LinkedList<Data>();
    private int tamanho = 0, max = 5;

    public void adicionaFeriado(LinkedList <Data> lista){
        for(int i = 0; i < lista.size(); i++){

            feriados.add(lista.get(i));

        }
    }
    public boolean isFeriado(Data d){
        for(int i = 0; i < feriados.size(); i++){
            if(feriados.get(i).mes == d.mes && d.dia == feriados.get(i).dia && d.ano == feriados.get(i).ano){
                return true;
            }
        }

        return false;
    }
    public void insereData(Data data){
        if(tamanho == max){
            Data[] novo = new Data[max*2];
            System.arraycopy(allDatas, 0, novo, 0, max);
            allDatas = new Data[max*2];
            allDatas = novo.clone();
            max = max * 2;
        }
        allDatas[tamanho++] = data;
        //if(!inList(data))
    }
    public void removeData(Data data){
        allDatas[tamanho--] = null;
    }
    public boolean inList(Data data){
        for(int i = 0; i < tamanho; i++){
            if(allDatas[i].dia == data.dia && allDatas[i].mes == data.mes && allDatas[i].ano == data.ano){
                return true;
            }
        }
        return false;
    }

    public LinkedList<Data> datasMes(int mes){
        LinkedList<Data> aux = new LinkedList<Data>();
        for(int i = 0; i < tamanho; i++){
            if(allDatas[i].mes == mes){
                aux.add(allDatas[i]);
            }
        }
        return aux;
    }
}
