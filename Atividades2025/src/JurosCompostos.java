/*Escreva um algoritmo para calcular os juros compostos de uma aplicação
financeira. O algoritmo deve ler o valor do capital a ser aplicado, o prazo de
aplicação em meses, a taxa de juros mensal e apresentar na tela o montante a
ser recebido.
OBS: M = C × (1 + i)n , em que M é o montante a ser recebido, C é o capital aplicado, i é a taxa de juros e n é o prazo da aplicação. */


import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os dados da aplicação financeira
        System.out.print("Informe o capital inicial (C): ");
        double capital = scanner.nextDouble();
        
        System.out.print("Informe a taxa de juros mensal (em decimal, por exemplo, 0,05 para 5%): ");
        double taxaJuros = scanner.nextDouble();
        
        System.out.print("Informe o prazo da aplicação em meses (n): ");
        int prazo = scanner.nextInt();
        
        // Calculando o montante usando a fórmula dos juros compostos
        double montante = capital * Math.pow(1 + taxaJuros, prazo);
        
        // Exibindo o montante final formatado com 2 casas decimais
        System.out.printf("O montante ao final da aplicação será: R$ %.2f%n", montante);
        
        // Fechando o scanner
        scanner.close();
    }
}