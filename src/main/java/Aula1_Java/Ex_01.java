package Aula1_Java;

import java.util.Scanner;

public class Ex_01 {
    public static void EX01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é positivo ou negativo: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Este número é positivo");
        } else {
            System.out.println("Este número é negativo");

        }

    }

    public static void EX02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é par ou ímpar");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "é um número par.");
        } else {
            System.out.println(n + "é um número ímpar.");
        }

    }

    public static void EX03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para saber qual é o maior entre eles: ");
        System.out.println("Digite o primeiro: ");
        int n = sc.nextInt();
        System.out.println("Digite o segundo: ");
        int n2 = sc.nextInt();
        if (n > n2) {
            System.out.println(n + " é maior do que " + n2);
        } else if (n == n2) {
            System.out.println(n + " e " + n2 + " são iguais.");
        } else {
            System.out.println(n2 + " é maior do que " + n);
        }

    }

    public static void EX04() {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade para saber se ja está apto a votar: ");
        idade = sc.nextInt();
        if (idade >= 16) {
            System.out.println("Você ja pode votar. Vote consciente!");
        } else {
            System.out.println("Você ainda não pode votar. Enquanto isso, estude!");
        }

    }

    public static void EX05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números para saber qual o maior entre eles: ");
        System.out.println("Digite o primeiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro: ");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " é maior do que " + n1 + " e " + n2);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " é maior do que " + n1 + " e " + n3);
        } else {
            System.out.println(n3 + " é maior do que " + n1 + " e " + n2);
        }

    }

    public static void EX06() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano e descubra se ele é bissexto ou não: ");
        int ano = sc.nextInt();
        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

    }

    public static void EX07() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e descubro se ele é múltiplo de 5: ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println(n + " x 5 = " + (n * 5));
            System.out.println(n + " é múltiplo de 5.");
        }
    }

    public static void EX08() {
        Scanner sc = new Scanner(System.in);
        char[] vogal = {'a', 'e', 'i', 'o', 'u'};
        System.out.println("Digite um letra para saber se ela é vogal ou consoante: ");
        char character = sc.nextLine().charAt(0);
        int i = 0;
        boolean isVogal = false;
        while (i < vogal.length && !isVogal) {
            if (character == vogal[i]) {
                isVogal = true;
            }
            i++;
        }
        System.out.println("A letra '" + character + "'");
        if (isVogal) {
            System.out.println(" não");
        }
        System.out.println("é vogal.");
    }

    public static void EX09() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e saiba se ele está entre 10 e 50: ");
        int n = sc.nextInt();
        if (n >= 10 && n <= 50) {
            System.out.println(n + " está entre 10 e 50.");
        } else {
            System.out.println(n + " não está entre 10 e 50.");
        }
    }

    public static void EX10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e saiba se ele está entre 10 e 50: ");
        int n = sc.nextInt();
        if (n >= 100 && n <= 200) {
            System.out.println(n + " está dentro do intervalo de 100 e 200.");
        } else {
            System.out.println(n + " está fora do intervalo de 100 e 200.");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver: ");

            System.out.println("Questão 1: Verifique se um número é positivo ou negativo.");
            System.out.println("Questão 2: Determine se um número é par ou ímpar.");
            System.out.println("Questão 3: Receba dois números e exiba o maior deles.");
            System.out.println("Questão 4: Verifique se uma pessoa pode votar (idade mínima de 16 anos).");
            System.out.println("Questão 5: Receba três números e mostre o maior deles.");
            System.out.println("Questão 6: Determine se um ano é bissexto.");
            System.out.println("Questão 7: Verifique se um número é múltiplo de 5.");
            System.out.println("Questão 8: Receba um caractere e verifique se é uma vogal.");
            System.out.println("Questão 9: Verifique se um número está dentro do intervalo de 10 a 50.");
            System.out.println("Questão 10: Receba um número e exiba se está entre 100 e 200 ou fora desse\n" +
                    "intervalo.          ");


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

                case 6:
                    EX06();
                    break;

                case 7:
                    EX07();
                    break;
                case 8:
                    EX08();
                    break;
                case 9:
                    EX09();
                    break;
                case 10:
                    EX10();
                    break;
                case 0:
                    System.out.println("Obrigado por acessar!!");

                default:
                    System.out.println("Opção inválida");
            }

        } while (questao != 0);
        sc.close();
    }
}









