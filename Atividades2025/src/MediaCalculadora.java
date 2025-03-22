/*Escreva um algoritmo que, dados três valores, calcule e imprima as médias aritmética, harmônica e geométrica destes valores. */


import java.util.Scanner;

public class MediaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada dos valores
        System.out.print("Digite o primeiro valor (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor (b): ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o terceiro valor (c): ");
        double c = scanner.nextDouble();
        
        // Cálculo da média aritmética
        double mediaAritmetica = (a + b + c) / 3;
        
        // Cálculo da média harmônica
        double mediaHarmonica = 3 / ((1 / a) + (1 / b) + (1 / c));
        
        // Cálculo da média geométrica
        double mediaGeometrica = Math.cbrt(a * b * c);
        
        // Impressão dos resultados
        System.out.println("Média Aritmética: " + mediaAritmetica);
        System.out.println("Média Harmônica: " + mediaHarmonica);
        System.out.println("Média Geométrica: " + mediaGeometrica);
        
        scanner.close();
    }
}
