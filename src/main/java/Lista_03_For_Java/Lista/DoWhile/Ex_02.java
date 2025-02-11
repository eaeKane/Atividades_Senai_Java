package Lista_03_For_Java.Lista.DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Ex_02 {
    public static void EX31() {
        System.out.println("Questão 31: Peça para o usuário digitar um número e continue pedindo até que ele informe um número negativo.");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
        } while (num >= 0);
    }

    public static void EX32() {
        System.out.println("Questão 32: Solicite números ao usuário e some-os até que o usuário digite zero.");
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma += num;
        } while (num != 0);
        System.out.println("A soma total é: " + soma);
    }

    public static void EX33() {
        System.out.println("Questão 33: Exiba os números de 1 a 10 usando do while.");
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void EX34() {
        System.out.println("Questão 34: Exiba os números de 10 a 1 usando do while.");
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }

    public static void EX35() {
        System.out.println("Questão 35: Exiba a tabuada do número informado pelo usuário usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }

    public static void EX36() {
        System.out.println("Questão 36: Calcule a soma dos números de 1 a 50 usando do while.");
        int i = 1, soma = 0;
        do {
            soma += i;
            i++;
        } while (i <= 50);
        System.out.println("A soma dos números de 1 a 50 é: " + soma);
    }

    public static void EX37() {
        System.out.println("Questão 37: Exiba os números pares de 1 a 20 usando do while.");
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }

    public static void EX38() {
        System.out.println("Questão 38: Exiba os números ímpares de 1 a 20 usando do while.");
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }

    public static void EX39() {
        System.out.println("Questão 39: Solicite números ao usuário e exiba apenas os positivos, parando quando for negativo.");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num >= 0) {
                System.out.println("Número positivo: " + num);
            }
        } while (num >= 0);
    }

    public static void EX40() {
        System.out.println("Questão 40: Conte e exiba quantos números foram digitados antes de o usuário digitar zero.");
        Scanner sc = new Scanner(System.in);
        int num, count = 0;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            count++;
        } while (num != 0);
        System.out.println("Você digitou " + (count - 1) + " números antes de digitar zero.");
    }

    public static void EX41() {
        System.out.println("Questão 41: Exiba os caracteres de uma string informada pelo usuário usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();
        int i = 0;
        do {
            System.out.println(texto.charAt(i));
            i++;
        } while (i < texto.length());
    }

    public static void EX42() {
        System.out.println("Questão 42: Exiba uma string informada pelo usuário de trás para frente usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = sc.nextLine();
        int i = texto.length() - 1;
        do {
            System.out.print(texto.charAt(i));
            i--;
        } while (i >= 0);
        System.out.println();
    }

    public static void EX43() {
        System.out.println("Questão 43: Calcule a soma dos dígitos de um número informado pelo usuário usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int soma = 0;
        do {
            soma += num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println("A soma dos dígitos é: " + soma);
    }

    public static void EX44() {
        System.out.println("Questão 44: Exiba os divisores de um número informado pelo usuário usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);
    }

    public static void EX45() {
        System.out.println("Questão 45: Gere a sequência de Fibonacci até um valor máximo informado pelo usuário.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor máximo: ");
        int max = sc.nextInt();
        int num1 = 0, num2 = 1, proximo;
        do {
            System.out.print(num1 + " ");
            proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        } while (num1 <= max);
        System.out.println();
    }

    public static void EX46() {
        System.out.println("Questão 46: Exiba os primeiros 10 múltiplos de um número informado pelo usuário usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(num * i);
            i++;
        } while (i <= 10);
    }

    public static void EX47() {
        System.out.println("Questão 47: Verifique se um número informado pelo usuário é primo usando do while.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int i = 2;
        boolean primo = true;
        do {
            if (num % i == 0) {
                primo = false;
                break;
            }
            i++;
        } while (i <= num / 2);
        if (primo && num > 1) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }
    }

    public static void EX48() {
        System.out.println("Questão 48: Solicite um número e informe se é par ou ímpar, repetindo até que seja digitado zero.");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " é par.");
                } else {
                    System.out.println(num + " é ímpar.");
                }
            }
        } while (num != 0);
    }

    public static void EX49() {
        System.out.println("Questão 49: Gere uma senha aleatória de 6 caracteres usando do while.");
        Random rand = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder senha = new StringBuilder();
        int i = 0;

        do {
            int index = rand.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
            i++;
        } while (i < 6);
        System.out.println("Senha gerada: " + senha.toString());
    }


    public static void EX50() {
        System.out.println("Questão 50: Solicite a senha do usuário e continue pedindo até que ele digite a correta.");
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "123456";
        String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals(senhaCorreta));
        System.out.println("Senha correta!");
    }

    public static void EX51() {
        System.out.println("Questão 51: Exiba os primeiros 10 números perfeitos usando do while.");
        int num = 1, count = 0;
        do {
            int somaDivisores = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }
            if (somaDivisores == num) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }

    public static void EX52() {
        System.out.println("Questão 52: Exiba os primeiros 10 números primos usando do while.");
        int num = 2, count = 0;
        do {
            boolean primo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }

    public static void EX53() {
        System.out.println("Questão 53: Exiba a sequência de números triangulares até o décimo termo usando do while.");
        int i = 1;
        do {
            int triangulo = (i * (i + 1)) / 2;
            System.out.println(triangulo);
            i++;
        } while (i <= 10);
    }

    public static void EX54() {
        System.out.println("Questão 54: Solicite um número ao usuário e exiba sua raiz quadrada, repetindo até que o número informado seja negativo.");
        Scanner sc = new Scanner(System.in);
        double num;
        do {
            System.out.print("Digite um número: ");
            num = sc.nextDouble();
            if (num >= 0) {
                System.out.println("A raiz quadrada de " + num + " é: " + Math.sqrt(num));
            }
        } while (num >= 0);
    }

    public static void EX55() {
        System.out.println("Questão 55: Exiba um triângulo de números com base 5 usando do while.");
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(i + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.print("Escolha qual questão deseja ver: ");

            questao = sc.nextInt();

            switch (questao) {
                case 1:
                    EX31();
                    break;

                case 2:
                    EX32();
                    break;

                case 3:
                    EX33();
                    break;

                case 4:
                    EX34();
                    break;

                case 5:
                    EX35();
                    break;

                case 6:
                    EX36();
                    break;

                case 7:
                    EX37();
                    break;

                case 8:
                    EX38();
                    break;

                case 9:
                    EX39();
                    break;

                case 10:
                    EX40();
                    break;

                case 11:
                    EX41();
                    break;

                case 12:
                    EX42();
                    break;

                case 13:
                    EX43();
                    break;

                case 14:
                    EX44();
                    break;

                case 15:
                    EX45();
                    break;
                case 16:
                    EX46();
                    break;
                case 17:
                    EX47();
                    break;
                case 18:
                    EX48();
                    break;
                case 19:
                    EX49();
                    break;
                case 20:
                    EX50();
                    break;
                case 21:
                    EX51();
                    break;
                case 22:
                    EX52();
                    break;
                case 23:
                    EX53();
                    break;
                case 24:
                    EX54();
                    break;
                case 25:
                    EX55();
                    break;
                case 26:

                case 0:
                    System.out.println("Obrigado por acessar!!");

                default:
                    System.out.println("Opção inválida");
            }

        } while (questao != 0);
        sc.close();
    }

}

