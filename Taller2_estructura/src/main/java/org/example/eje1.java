package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
        int op = 0;

        do {
            System.out.println("1. Deseas Abrir el archivo y leer");
            System.out.println("2. Deseas salir del programa");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();

            switch (op) {
                case 1:
                    leerArchivo();
                    break;
                case 2:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op !=2);
    }



    public static void leerArchivo(){
        try {
            Scanner input = new Scanner(new File("Archivo.txt"));

            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
