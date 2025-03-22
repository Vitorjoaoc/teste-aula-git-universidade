/*Escreva um algoritmo que leia dois números informados pelo usuário a partir
do teclado e que apresente o resultado da média aritmética dos dois números
informados. */

import java.util.Scanner;

public class MediaA {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
         // Solicitando dois números ao usuário
         System.out.print("Digite o primeiro número: ");
         double numero1 = scanner.nextDouble();
         
         System.out.print("Digite o segundo número: ");
         double numero2 = scanner.nextDouble();
         
         // Calculando a média aritmética
         double media = (numero1 + numero2) / 2;
         
         // Exibindo o resultado
         System.out.println("A média aritmética dos dois números é: " + media);
         
         // Fechando o scanner
         scanner.close();
    }
}
