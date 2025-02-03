package Lista_01.EX_08_Java;


import java.util.Scanner;

public class Ex_08 {


    public static void EX08_01() {
        System.out.println("Questão 8.1: Receba dois números e determine se ambos são positivos ou negativos.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Ambos os números são positivos.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Ambos os números são negativos.");
        } else {
            System.out.println("Um número é positivo e o outro é negativo.");
        }
    }


    public static void EX08_02() {
        System.out.println("Questão 8.2: Verifique se um número é maior que o dobro de outro.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > 2 * num2) {
            System.out.println(num1 + " é maior que o dobro de " + num2);
        } else if (num2 > 2 * num1) {
            System.out.println(num2 + " é maior que o dobro de " + num1);
        } else {
            System.out.println("Nenhum dos números é maior que o dobro do outro.");
        }
    }


    public static void EX08_03() {
        System.out.println("Questão 8.3: Crie um jogo de adivinhação.");
        Scanner sc = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 10) + 1; // Sorteia um número entre 1 e 10
        System.out.println("Tente adivinhar o número secreto (entre 1 e 10): ");
        int palpite = sc.nextInt();

        if (palpite == numeroSecreto) {
            System.out.println("Parabéns! Você acertou o número secreto!");
        } else {
            System.out.println("Que pena! O número secreto era " + numeroSecreto + ". Tente novamente!");
        }
    }


    public static void EX08_04() {
        System.out.println("Questão 8.4: Receba três números e exiba-os em ordem crescente.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Ordem crescente: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Ordem crescente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Ordem crescente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Ordem crescente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Ordem crescente: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }


    public static void EX08_05() {
        System.out.println("Questão 8.5: Determine se o usuário acertou um número entre 1 e 10 sorteado pelo programa.");
        Scanner sc = new Scanner(System.in);
        int numeroSorteado = (int) (Math.random() * 10) + 1; // Sorteia um número entre 1 e 10
        System.out.println("Digite um número entre 1 e 10: ");
        int palpite = sc.nextInt();

        if (palpite == numeroSorteado) {
            System.out.println("Você acertou! O número sorteado foi " + numeroSorteado);
        } else {
            System.out.println("Você errou! O número sorteado foi " + numeroSorteado);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver:");
            System.out.println("8.1 - Receba dois números e determine se ambos são positivos ou negativos.");
            System.out.println("8.2 - Verifique se um número é maior que o dobro de outro.");
            System.out.println("8.3 - Crie um jogo de adivinhação.");
            System.out.println("8.4 - Receba três números e exiba-os em ordem crescente.");
            System.out.println("8.5 - Determine se o usuário acertou um número entre 1 e 10 sorteado pelo programa.");

            questao = sc.nextInt();
            switch (questao) {
                case 1:
                    EX08_01();
                    break;
                case 2:
                    EX08_02();
                    break;
                case 3:
                    EX08_03();
                    break;
                case 4:
                    EX08_04();
                    break;
                case 5:
                    EX08_05();
                    break;
                case 0:
                    System.out.println("Obrigado por acessar!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (questao != 0);

        sc.close();
    }
}


