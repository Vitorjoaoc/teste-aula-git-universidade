// 1- Faça um Programa que peça um número e então mostre a mensagem: O número informado foi [número].

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando um número ao usuário
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        // Exibindo a mensagem com o número informado
        System.out.println("O número informado foi " + numero + ".");
        
        // Fechando o scanner
        scanner.close();
    }
}
