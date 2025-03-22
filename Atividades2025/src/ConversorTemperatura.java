/*Escreva um algoritmo que leia uma temperatura fornecida pelo usuário a partir
do teclado em graus Fahrenheit e a converta para o seu equivalente em graus
centígrados.
OBS.: °C = (°F − 32) / 1,8 */


import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando a temperatura em Fahrenheit ao usuário
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convertendo para Celsius
        double celsius = (fahrenheit - 32) / 1.8;
        
        // Exibindo o resultado formatado com 2 casas decimais
        System.out.printf("A temperatura em Celsius é: %.2f°C%n", celsius);
        
        // Fechando o scanner
        scanner.close();
    }
}
