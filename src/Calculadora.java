/*
Aluno: Fabrício John Sullivan
dia: 5/12/2024
Projeto: Catalisa
Professora: Laura Fumagalli Rodrigues
atividade 3 (calculadora):
- Defina duas variáveis numéricas no código para representar os números que serão utilizados nos cálculos.
- Defina uma variável de controle para representar a operação desejada (por exemplo, um número ou caractere que indica a operação: 1 para adição, 2 para subtração, etc.).
- O programa deve realizar a operação escolhida e exibir o resultado no console.
- Caso a operação seja inválida, o programa deve exibir uma mensagem de erro.
- O programa deve tratar a divisão por zero, exibindo uma mensagem de erro caso isso ocorra.
*/
// Importando biblioteca
import java.util.Scanner;

// Iniciando o programa
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0; // Declaração da variável para armazenar a opção do usuário
// ----------------------------------------------------------------------------------------------------
// Loop para validar a opção
        while (opcao < 1 || opcao > 4) {
            System.out.println("Digite 1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão:");

            // Verifica se a entrada é um número inteiro
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                // Verifica se a opção está entre 1 e 4
                if (opcao < 1 || opcao > 4) {
                    System.out.println("Esta não é uma opção válida. Por favor, reescolha.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
//----------------------------------------------------------------------------------------------------

        // Lendo os números e criando o resultado
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

//----------------------------------------------------------------------------------------------------
        // Realiza a operação com base na escolha do usuário
        switch (opcao) {
            case 1: // Soma
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2: // Subtração
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3: // Multiplicação
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4: // Divisão
                // Tratamento para divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
        //----------------------------------------------------------------------------------------------------
        // Fecha o scanner
        scanner.close();
    }
}