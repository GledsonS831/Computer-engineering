import java.util.LinkedList;

public class Departamento {
    private LinkedList<Funcionario> lista_funcionario = new LinkedList<Funcionario>();
    public void add_funcionario(Funcionario f){
        lista_funcionario.add(f);
    }
    public void remove_funcionario(Funcionario f){lista_funcionario.remove(f);}
    public LinkedList<Funcionario> getLista_funcionario() {
        return lista_funcionario;
    }

}
