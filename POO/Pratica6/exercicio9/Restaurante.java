import java.util.ArrayList;

public class Restaurante {

    private ArrayList<Mesa> arrMesas = new ArrayList<Mesa>();
    private double faturamento = 0.0;

    public double getFaturamento(){
        return faturamento;
    }

    public void adicionaMesa(Mesa m){
        arrMesas.add(m);
    }

    public void removerMesa(Mesa m){
        for(Mesa i: arrMesas){

            if(i.getNumero() == m.getNumero()){

                for(Pedido j: i.getArr()){
                    this.faturamento += j.getValor();
                }
                arrMesas.remove(m);
                break;
            }
        }
    }

    public ArrayList<Mesa> getArrMesas() {
        return arrMesas;
    }
}
