package br.edu.ifpb;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;

public class testando {
    public static void main( String[] args ) throws IOException {
        Path origem = Paths.get("C:\\Users\\Gledson\\Documents\\Texto\\Cieties_duplicatas.txt");
        Path destino = Paths.get("C:\\Users\\Gledson\\Documents\\Texto\\num_cities.txt");
        List<String> linhas = Files.readAllLines(origem);
        List<String> aux = new LinkedList<>();
        for(int i = 0; i < linhas.size(); i++){
            String[] linha = linhas.get(i).split(",");
            aux.add(linha[2]);
        }
        TreeSet<String> novo = new TreeSet<>(aux);
        Files.write(destino, novo);
    }
}
