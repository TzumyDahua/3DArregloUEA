
package com.mycompany.calculodedescuento;


public class CalculodeDescuento {

    public static void main(String[] args) {
        System.out.println("Mi trabajo de programacíon");
    // Asegúrate de que el nombre del paquete coincida con la estructura de tu proyecto.
// Si no usas paquetes, puedes eliminar la siguiente línea.
    /**
     * El método principal (main) donde se ejecuta el programa.
     * @param args
     */
    

        // --- Llamada 1: Usando el porcentaje de descuento por defecto (10%) ---
        double montoCompra1 = 500.00;
        // Se llama al método que solo requiere el monto, usando el 10% por defecto.
        double descuento1 = calcularDescuento(montoCompra1);
        double montoFinal1 = montoCompra1 - descuento1;

        System.out.println("--- Primera Compra ---");
        // Usamos printf para formatear los números a 2 decimales, igual que en Python.
        System.out.printf("Monto total de la compra: $%.2f%n", montoCompra1);
        System.out.printf("Descuento aplicado (10%% por defecto): $%.2f%n", descuento1);
        System.out.printf("Monto final a pagar: $%.2f%n", montoFinal1);
        System.out.println("-------------------------");

        // --- Llamada 2: Proporcionando un porcentaje de descuento específico (15%) ---
        double montoCompra2 = 1250.50;
        double porcentaje2 = 15;
        // Se llama al método que recibe tanto el monto como el porcentaje.
        double descuento2 = calcularDescuento(montoCompra2, porcentaje2);
        double montoFinal2 = montoCompra2 - descuento2;

        System.out.println("\n--- Segunda Compra ---");
        System.out.printf("Monto total de la compra: $%.2f%n", montoCompra2);
        System.out.printf("Descuento aplicado (%.0f%%): $%.2f%n", porcentaje2, descuento2);
        System.out.printf("Monto final a pagar: $%.2f%n", montoFinal2);
        System.out.println("-------------------------");
    }

    /**
     * Calcula el descuento aplicando un porcentaje específico al monto total.
     * @param montoTotal El monto total de la compra.
     * @param porcentajeDescuento El porcentaje a descontar.
     * @return El monto del descuento calculado.
     */
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100.0);
    }

    /**
     * Calcula el descuento usando un valor por defecto del 10%.
     * Esto se llama "sobrecarga de métodos" (method overloading) y es la forma
     * en Java de simular parámetros por defecto.
     * @param montoTotal El monto total de la compra.
     * @return El monto del descuento calculado con 10%.
     */
    public static double calcularDescuento(double montoTotal) {
        // Llama a la otra función 'calcularDescuento' con el valor por defecto de 10.
        return calcularDescuento(montoTotal, 10.0);
    }
}
    
    

