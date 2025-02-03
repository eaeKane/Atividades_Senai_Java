package Lista_01.EX_06_Java;

import java.util.Scanner;

public class Ex_06 {


    public static void EX06_01() {
        System.out.println("Questão 6.1: Verifique se o saldo em uma conta é suficiente para um saque.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o saldo da conta: ");
        float saldo = sc.nextFloat();
        System.out.println("Digite o valor do saque: ");
        float saque = sc.nextFloat();

        if (saque <= saldo) {
            System.out.println("Saque autorizado.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }


    public static void EX06_02() {
        System.out.println("Questão 6.2: Calcule o desconto em uma compra, baseado no valor total.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        float valorCompra = sc.nextFloat();

        if (valorCompra > 500) {
            float desconto = valorCompra * 0.10f;
            System.out.println("Desconto de 10% aplicado. Valor do desconto: R$ " + desconto);
        } else {
            System.out.println("Nenhum desconto aplicado.");
        }
    }


    public static void EX06_03() {
        System.out.println("Questão 6.3: Determine se uma pessoa pode financiar um imóvel.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário da pessoa: ");
        float salario = sc.nextFloat();

        if (salario >= 3000) {
            System.out.println("Você pode financiar o imóvel.");
        } else {
            System.out.println("Você não pode financiar o imóvel.");
        }
    }


    public static void EX06_04() {
        System.out.println("Questão 6.4: Verifique se uma pessoa pode comprar um produto parcelado.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário da pessoa: ");
        float salario = sc.nextFloat();
        System.out.println("Digite o valor da parcela: ");
        float parcela = sc.nextFloat();

        if (parcela <= salario * 0.10) {
            System.out.println("Você pode comprar o produto parcelado.");
        } else {
            System.out.println("O valor da parcela é maior do que 10% do seu salário.");
        }
    }


    public static void EX06_05() {
        System.out.println("Questão 6.5: Determine se um cliente ganha um brinde por atingir um valor mínimo de compra.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        float valorCompra = sc.nextFloat();

        if (valorCompra >= 300) {
            System.out.println("Você ganhou um brinde!");
        } else {
            System.out.println("Você não atingiu o valor mínimo para ganhar o brinde.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver:");
            System.out.println("6.1 - Verifique se o saldo em uma conta é suficiente para um saque.");
            System.out.println("6.2 - Calcule o desconto em uma compra.");
            System.out.println("6.3 - Determine se uma pessoa pode financiar um imóvel.");
            System.out.println("6.4 - Verifique se uma pessoa pode comprar um produto parcelado.");
            System.out.println("6.5 - Determine se um cliente ganha um brinde.");

            questao = sc.nextInt();
            switch (questao) {
                case 1:
                    EX06_01();
                    break;
                case 2:
                    EX06_02();
                    break;
                case 3:
                    EX06_03();
                    break;
                case 4:
                    EX06_04();
                    break;
                case 5:
                    EX06_05();
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
