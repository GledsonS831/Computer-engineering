import java.util.ArrayList;

public class Mesa {
    private int numero;
    private String cliente;
    private ArrayList<Pedido> arrPedidos = new ArrayList<Pedido>();

    public Mesa(){}

    public Mesa(String c, int n){
        numero = n;
        cliente = c;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void addArray(Pedido p){
        arrPedidos.add(p);
    }

    public ArrayList<Pedido> getArr() {
        return arrPedidos;
    }

    @Override
    public String toString() {
        return numero + " " + cliente;
    }
}
