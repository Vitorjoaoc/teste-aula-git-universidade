/*Escreva um algoritmo que receba dois números a partir do teclado. O algoritmo deve imprimir o logaritmo do primeiro número na base representada pelo segundo número. */


import java.util.Scanner;

public class Logaritmo {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os números ao usuário
        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Informe o segundo número (base do logaritmo): ");
        double numero2 = scanner.nextDouble();
        
        // Calculando o logaritmo de numero1 na base numero2
        double logaritmo = Math.log(numero1) / Math.log(numero2);
        
        // Exibindo o resultado formatado com 4 casas decimais
        System.out.printf("O logaritmo de %.2f na base %.2f é: %.4f%n", numero1, numero2, logaritmo);
        
        // Fechando o scanner
        scanner.close();
    }
}
