import java.util.LinkedList;

public class Empresa {
    private String nome;
    private int cnpj;
    private LinkedList<Departamento> ld = new LinkedList<Departamento>();
    public Empresa(String n, int c){
        nome = n;
        cnpj = c;
    }

    public String getNome() {
        return nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setLd(LinkedList<Departamento> ld) {
        this.ld = ld;
    }

    public LinkedList<Departamento> getLd() {
        return ld;
    }
}
