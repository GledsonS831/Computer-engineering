package br.edu.ifpb;

import java.io.IOException;
import java.util.Scanner;

public class UsaMenu
{
    public static void main( String[] args ) throws Exception {
        Menu menu = new Menu();
        ContaCorrente c = new ContaCorrente(500, "gledson", 4000);
        menu.exibirMenu(c);
    }
}
