/*Escreva um algoritmo que leia o preço de um produto a partir do teclado e
apresente na tela o valor do produto acrescido de 10% de seu valor original.
Exemplo:
Informe o valor do produto: 50.00
Novo valor do produto: 55.00 */


import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o preço do produto ao usuário
        System.out.print("Informe o valor do produto: ");
        double precoOriginal = scanner.nextDouble();
        
        // Calculando o novo valor com acréscimo de 10%
        double novoPreco = precoOriginal * 1.10;
        
        // Exibindo o novo valor do produto formatado com 2 casas decimais
        System.out.printf("Novo valor do produto: %.2f%n", novoPreco);
        
        // Fechando o scanner
        scanner.close();
    }
}
