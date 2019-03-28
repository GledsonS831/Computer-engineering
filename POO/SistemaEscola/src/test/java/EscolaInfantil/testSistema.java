package EscolaInfantil;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class testSistema
{

    @Test
    public void testAluno() {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Gledson");
        aluno1.setDataNascimento("04/03/2000");
        aluno1.setMatricula(201811);
        aluno1.setNomeMae("alcione");
        aluno1.setMaterialEntregar("borracha");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Lucas");
        aluno2.setDataNascimento("04/03/2000");
        aluno2.setMatricula(201810);
        aluno2.setNomeMae("alcione");
        aluno2.setMaterialEntregar("lapis");

        Turma turma1 = new Turma();
        turma1.setCodigo(2018333);
        turma1.setNomeTurma("prog 02");
        turma1.setSala(30);
        turma1.setHorario("08:40 - 10:20");
        turma1.setTipo("B");
        turma1.AdicionaAluno(aluno1);
        turma1.AdicionaAluno(aluno2);
        turma1.setListaMateriais(aluno2);
        turma1.setListaMateriais(aluno1);
        turma1.getMateriais();
        turma1.imprimeAlunos();
    }

    @Test
    public void testProfessor() {
        Professor professor1 = new Professor();
        professor1.setNome("Katyusco");
        professor1.setMatricula(201122);
        professor1.setSalario(10000);
        professor1.setGrauInstrução("Mestrado");

        Turma turma1 = new Turma();
        turma1.setCodigo(2018333);
        turma1.setNomeTurma("prog 02");
        turma1.setSala(30);
        turma1.setHorario("08:40 - 10:20");
        turma1.setTipo("B");
        turma1.AdicionaProfessor(professor1);
        turma1.imprimeProfessor();
    }
}
