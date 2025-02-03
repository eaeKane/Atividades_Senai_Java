package Lista_01.EX_09_Java;

import java.util.Scanner;

public class Ex_09 {


    public static void EX09_01() {
        System.out.println("Questão 9.1: Determine se um veículo pode passar em um pedágio (placa terminada em número par ou ímpar).");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da placa do veículo: ");
        String placa = sc.nextLine();
        int ultimoDigito = Character.getNumericValue(placa.charAt(placa.length() - 1));

        if (ultimoDigito % 2 == 0) {
            System.out.println("O veículo pode passar no pedágio (placa com número par).");
        } else {
            System.out.println("O veículo não pode passar no pedágio (placa com número ímpar).");
        }
    }


    public static void EX09_02() {
        System.out.println("Questão 9.2: Verifique se um número corresponde a um código de acesso.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código de acesso: ");
        int codigo = sc.nextInt();

        int codigoValido = 12345;
        if (codigo == codigoValido) {
            System.out.println("Código de acesso válido.");
        } else {
            System.out.println("Código de acesso inválido.");
        }
    }


    public static void EX09_03() {
        System.out.println("Questão 9.3: Receba uma temperatura em graus Celsius e converta para Fahrenheit ou Kelvin.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        float celsius = sc.nextFloat();

        System.out.println("Escolha a conversão:");
        System.out.println("1 - Para Fahrenheit");
        System.out.println("2 - Para Kelvin");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            float fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + "°C é igual a " + fahrenheit + "°F.");
        } else if (opcao == 2) {
            float kelvin = celsius + 273.15f;
            System.out.println(celsius + "°C é igual a " + kelvin + "K.");
        } else {
            System.out.println("Opção inválida.");
        }
    }


    public static void EX09_04() {
        System.out.println("Questão 9.4: Determine se uma pessoa está apta para doar sangue (idade entre 18 e 65 anos e peso >= 50 kg).");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o seu peso em kg: ");
        float peso = sc.nextFloat();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Você está apto para doar sangue.");
        } else {
            System.out.println("Você não está apto para doar sangue.");
        }
    }


    public static void EX09_05() {
        System.out.println("Questão 9.5: Crie um sistema simples de autenticação (usuário e senha).");
        Scanner sc = new Scanner(System.in);
        String usuarioValido = "admin";
        String senhaValida = "12345";

        System.out.println("Digite o nome de usuário: ");
        String usuario = sc.nextLine();
        System.out.println("Digite a senha: ");
        String senha = sc.nextLine();

        if (usuario.equals(usuarioValido) && senha.equals(senhaValida)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Usuário ou senha inválidos.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver:");
            System.out.println("9.1 - Determine se um veículo pode passar em um pedágio (placa terminada em número par ou ímpar).");
            System.out.println("9.2 - Verifique se um número corresponde a um código de acesso.");
            System.out.println("9.3 - Receba uma temperatura em graus Celsius e converta para Fahrenheit ou Kelvin.");
            System.out.println("9.4 - Determine se uma pessoa está apta para doar sangue.");
            System.out.println("9.5 - Crie um sistema simples de autenticação.");

            questao = sc.nextInt();
            switch (questao) {
                case 1:
                    EX09_01();
                    break;
                case 2:
                    EX09_02();
                    break;
                case 3:
                    EX09_03();
                    break;
                case 4:
                    EX09_04();
                    break;
                case 5:
                    EX09_05();
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

