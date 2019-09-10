public class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(){}
    public Funcionario(String n, double v){
        nome = n;
        salario = v;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
}
