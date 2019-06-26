package br.edu.ifpb;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ProcessaProdutos {
    private Set<Produto> set_produtos = new TreeSet<>();

    public void write_listaProduto(Path PathOutDvd, Path PathOutCd, Path PathOutFita, List<Produto> Lista) throws IOException {
//        set_produtos.addAll(Lista);
        List<Produto> lista = new LinkedList<>(Lista);


        List dvd_lista = new LinkedList<>();
        List cd_lista = new LinkedList();
        List fita_lista = new LinkedList();
        for(Produto p: lista){
            dvd_lista.add(p.getPreco());
        }
        Files.write(PathOutDvd, dvd_lista, Charset.defaultCharset());
//        Files.write(PathOutCd, cd_lista, Charset.defaultCharset());
//        Files.write(PathOutFita, fita_lista, Charset.defaultCharset());
    }
}
