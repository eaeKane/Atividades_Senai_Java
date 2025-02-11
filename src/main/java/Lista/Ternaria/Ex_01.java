package Lista.Ternaria;
import java.util.Scanner;

public class Ex_01 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int questao;

            do {
                System.out.print("Escolha qual questão deseja ver (1-30, 0 para sair): ");
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
                        break;
                    default:
                        System.out.println("Opção inválida");
                }

            } while (questao != 0);
            sc.close();
        }


        public static void EX01() {
            int num = 10;
            String resultado = (num % 2 == 0) ? "Par" : "Ímpar";
            System.out.println(resultado);
        }

        public static void EX02() {
            int idade = 20;
            String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
            System.out.println(resultado);
        }

        public static void EX03() {
            int num = -5;
            String resultado = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Zero";
            System.out.println(resultado);
        }

        public static void EX04() {
            int num = 10;
            String resultado = (num % 5 == 0) ? "Múltiplo de 5" : "Não é múltiplo de 5";
            System.out.println(resultado);
        }

        public static void EX05() {
            int ano = 2024;
            String resultado = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? "Bissexto" : "Não é bissexto";
            System.out.println(resultado);
        }

        public static void EX06() {
            int idade = 20;
            boolean temCarteira = true;
            String resultado = (idade >= 18 && temCarteira) ? "Pode dirigir" : "Não pode dirigir";
            System.out.println(resultado);
        }

        public static void EX07() {
            int num = 10;
            String resultado = (num > 0 && num % 2 == 0) ? "Sim" : "Não";
            System.out.println(resultado);
        }

        public static void EX08() {
            double nota = 8.0;
            String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
            System.out.println(resultado);
        }

        public static void EX09() {
            int num1 = 10, num2 = 20;
            String resultado = (num1 > num2) ? "Maior" : "Menor ou Igual";
            System.out.println(resultado);
        }

        public static void EX10() {
            int num = 150;
            String resultado = (num > 100) ? "Alto" : "Baixo";
            System.out.println(resultado);
        }

        public static void EX11() {
            char letra = 'a';
            String resultado = (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') ? "Vogal" : "Consoante";
            System.out.println(resultado);
        }

        public static void EX12() {
            int num = -5;
            String resultado = (num % 2 == 0 && num > 0) ? "Par e Positivo" :
                    (num % 2 == 0 && num < 0) ? "Par e Negativo" :
                            (num % 2 != 0 && num > 0) ? "Ímpar e Positivo" : "Ímpar e Negativo";
            System.out.println(resultado);
        }

        public static void EX13() {
            int num1 = 10, num2 = 20;
            int maior = (num1 > num2) ? num1 : num2;
            System.out.println("Maior número: " + maior);
        }

        public static void EX14() {
            int num = 25;
            String resultado = (num >= 10 && num <= 50) ? "Dentro do intervalo" : "Fora do intervalo";
            System.out.println(resultado);
        }

        public static void EX15() {
            int num = 15;
            String resultado = (num % 3 == 0 && num % 5 == 0) ? "FizzBuzz" : String.valueOf(num);
            System.out.println(resultado);
        }

        public static void EX16() {
            boolean valor = true;
            String resultado = valor ? "Sim" : "Não";
            System.out.println(resultado);
        }

        public static void EX17() {
            int idade = 65;
            boolean eEstudante = false;
            String resultado = (idade > 60 || eEstudante) ? "Desconto concedido" : "Desconto não concedido";
            System.out.println(resultado);
        }

        public static void EX18() {
            int lado1 = 5, lado2 = 5, lado3 = 5;
            String tipo = (lado1 == lado2 && lado2 == lado3) ? "Equilátero" :
                    (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) ? "Isósceles" : "Escaleno";
            System.out.println(tipo);
        }

        public static void EX19() {
            int num = 9;
            String resultado = (num % 2 == 0 || num % 3 == 0) ? "Divisível" : "Não divisível";
            System.out.println(resultado);
        }

        public static void EX20() {
            double nota = 5.5;
            String resultado = (nota >= 7) ? "Aprovado" :
                    (nota >= 5 && nota <= 6.9) ? "Recuperação" : "Reprovado";
            System.out.println(resultado);
        }

        public static void EX21() {
            int num = -5;
            String tipo = (num % 2 == 0) ? (num > 0 ? "Par e Positivo" : "Par e Negativo") :
                    (num > 0 ? "Ímpar e Positivo" : "Ímpar e Negativo");
            System.out.println(tipo);
        }

        public static void EX22() {
            double precoProduto = 120.0;
            String resultado = (precoProduto >= 100) ? "Frete grátis" : "Frete não grátis";
            System.out.println(resultado);
        }

        public static void EX23() {
            String senha = "senha123";
            String resultado = (senha.length() >= 8) ? "Senha válida" : "Senha inválida";
            System.out.println(resultado);
        }

        public static void EX24() {
            int num = 6;
            int somaDivisores = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }
            String resultado = (somaDivisores == num) ? "Perfeito" : "Não perfeito";
            System.out.println(resultado);
        }

        public static void EX25() {
            String dia = "segunda-feira";
            String resultado = (dia.equals("sábado") || dia.equals("domingo")) ? "Final de semana" : "Dia útil";
            System.out.println(resultado);
        }

        public static void EX26() {
            int idade = 18;
            String resultado = (idade >= 16) ? "Pode votar" : "Não pode votar";
            System.out.println(resultado);
        }

        public static void EX27() {
            int num = -1;
            String resultado = (num >= 0) ? "Positivo ou Zero" : "Negativo";
            System.out.println(resultado);
        }

        public static void EX28() {
            int num = 25;
            String resultado = (num >= 20 && num <= 30) ? "Dentro do intervalo" : "Fora do intervalo";
            System.out.println(resultado);
        }

        public static void EX29() {
            int idade = 25;
            String resultado = (idade >= 18 && idade <= 60) ? "Adulto" : (idade > 60 ? "Idoso" : "Jovem");
            System.out.println(resultado);
        }

        public static void EX30() {
            double nota1 = 7.5, nota2 = 6.0;
            double media = (nota1 + nota2) / 2;
            String resultado = (media >= 6) ? "Aprovado" : "Reprovado";
            System.out.println(resultado);
        }
    }

