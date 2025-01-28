package Aula2_Java;

import java.util.Scanner;

public class Ex_02 {
    public static void EX01() {
        Scanner sc = new Scanner(System.in);
        float n1;
        float n2;
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextFloat();
        float media = (n1 + n2) / 2;
        if (media >= 7) {
            System.out.println("A média do aluno é: " + media + ", aluno aprovado!");
        } else {
            System.out.println("A média do aluno é: " + media + ", aluno reprovado!");
        }
    }

    public static void EX02() {
        Scanner sc = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        float media;
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = sc.nextFloat();
        media = (n1 + n2 + n3) / 3;
        if (media >= 5 && media < 7) {
            System.out.println("Sua média é " + media + ", aluno de recuperação!");
        } else if (media < 5) {
            System.out.println("Sua média é " + media + ", aluno reprovado!");
        } else {
            System.out.println("Sua média é " + media + ", aluno aprovado!");
        }
    }

    public static void EX03() {
        Scanner sc = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        float maior = 0;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo número:");
        n2 = sc.nextFloat();
        System.out.println("Digite o terceiro número:");
        n3 = sc.nextFloat();
        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
        } else if (n3 > n1 && n3 > n2) {
            maior = n3;
        } else {
            System.out.println("Opção inválida!");
        }
        System.out.println("O maior número é: " + maior);

    }

    public static void EX04() {
        Scanner sc = new Scanner(System.in);
        float n1;
        System.out.println("Digite a nota para saber se foi aprovado: ");
        n1 = sc.nextFloat();
        if (n1 == 10) {
            System.out.println("PARABENS!! Você foi aprovado com nota total. 10!");
        } else if (n1 >= 5 && n1 <= 9) {
            System.out.println("Parabens, você foi aprovado, sua nota foi " + n1 + ".");
        } else if (n1 <= 4) {
            System.out.println("Você foi reprovado, sua nota foi " + n1 + ".");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void EX05() {
        Scanner sc = new Scanner(System.in);
        float Port;
        float Mat;
        float Cien;
        float Geo;
        int media = 0;
        System.out.println("Digite sua nota em Português: ");
        Port = sc.nextFloat();
        System.out.println("Português: " + Port);
        System.out.println("Digite sua nota em Matemática: ");
        Mat = sc.nextFloat();
        System.out.println("Matemática: " + Mat);
        System.out.println("Digite sua nota em Ciências: ");
        Cien = sc.nextFloat();
        System.out.println("Ciências: " + Cien);
        System.out.println("Digite sua nota em Geografia: ");
        Geo = sc.nextFloat();
        System.out.println("Geografia: " + Geo);
        if (Port >= 15) {
            media++;
        }
        if (Mat >= 15) {
            media++;
        }
        if (Cien >= 15) {
            media++;
        }
        if (Geo >= 15) {
            media++;

        } if (media == 0) {
            System.out.println("Você foi reprovado");
        }
        System.out.println("Você passou em " + media + " disciplinas.");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver: ");
            System.out.println("Questão 1: Receba duas notas e informe se o aluno foi aprovado (média >= 7).");
            System.out.println("Questão 2: Verifique se o aluno foi aprovado, em recuperação (média >= 5 e 7) ou\n" +
                    "reprovado.");
            System.out.println("Questão 3: Receba três notas e determine a maior e a menor nota.");
            System.out.println("Questão 4: Verifique se o aluno foi aprovado e recebeu nota máxima em uma\n" +
                    "disciplina (nota >= 10).");
            System.out.println("Questão 5: Verifique se o aluno foi aprovado em duas disciplinas diferentes.");
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
                    System.out.println("Obrigado por acessar!!");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        } while (questao != 0);
        sc.close();
    }
}
