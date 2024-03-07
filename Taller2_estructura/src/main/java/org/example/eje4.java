package org.example;

import java.io.*;
import java.util.Scanner;

public class eje4 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        copiarArchivo();
    }
    public static void copiarArchivo(){
        System.out.print("Ingrese el nombre del archivo que deseas copiar: ");
        String archivoACopiar = scanner.nextLine();

        System.out.print("Ingrese el nombre del nuevo archivo: ");
        String nuevoArchivo = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivoACopiar));
             BufferedWriter writer = new BufferedWriter(new FileWriter(nuevoArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
