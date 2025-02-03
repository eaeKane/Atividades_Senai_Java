package Lista_01.EX_05_Java;

import java.util.Scanner;

public class Ex_05 {

    public static void EX01() {
        System.out.println("Questão 1: Determine a categoria de uma pessoa com base em sua idade: criança,\n" +
                "adolescente, adulto ou idoso.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("você é um adulto.");
        } else if (idade >= 60) {
            System.out.println("Você é um idoso.");
        } else {
            System.out.println("Digite um idade válida.");
        }
    }

    public static void EX02() {
        System.out.println("Questão 2:Verifique se um número pertence à faixa de classificação A (1 a 10), B\n" +
                "(11 a 20) ou C (21 a 30).");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if (idade <= 10) {
            System.out.println("Sua faixa de classificação é A");
        } else if (idade >= 11 && idade <= 20) {
            System.out.println("Sua faixa de classificação é B");
        } else if (idade >= 21 && idade <= 30) {
            System.out.println("Sua faixa de classificação é C");
        } else {
            System.out.println("Digite um valor válido.");
        }
    }

    public static void EX03() {
        System.out.println("Questão 3: Receba a altura de uma pessoa e determine se ela é considerada baixa,\n" +
                "média ou alta.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        float altura = sc.nextByte();

        if (altura >= 1.50 && altura <= 1.60) {
            System.out.println("Sua altura é considerada baixa.");
        } else if (altura >= 1.61 && altura <= 1.79) {
            System.out.println("Sua altura é considerada média.");
        } else if (altura >= 1.80) {
            System.out.println("Sua altura é considerada alta.");
        } else {
            System.out.println("Digite um valor válido.");
        }
    }

    public static void EX04() {
        System.out.println("");
        System.out.println("Questão 4: Verifique o nível de risco de uma pessoa baseado na pressão arterial\n" +
                "(normal, moderado ou alto).");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua pressão arterial: ");
        float pressao = sc.nextByte();

        if (pressao <= 12.8) {
            System.out.println("Sua pressão arterial está boa, risco normal ou moderado.");
        } else if (pressao >= 14) {
            System.out.println("Sua pressão está alta, risco alto.");
        } else if (pressao <= 9) {
            System.out.println("Sua pressão está baixa, risco alto.");
        }
    }

    public static void EX05() {
        System.out.println("Questão 5: Receba a temperatura em graus Celsius e indique se está frio, agradável\n" +
                "ou quente.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        float temp = sc.nextByte();

        if (temp < 19) {
            System.out.println(temp + "°");
            System.out.println("O clima está frio");
        } else if (temp >= 20 && temp <= 26) {
            System.out.println(temp + "°");
            System.out.println("O clima está agradável.");
        } else if (temp > 26) {
            System.out.println(temp + "°");
            System.out.println("O clima está quente.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver");
            System.out.println("Questão 1: Determine a categoria de uma pessoa com base em sua idade: criança,\n" +
                    "adolescente, adulto ou idoso.");
            System.out.println("Questão 2:Verifique se um número pertence à faixa de classificação A (1 a 10), B\n" +
                    "(11 a 20) ou C (21 a 30).");
            System.out.println("Questão 3: Receba a altura de uma pessoa e determine se ela é considerada baixa,\n" +
                    "média ou alta.");
            System.out.println("Questão 4: Verifique o nível de risco de uma pessoa baseado na pressão arterial\n" +
                    "(normal, moderado ou alto).");
            System.out.println("Questão 5: Receba a temperatura em graus Celsius e indique se está frio, agradável\n" +
                    "ou quente.");

            questao = sc.nextInt();
            switch (questao) {

                case 1:
                    EX01();
                    break;
                case 2:
                    EX02();
                    break;
                case 3:
                    EX03();
                    break;
                case 4:
                    EX04();
                    break;
                case 5:
                    EX05();
                    break;
                case 0:
                    System.out.println("Obrigado por acessar!");
                    break;

                default:
                    System.out.println("Opção inválida");

            }
        } while (questao != 0);

        sc.close();
    }
}
