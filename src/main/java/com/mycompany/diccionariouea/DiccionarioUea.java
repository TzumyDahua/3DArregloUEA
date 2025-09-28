
package com.mycompany.diccionariouea;

import java.util.HashMap;
import java.util.Map;


public class DiccionarioUea {

    public static void main(String[] args) {
         Map<String, Object> informacionPersonal = new HashMap<>();

        System.out.println("1. Creando el diccionario inicial...");
        informacionPersonal.put("nombre", "Jhonny Dahua");
        informacionPersonal.put("edad", 25);
        informacionPersonal.put("ciudad", "Loja");
        
        System.out.println("Diccionario inicial: " + informacionPersonal);
        System.out.println("------------------------------------");

        // 2. Acceder y Modificar Valores
        System.out.println("2. Modificando la ciudad y agregando la profesión...");
        
        // Modificar el valor de la clave "ciudad"
        informacionPersonal.put("ciudad", "Guayaquil");

        // Agregar la nueva clave-valor para "profesion"
        informacionPersonal.put("profesion", "Ingeniero Civil");

        System.out.println("Diccionario modificado: " + informacionPersonal);
        System.out.println("------------------------------------");

        // 3. Verificar si una Clave Existe
        System.out.println("3. Verificando si existe la clave 'telefono'...");
        if (!informacionPersonal.containsKey("telefono")) {
            System.out.println("La clave 'telefono' no existe. Agregándola...");
            informacionPersonal.put("telefono", "0987654321");
        }
        
        System.out.println("Diccionario con teléfono: " + informacionPersonal);
        System.out.println("------------------------------------");

        // 4. Eliminar una Clave
        System.out.println("4. Eliminando la clave 'edad'...");
        informacionPersonal.remove("edad");
        
        System.out.println("Diccionario sin edad: " + informacionPersonal);
        System.out.println("------------------------------------");
        
        // 5. Imprimir el Diccionario Final
        System.out.println("DICCIONARIO FINAL:");
        System.out.println(informacionPersonal);
    }
}
