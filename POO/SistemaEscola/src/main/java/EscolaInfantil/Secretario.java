package EscolaInfantil;

public class Secretario extends Funcionario{
    private double comissao;

    public Secretario(){
        super();
        this.comissao = 50;
    }

    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    @Override
    public double getSalario(){
        return super.getSalario() + comissao;
    }
    public int getIdade(){
        return super.getIdade();
    }
}
