package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class eje2 {

    private static String ruta;
    private static FileWriter fw;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        eje2 eje2 = new eje2();
        int op = 0;

        do {
            System.out.println("1. Crear archivo");
            System.out.println("2. Agregar números al archivo");
            System.out.println("3. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    crearArchivo();
                    break;
                case 2:
                    agregarNumeros();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 3);


        if (eje2.fw != null) {
            eje2.fw.close();
        }
        sc.close();
    }

    public static void crearArchivo() throws IOException {
        System.out.println("Ingresa el nombre del archivo:");
        ruta = sc.next();
        File file = new File(ruta);

        if (!file.exists()) {
            file.createNewFile();
        }

        fw = new FileWriter(file, true);
    }

    public static void agregarNumeros() throws IOException {
        System.out.println("Ingresa números (escribe -9999 para terminar):");
        int num;
        do {
            num = sc.nextInt();
            if (num != -9999) {

                fw.write(num + "\n");
            }
        } while (num != -9999);
    }
}
