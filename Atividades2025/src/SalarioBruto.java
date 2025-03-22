/*Escreva um algoritmo para calcular e imprimir o salário bruto a ser recebido por um funcionário em um mês.
O programa deverá utilizar os seguintes dados:
a. Número de horas que o funcionário trabalhou no mês.
b. Valor recebido por hora de trabalho.
c. Valor do salário família.
d. Número de filhos com idade menor que 14 anos, para calcular o salário família. */


import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando os dados do funcionário
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Informe o valor recebido por hora de trabalho: ");
        double valorPorHora = scanner.nextDouble();
        
        System.out.print("Informe o valor do salário família por filho: ");
        double salarioFamiliaPorFilho = scanner.nextDouble();
        
        System.out.print("Informe o número de filhos com idade menor que 14 anos: ");
        int numeroFilhos = scanner.nextInt();
        
        // Calculando o salário bruto
        double salarioBruto = (horasTrabalhadas * valorPorHora) + (salarioFamiliaPorFilho * numeroFilhos);
        
        // Exibindo o salário bruto formatado com 2 casas decimais
        System.out.printf("O salário bruto a ser recebido é: R$ %.2f%n", salarioBruto);
        
        // Fechando o scanner
        scanner.close();
    }
}
