package Lista_03_For_Java;

import java.util.Scanner;

public class Ex_01 {

    public static void EX01() {
        System.out.println("Escreva um programa que exiba os números de 1 a 10.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void EX02() {
        System.out.println("Questão 2: Exiba os números de 10 a 1.");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void EX03() {
        System.out.println("Questão 3: Exiba os números pares de 2 a 20.");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void EX04() {
        System.out.println("Questão 4: Exiba os números ímpares de 1 a 19.");
        for (int i = 1; i <= 19; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void EX05() {
        System.out.println("Questão 5: Calcule a soma dos números de 1 a 100.");
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            num += i;
        }
        System.out.println(num);
    }

    public static void EX06() {
        System.out.println("Questão 6: Calcule a soma dos números pares de 1 a 100.");
        int num = 0;
        for (int i = 0; i <= 100; i += 2) {
            num += i;
        }
        System.out.println(num);
    }

    public static void EX07() {
        System.out.println("Questão 7: Calcule a soma dos números ímpares de 1 a 100.");
        int num = 0;
        for (int i = 1; i <= 100; i += 2) {
            num += i;
        }
        System.out.println(num);
    }

    public static void EX08() {
        System.out.println("Questão 8: Exiba a tabuada do número 7.");
        System.out.println("TABUADA DO 7");
        int num = 7;
        int tabuada = 7;
        for (int i = 1; i <= 10; i++) {
            num = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + num);
        }
    }

    public static void EX9() {
        System.out.println("Questão 9: Exiba a tabuada do número informado pelo usuário.");
        System.out.println("Digite um número para sabar a tabuada: ");
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int tabuada = sc.nextInt();
        System.out.println("TABUADA DO " + tabuada);
        for (int i = 1; i <= 10; i++) {
            num = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + num);
        }
    }

    public static void EX10() {
        System.out.println("Questão 10: Exiba os primeiros 10 múltiplos de 5. ");
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }

    public static void EX11() {
        System.out.println("Exiba os quadrados dos números de 1 a 10. ");
        int num = 1;
        for (int i = 1; i <= 10; i++) {
            num = i * i;
            System.out.println(num);
        }
    }

    public static void EX12() {
        System.out.println("Exiba os cubos dos números de 1 a 10. ");
        int num = 1;
        for (int i = 1; i <= 10; i++) {
            num = i * i * i;
            System.out.println(num);
        }

    }

    public static void EX13() {
        System.out.println("Exiba os primeiros 10 termos da sequência de Fibonacci.");
        int num1 = 0, num2 = 1, proximo;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " ");
            proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        }
    }

    public static void EX14() {
        System.out.println("Verifique e exiba os números primos entre 1 e 50.");
        for (int i = 2; i <= 50; i++) {
            boolean isPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(i + " ");
            }
        }
    }

    public static void EX15() {
        System.out.println("Exiba os números de 1 a 100, substituindo múltiplos de 3 por Fizz; e múltiplos de 5\n" +
                "por Buzz.");
        for (int i = 1; i <= 100; i++) {
            System.out.println(
                    (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" :
                            (i % 3 == 0) ? "Fizz" :
                                    (i % 5 == 0) ? "Buzz" :
                                            i
            );
        }
    }

    public static void EX16() {
        System.out.println("Exiba os caracteres de uma string informada pelo usuário.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }

    public static void EX17() {
        System.out.println("Exiba a string informada pelo usuário de trás para frente.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.println(palavra.charAt(i));
        }
    }

    public static void EX18() {
        System.out.println("Questão 18: Verifique se uma string informada pelo usuário é um palíndromo.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine();
        String textoInvertido = new StringBuilder(texto).reverse().toString();

        if (texto.equalsIgnoreCase(textoInvertido)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }

    public static void EX19() {
        System.out.println("Questão 19: Calcule o fatorial de um número informado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);
    }

    public static void EX20() {
        System.out.println("Questão 20: Exiba os números de 1 a 50 pulando de 5 em 5.");
        for (int i = 1; i <= 50; i += 5) {
            System.out.println(i);
        }
    }

    public static void EX21() {
        System.out.println("Questão 21: Exiba a soma dos dígitos de um número informado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int soma = 0;

        while (num != 0) {
            soma += num % 10;
            num /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }

    public static void EX22() {
        System.out.println("Questão 22: Exiba os divisores de um número informado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("Divisores de " + num + ":");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void EX23() {
        System.out.println("Questão 23: Exiba todos os números entre 1 e 200 que sejam divisíveis por 4.");
        for (int i = 1; i <= 200; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void EX24() {
        System.out.println("Questão 24: Exiba a sequência de números triangulares até o décimo termo.");
        for (int i = 1; i <= 10; i++) {
            int triangulo = (i * (i + 1)) / 2;
            System.out.println(triangulo);
        }
    }

    public static void EX25() {
        System.out.println("Questão 25: Gere um padrão de asteriscos em formato de triângulo com altura 5.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void EX26() {
        System.out.println("Questão 26: Exiba um losango de números com base 5.");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void EX27() {
        System.out.println("Questão 27: Exiba a soma dos números de um vetor de inteiros.");
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }

    public static void EX28() {
        System.out.println("Questão 28: Exiba a média dos números de um vetor de inteiros.");
        int[] vetor = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / (double) vetor.length;
        System.out.println("A média dos elementos do vetor é: " + media);
    }

    public static void EX29() {
        System.out.println("Questão 29: Ordene um vetor de inteiros em ordem crescente (utilizando o algoritmo de seleção).");
        int[] vetor = {5, 3, 8, 1, 2};

        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[minIndex];
            vetor[minIndex] = temp;
        }

        System.out.println("Vetor ordenado: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void EX30() {
        System.out.println("Questão 30: Conte quantos números pares e ímpares existem em um vetor de inteiros.");
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int pares = 0, impares = 0;

        for (int num : vetor) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.print("Escolha qual questão deseja ver: ");

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
                    EX9();
                    break;

                case 10:
                    EX10();
                    break;

                case 11:
                    EX11();
                    break;

                case 12:
                    EX12();
                    break;

                case 13:
                    EX13();
                    break;

                case 14:
                    EX14();
                    break;

                case 15:
                    EX15();
                    break;
                case 16:
                    EX16();
                    break;
                case 17:
                    EX17();
                    break;
                case 18:
                    EX18();
                    break;
                case 19:
                    EX19();
                    break;
                case 20:
                    EX20();
                    break;
                case 21:
                    EX21();
                    break;
                case 22:
                    EX22();
                    break;
                case 23:
                    EX23();
                    break;
                case 24:
                    EX24();
                    break;
                case 25:
                    EX25();
                    break;
                case 26:
                    EX26();
                    break;
                case 27:
                    EX27();
                    break;
                case 28:
                    EX28();
                    break;
                case 29:
                    EX29();
                    break;
                case 30:
                    EX30();
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

