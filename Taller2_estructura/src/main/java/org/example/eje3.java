package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class eje3 {

    public static void main(String[] args) {
        numeroMayor();
    }

    public static void numeroMayor(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo: ");
        String nombreArchivo = entrada.nextLine();

        int numeroMasGrande = Integer.MIN_VALUE;

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                if (numero > numeroMasGrande) {
                    numeroMasGrande = numero;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println("El número más grande de la lista es: " + numeroMasGrande);
    }
}
