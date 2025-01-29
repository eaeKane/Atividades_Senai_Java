package Aula3_Java;
import java.util.Scanner;

public class Ex_03 {

    public static void EX01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 'Sim' ou 'Não': ");
        String palavra = sc.nextLine();

        if (palavra.equalsIgnoreCase("Sim")) {
            System.out.println("Você digitou 'Sim'");
        } else if (palavra.equalsIgnoreCase("Não")) {
            System.out.println("Você digitou 'Não'");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void EX02() {
        Scanner sc = new Scanner(System.in);
        String SenhaCorreta = "1234";
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.println("Digite a senha de liberação: ");
            String SenhaDigitada = sc.nextLine();

            if (SenhaDigitada.equalsIgnoreCase(SenhaCorreta)) {
                System.out.println("Acesso Liberado");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Senha incorreta! Tenta novamente.");
                } else {
                    System.out.println("Senha incorreta! Acesso negado");
                }
            }
        }
    }

    public static void EX03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        if (nome.toUpperCase().startsWith("A")) {
            System.out.println("Você digitou '" + nome + "'");
            System.out.println("O nome digitado começa com a letra A.");
        }else {
            System.out.println("Você digitou '"+ nome + "'");
            System.out.println("O nome não começa com a letra A.");
        }


    }

    public static void EX04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (palavra.length() > 5) {
            System.out.println("Você digitou '"+ palavra + "'");
            System.out.println("Essa palavra tem mais de 5 letras.");
        } else if (palavra.length() == 5){
            System.out.println("Você digitou '" + palavra +"'");
            System.out.println("Essa palavra tem exatamente 5 letras.");
        } else {
            System.out.println("Você digitou '" + palavra +"'");
            System.out.println("Essa palavra tem menos de 5 letras.");
        }
    }

    public static void EX05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas palavras ");
        System.out.println("Primeira palavra: ");
        String p1 = sc.nextLine();
        System.out.println("Segunda palavra: ");
        String p2 = sc.nextLine();

        if (p1.equalsIgnoreCase(p2)){
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras são diferentes.");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questao;
        do {
            System.out.println("Escolha qual questão deseja ver");
            System.out.println("Questão 1: Verifique se uma palavra recebida é 'Sim' ou 'Não'");
            System.out.println("Questão 2: Determine se uma senha digitada está correta (exemplo: senha\n" +
                    "esperada é '1234'");
            System.out.println("Questão 3: Verifique se um nome digitado começa com a letra 'A'.");
            System.out.println("Questão 4: Receba uma palavra e verifique se ela contém mais de 5 caracteres.");
            System.out.println("Questão 5: Determine se duas palavras são iguais (ignorando maiúsculas e\n" +
                    "minúsculas).");

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
