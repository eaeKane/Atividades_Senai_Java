package Lista_01.EX_04_Java;

import java.util.Scanner;

public class Ex_04 {

    public static void EX01() {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int result;
        System.out.println("Questão 1: Receba dois números e indique se sua soma é maior que 100.");
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        result = n1 + n2;
        if (result > 100) {
            System.out.println(n1 + " + " + n2 + " é igual a " + result);
            System.out.println("A soma dos números é maior do que 100.");
        } else if (result == 100) {
            System.out.println(n1 + " + " + n2 + " é igual a " + result);
            System.out.println("A soma dos números é exatamente 100.");
        } else {
            System.out.println(n1 + " + " + n2 + " é igual a " + result);
            System.out.println("A soma dos números é menor que 100.");
        }
    }

    public static void EX02() {
        System.out.println("Questão 2: Verifique se a diferença entre dois números é negativa. ");
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int diferenca;
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        diferenca = n1 - n2;

        if (diferenca < 0) {
            System.out.println(n1 + " - " + n2 + " é igual a " + diferenca);
            System.out.println("A diferença dos números é negativa.");
        } else {
            System.out.println(n1 + " - " + n2 + " é igual a " + diferenca);
            System.out.println("A diferença entre os número NÃO é negativa.");
        }
    }

    public static void EX03() {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int result;
        System.out.println("Questão 3: Receba dois números e indique se um é divisível pelo outro.");
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        result = n1 % n2;
        if (result == 0) {
            System.out.println(n1 + " % " + n2 + " = " + result);
            System.out.println(n1 + " é divisivel por " + n2);
        } else if (n1 % n2 != 0) {
            System.out.println(n1 + " % " + n2 + " = " + result);
            System.out.println(n1 + " não é divisivel por " + n2);
        } else {
            System.out.println("Ação inválida!");
        }
    }

    public static void EX04() {
        Scanner sc = new Scanner(System.in);
        float LadoA;
        float LadoB;
        float LadoC;
        System.out.println("Questão 4: Receba três números e verifique se eles podem formar um triângulo. ");
        System.out.println("Digite o número do lado A: ");
        LadoA = sc.nextByte();
        System.out.println("Digite o número do lado B: ");
        LadoB = sc.nextByte();
        System.out.println("Digite o número do lado C: ");
        LadoC = sc.nextByte();

        if (LadoA + LadoB > LadoC && LadoA + LadoC > LadoB && LadoB + LadoC > LadoA) {
            System.out.println("Os números podem formar um triangulo.");
        } else {
            System.out.println("Os número não podem formar um triangulo.");
        }

    }

    public static void EX05() {
        System.out.println("Questão 5: Receba um número e indique se ele é um quadrado perfeito.");
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um número para saber se ele é um quadrado perfeito.");
        n1 = sc.nextInt();
        double raiz = Math.sqrt(n1);

        if (raiz == (int) raiz) {
            System.out.println(n1 + " é um quadrado perfeito.");
        } else {
            System.out.println(n1 + " não é um quadrado perfeito.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver");
            System.out.println("Questão 1: Receba dois números e indique se sua soma é maior que 100. ");
            System.out.println("Questão 2: Verifique se a diferença entre dois números é negativa. ");
            System.out.println("Questão 3: Receba dois números e indique se um é divisível pelo outro.");
            System.out.println("Questão 4: Receba três números e verifique se eles podem formar um triângulo. ");
            System.out.println("Questão 5: Receba um número e indique se ele é um quadrado perfeito.");

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
                    System.out.println("Opção inválida!");
            }
        } while (questao != 0);

    }
}
