
package com.mycompany.calculodetemperatura;


public class CalculodeTemperatura {

    public static void main(String[] args) {
        System.out.println("calculodetemperatura");

        
        // Matriz de datos: 3 ciudades (filas) x 4 semanas (columnas).
        double[][] weeklyTemperatures = {
            {11.9, 17.0, 10.8, 19.2}, // Datos para Ambato
            {28.2, 21.0, 24.3, 25.6}, // Datos para Puyo
            {18.6, 12.1, 16.6, 15.5}  // Datos para Loja
        };

        // Nombres de las ciudades para el reporte final.
        String[] cityNames = {"Ambato", "Puyo", "Loja"};

        // Llamamos a la función para que realice el cálculo.
        double[] averageResults = calculateAverageTemperatures(weeklyTemperatures);

        // Imprimimos los resultados de forma clara y ordenada.
        System.out.println("--- Reporte de Temperaturas Promedio ---");
        for (int i = 0; i < averageResults.length; i++) {
            System.out.printf("El promedio para %s es: %.2f°C\n", cityNames[i], averageResults[i]);
        }
    }

    /**
     * Calcula la temperatura promedio para cada ciudad a partir de una matriz de datos.
     * @param temperatures Matriz 2D donde cada fila es una ciudad.
     * @return Un array con el promedio de cada ciudad.
     */
    public static double[] calculateAverageTemperatures(double[][] temperatures) {
        int numberOfCities = temperatures.length;
        double[] averages = new double[numberOfCities];

        for (int i = 0; i < numberOfCities; i++) {
            double sum = 0;
            int numberOfWeeks = temperatures[i].length;
            for (int j = 0; j < numberOfWeeks; j++) {
                sum += temperatures[i][j];
            }
            averages[i] = sum / numberOfWeeks;
        }
        return averages;
    }
}
    
    
    
    


