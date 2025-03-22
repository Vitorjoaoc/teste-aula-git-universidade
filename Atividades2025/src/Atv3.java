// 3- Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando as quatro notas bimestrais ao usuário
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
        // Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Exibindo a média
        System.out.println("A média das notas é: " + media);
        
        // Fechando o scanner
        scanner.close();
        
    }
}
