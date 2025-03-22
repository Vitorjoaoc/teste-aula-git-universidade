/*Em um estacionamento há carros e motos. Escreva um algoritmo que solicite ao usuário o total de veículos e o total de rodas.
O algoritmo deve determinar quantos carros e quantas motos há no
estacionamento. O resultado deve ser apresentado na tela para o usuário. */


import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o total de veículos e rodas
        System.out.print("Informe o total de veículos no estacionamento: ");
        int totalVeiculos = scanner.nextInt();
        
        System.out.print("Informe o total de rodas no estacionamento: ");
        int totalRodas = scanner.nextInt();
        
        // Calculando a quantidade de carros e motos
        int motos = (totalRodas - (totalVeiculos * 4)) / -2;
        int carros = totalVeiculos - motos;
        
        // Exibindo o resultado
        System.out.println("Quantidade de carros: " + carros);
        System.out.println("Quantidade de motos: " + motos);
        
        // Fechando o scanner
        scanner.close();
    }
}
