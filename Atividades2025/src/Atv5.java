/*5- Faça um programa que peça o valor de uma viagem “eurotrip” que será
realizada por um grupo de amigos. Os brasileiros sairão com destino a
três locais: 1o Alemanha, 2o Portugal e 3o Itália.

O programa deve solicitar o preço atual de cada viagem, a quantidade
de pessoas que irão nessa viagem. Após isso, imprimir o valor total da
viagem somando a quantidade total de pessoas que visitarão todos os
03 destinos.*/

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o preço das viagens
        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        
        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();
        
        System.out.print("Digite o preço da viagem para a Itália: ");
        double precoItalia = scanner.nextDouble();
        
        // Solicitando a quantidade de pessoas na viagem
        System.out.print("Digite a quantidade de pessoas que irão na viagem: ");
        int quantidadePessoas = scanner.nextInt();
        
        // Calculando o valor total da viagem
        double valorTotal = (precoAlemanha + precoPortugal + precoItalia) * quantidadePessoas;
        
        // Exibindo o valor total da viagem
        System.out.println("O valor total da viagem para todas as pessoas é: R$ " + valorTotal);
        
        // Fechando o scanner
        scanner.close();
    }
}
