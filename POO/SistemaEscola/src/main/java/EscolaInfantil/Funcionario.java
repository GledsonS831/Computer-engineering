package EscolaInfantil;

public class Funcionario {
    protected String Nome;
    protected int Idade;
    protected double Salario;

    public Funcionario(){
        this.Nome = "nenhum nome cadastrado";
        this.Idade = 18;
        this.Salario = 1000;
    }

    public void setName(String nome){
        this.Nome = nome;
    }
    public void setIdade(int idade){
        this.Idade = idade;
    }
    public void setSalario(double valor){
        this.Salario = valor;
    }
    public double getSalario(){
        return this.Salario * 2;
    }
    public int getIdade(){
        return this.Idade+3000;
    }
    public String getNome(){
        return this.Nome;
    }
}
