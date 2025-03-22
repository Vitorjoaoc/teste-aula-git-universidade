/*Escreva um algoritmo que leia o salário fixo de um vendedor, o valor total das vendas que ele realizou no mês e o percentual que ele ganha sobre o total das vendas mensais. O algoritmo deve calcular o salário total do vendedor e apresentá-lo na tela. */


import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os dados do vendedor
        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Informe o valor total das vendas no mês: ");
        double totalVendas = scanner.nextDouble();
        
        System.out.print("Informe o percentual de comissão sobre as vendas (em %): ");
        double percentualComissao = scanner.nextDouble();
        
        // Calculando o salário total
        double salarioTotal = salarioFixo + (totalVendas * (percentualComissao / 100));
        
        // Exibindo o salário total formatado com 2 casas decimais
        System.out.printf("O salário total do vendedor é: R$ %.2f%n", salarioTotal);
        
        // Fechando o scanner
        scanner.close();
    }
}