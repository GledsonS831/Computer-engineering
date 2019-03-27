package EscolaInfantil;

import org.graalvm.compiler.lir.LIR;

import java.util.ArrayList;

public class Turma {
    private int Codigo;
    private String NomeTurma;
    private int Sala;
    private String Horario;
    private String Tipo;
    private ArrayList ListaMateriais = new ArrayList();

    public Turma(int codigo, String nometurma, int sala, String horario, String tipo){
        this.Codigo = codigo;
        this.NomeTurma = nometurma;
        this.Sala = sala;
        this.Horario = horario;
        this.Tipo = tipo;

    }
    public void setListaMateriais(Aluno aluno){
        ListaMateriais.add(aluno.getMaterialEntregar());
    }
    public int getCodigo(){
        return this.Codigo;
    }
    public String getNomeTurma(){
        return this.NomeTurma;
    }
    public int getSala(){
        return this.Sala;
    }
    public String getHorario(){
        return this.Horario;
    }
    public String getTipo(){
        return this.Tipo;
    }
    public void getMateriais(){
        System.out.printf("turma %s e seus respectivos materiais", this.Tipo);
        System.out.println(this.ListaMateriais);
    }
}
