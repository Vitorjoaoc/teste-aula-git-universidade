// 4- Faça um programa que peça o preço do litro da gasolina e solicite quantos litros foi vendido a determinado cliente. O programa deve informar quanto o cliente deverá pagar pela gasolina comprada.

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
         // Criando um objeto Scanner para ler a entrada do usuário
         Scanner scanner = new Scanner(System.in);
        
         // Solicitando o preço do litro da gasolina
         System.out.print("Digite o preço do litro da gasolina: ");
         double precoLitro = scanner.nextDouble();
         
         // Solicitando a quantidade de litros vendidos
         System.out.print("Digite a quantidade de litros vendidos: ");
         double litrosVendidos = scanner.nextDouble();
         
         // Calculando o valor total a ser pago
         double valorTotal = precoLitro * litrosVendidos;
         
         // Exibindo o valor total a ser pago
         System.out.println("O cliente deverá pagar: R$ " + valorTotal);
         
         // Fechando o scanner
         scanner.close();
    }
}
