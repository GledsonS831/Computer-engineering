public class UsaEmpresa {
    public static void main(String []args){
        Empresa emp = new Empresa("omo", 3456632);
        Departamento trab = new Departamento();
        Departamento Limpeza = new Departamento();
        trab.add_funcionario(new Funcionario("alguem", 10000));
        trab.add_funcionario(new Funcionario("outro", 3000));
        trab.add_funcionario(new Funcionario("foi alguem", 50000));
        //aumentando salario
        for(Departamento d: emp.getLd()){
            for(Funcionario f: d.getLista_funcionario()){
                f.setSalario(f.getSalario() + f.getSalario()*0.01);
            }
        }
    }
}
