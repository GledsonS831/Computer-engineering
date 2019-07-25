package br.edu.ifpb;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Test_tela {

    public static void main(String[] args ) throws IOException{
        Map<String, Windows_main> map = new HashMap<>();
        map.put("a", new Windows_main());
        System.out.println();
    }
}
