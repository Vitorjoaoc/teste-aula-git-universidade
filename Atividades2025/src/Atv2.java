// 2- Faça um Programa que peça dois números e imprima a soma, a subtração e a multiplicação do primeiro pelo segundo.

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
         // Criando um objeto Scanner para ler a entrada do usuário
         Scanner scanner = new Scanner(System.in);
        
         // Solicitando dois números ao usuário
         System.out.print("Digite o primeiro número: ");
         double numero1 = scanner.nextDouble();
         
         System.out.print("Digite o segundo número: ");
         double numero2 = scanner.nextDouble();
         
         // Realizando as operações
         double soma = numero1 + numero2;
         double subtracao = numero1 - numero2;
         double multiplicacao = numero1 * numero2;
         
         // Exibindo os resultados
         System.out.println("Soma: " + soma);
         System.out.println("Subtração: " + subtracao);
         System.out.println("Multiplicação: " + multiplicacao);
         
         // Fechando o scanner
         scanner.close();
        
    }
}
