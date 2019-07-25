package br.edu.ifpb;

import java.util.*;

public class SetDemo {
    public static void main( String[] args )
    {
        List<Aluno> lista = List.of (
                new Aluno( 9000, 200, "ana" ),
                new Aluno( 5000, 400, "caio" ),
                new Aluno( 6000, 100, "bruna" ),
                new Aluno( 7000, 300, "chico" ),
                new Aluno( 6000, 100, "bruna" ),
                new Aluno( 5000, 400, "caio" )
        );

        Set<Aluno> hashSet = new HashSet<>(); // tratar duplicatas!
        hashSet.addAll( lista );

        boolean resultado =
              hashSet.add( new Aluno( 5000, 400, "caio" ) );
        //System.out.println( "resultado = " + resultado );

        //System.out.println( hashSet ); // ANTES

        // 1a forma: criando uma classe que implemente a interface Comparator
        // ComparadorPorCPF comparadorPorCPF = new ComparadorPorCPF();

        // 2a forma: criando uma classe anônima (sintaxe complexa...)
        Comparator<Aluno> comparatorPeloNome = new Comparator<Aluno>() {
            @Override
            public int compare( Aluno o1, Aluno o2 )
            {
                return o1.getNome().compareTo( o2.getNome() );
            }
        };

        // 3a forma: usando uma lambda expression (Java 8+)
        // implementar uma interface e instanciar o objeto com uma única expressão simples
        Comparator<Aluno> comparadorCPF =
                ( o1, o2 ) -> Long.compare( o1.getCpf(), o2.getCpf() );

        Comparator<Aluno> comparadorNome =
                ( o1, o2 ) -> o1.getNome().compareTo( o2.getNome() );

        Comparator<Aluno> comparadorMat = (o1, o2) -> Integer.compare(o1.getMatrícula(), o2.getMatrícula());

        TreeSet<Aluno> treeSet = new TreeSet<>( comparadorNome );
        TreeSet<Aluno> treeSet1 = new TreeSet<>(comparadorCPF);
        TreeSet<Aluno> treeSet2 = new TreeSet<>(comparadorMat);
        treeSet.addAll( lista );
        treeSet1.addAll(lista);
        treeSet2.addAll(lista);

        Aluno a1 = new Aluno(70019, 2345, "alguem");
        System.out.println(a1.hashCode());

    }
}
