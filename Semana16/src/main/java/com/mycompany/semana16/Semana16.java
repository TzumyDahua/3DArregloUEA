
package com.mycompany.semana16;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Semana16 {

    public static void main(String[] args) {
        // Define el nombre del archivo. Se creará en la raíz de tu proyecto de NetBeans.
        String nombreArchivo = "my_notes.txt";

      // --- 1. Escritura de Archivo de Texto (CONTENIDO ACTUALIZADO) ---
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            
            // Escribimos una mini-receta como nuevo contenido.
            writer.write("=== Receta: Empanadas de Viento ===");
            writer.newLine(); // Agrega un salto de línea
            writer.write("Ingredientes: Masa de empanada, quesillo o queso fresco, azúcar.");
            writer.newLine();
            writer.write("Paso 1: Rellenar los discos de masa con el queso y sellar los bordes.");
            writer.newLine();
            writer.write("Paso 2: Freír en aceite caliente hasta que se inflen y estén doradas.");
            writer.newLine();
            writer.write("Paso 3: Escurrir y espolvorear con azúcar al gusto antes de servir.");
            
            System.out.println("✅ Archivo '" + nombreArchivo + "' creado con la receta.");

        } catch (IOException e) {
            System.err.println("❌ Error al escribir en el archivo: " + e.getMessage());
        }

        System.out.println("----------------------------------------");

        // --- 2. Lectura de Archivo de Texto ---
        
        System.out.println("📖 Leyendo el contenido del archivo:\n");
        File archivo = new File(nombreArchivo);
        
        if (!archivo.exists()) {
            System.out.println("❌ El archivo '" + nombreArchivo + "' no existe.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());
        }
        
        System.out.println("\n----------------------------------------");
        System.out.println("✅ Proceso de lectura finalizado.");
    }
}
    

