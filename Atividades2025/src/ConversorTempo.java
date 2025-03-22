/*Escreva um algoritmo que receba um número inteiro de segundos a partir do teclado e imprima na tela a quantidade correspondente em horas, minutos e segundos. */


import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o número de segundos ao usuário
        System.out.print("Informe a quantidade de segundos: ");
        int totalSegundos = scanner.nextInt();
        
        // Calculando horas, minutos e segundos
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        
        // Exibindo o resultado
        System.out.printf("%d segundos equivalem a %d horas, %d minutos e %d segundos.%n", totalSegundos, horas, minutos, segundos);
        
        // Fechando o scanner
        scanner.close();
    }
}
