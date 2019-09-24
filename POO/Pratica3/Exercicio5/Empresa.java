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

    public void setLd(Departamento d) {
        this.ld.add(d);
    }

    public LinkedList<Departamento> getLd() {
        return ld;
    }

    public void transfere_funcionario(Funcionario f, Departamento origem, Departamento destino){
        Funcionario f_aux = f;
        for(Funcionario i: origem.getLista_funcionario()){
            if(i.getNome().equals(f.getNome())){
                origem.remove_funcionario(f);
                break;
            }
        }
        destino.add_funcionario(f_aux);
    }
}
