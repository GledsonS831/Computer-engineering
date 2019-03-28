package EscolaInfantil;



import java.util.ArrayList;

public class Turma {
    private int Codigo;
    private String NomeTurma;
    private int Sala;
    private String Horario;
    private String Tipo;
    private ArrayList<String> ListaMateriais = new ArrayList<String>();
    private ArrayList<Aluno> AlunosCadastrados = new ArrayList<Aluno>();
    private Professor professor;

    public void setCodigo(int codigo){
        this.Codigo = codigo;
    }
    public void setNomeTurma(String nomeTurma){
        this.NomeTurma = nomeTurma;
    }
    public void setSala(int sala){
        this.Sala = sala;
    }
    public void setHorario(String horario){
        this.Horario = horario;
    }
    public void setTipo(String tipo){
        this.Tipo = tipo;
    }

    public boolean AdicionaAluno(Aluno aluno){
        this.AlunosCadastrados.add(aluno);
        return true;
    }
    public void setListaMateriais(Aluno aluno){
        ListaMateriais.add(aluno.getMaterialEntregar());
    }
    public void AdicionaProfessor(Professor professor){
        this.professor = professor;
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
    public void imprimeAlunos(){
        for(Aluno al: AlunosCadastrados){
            System.out.println(al.getNome());
        }
    }
    public void imprimeProfessor(){
        System.out.printf("O professor(a) da turma é %s: ",this.professor.getNome());
    }
}
