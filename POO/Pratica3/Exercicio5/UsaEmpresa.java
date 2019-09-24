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
        emp.setLd(trab);
        emp.setLd(Limpeza);
        for(Funcionario i: trab.getLista_funcionario()){
            System.out.println(i.toString());
        }
        emp.transfere_funcionario(trab.getLista_funcionario().get(1), trab, Limpeza);
        System.out.println();
        for(Funcionario i: trab.getLista_funcionario()){
            System.out.println(i.toString());
        }
        System.out.println();
        for(Funcionario i: Limpeza.getLista_funcionario()){
            System.out.println(i.toString());
        }


    }
}
