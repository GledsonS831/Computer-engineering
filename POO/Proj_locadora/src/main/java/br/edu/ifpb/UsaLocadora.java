package br.edu.ifpb;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class UsaLocadora
{
    public static void main( String[] args ) throws IOException {
        Lancamento preco_lancamento = new Lancamento();
        Normal preco_normal = new Normal();
        Infantil preco_infantil = new Infantil();
        Produto dvd1 = new Produto("dvd", "deby e loide 2", preco_normal);
        Produto dvd2 = new Produto("dvd","Piratas do caribe", preco_lancamento);
        Produto dvd3 = new Produto("dvd","Harry Potter", preco_normal);
        Produto cd1 = new Produto("cd", "Calcinha Preta", preco_infantil);
        Produto cd2 = new Produto("cd", "Scorpion", preco_infantil);
        Produto cd3 = new Produto("cd", "Anos 80", preco_lancamento);
        Produto cd4 = new Produto("cd", "Luiz Gonzaga", preco_normal);
        Produto fita1 = new Produto("fita", "k7", preco_lancamento);
        Produto fita2 = new Produto("fita", "Mario", preco_lancamento);
        ProcessaProdutos p1 = new ProcessaProdutos();
        List<Produto> lista = new LinkedList<Produto>();
        lista.add(dvd1);
        lista.add(dvd2);
        lista.add(dvd3);
        lista.add(cd1);
        lista.add(cd2);
        lista.add(cd3);
        lista.add(cd4);
        lista.add(fita1);
        lista.add(fita2);
        Path path_dvd = Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Produtos\\dvd\\lista_dvd.txt");
        Path path_cd = Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Produtos\\cd\\lista_cd.txt");
        Path path_fita = Path.of("C:\\Users\\Gledson\\Documents\\Texto\\Produtos\\cd\\lista_fita.txt");
        //p1.build_produtos(lista);

        p1.write_listaProduto(path_dvd, path_cd, path_fita, lista);

    }
}
