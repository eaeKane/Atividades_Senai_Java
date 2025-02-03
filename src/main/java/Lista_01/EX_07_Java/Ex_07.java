package Lista_01.EX_07_Java;
import java.util.Scanner;

    public class Ex_07 {


        public static void EX07_01() {
            System.out.println("Questão 7.1: Verifique se um horário informado é válido (24 horas).");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a hora: ");
            int hora = sc.nextInt();
            System.out.println("Digite os minutos: ");
            int minutos = sc.nextInt();

            if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
                System.out.println(hora + ":" + minutos + " Horário válido.");
            } else {
                System.out.println(hora + ":" + minutos + " Horário inválido.");
            }
        }


        public static void EX07_02() {
            System.out.println("Questão 7.2: Determine se um mês digitado é válido.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o número do mês (1 a 12): ");
            int mes = sc.nextInt();

            if (mes >= 1 && mes <= 12) {
                System.out.println("Mês válido.");
            } else {
                System.out.println("Mês inválido.");
            }
        }


        public static void EX07_03() {
            System.out.println("Questão 7.3: Verifique se um dia do mês é válido para um mês específico.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o mês (1 a 12): ");
            int mes = sc.nextInt();
            System.out.println("Digite o dia do mês: ");
            int dia = sc.nextInt();

            boolean valido = false;

            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: // Meses com 31 dias
                    if (dia >= 1 && dia <= 31) valido = true;
                    break;
                case 4: case 6: case 9: case 11: // Meses com 30 dias
                    if (dia >= 1 && dia <= 30) valido = true;
                    break;
                case 2: // Fevereiro
                    if (dia >= 1 && dia <= 29) valido = true; // Permitindo 29 dias para considerar ano bissexto
                    break;
            }

            if (valido) {
                System.out.println("Dia válido.");
            } else {
                System.out.println("Dia inválido para o mês informado.");
            }
        }


        public static void EX07_04() {
            System.out.println("Questão 7.4: Determine se um horário está no período da manhã, tarde ou noite.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a hora: ");
            int hora = sc.nextInt();

            if (hora >= 0 && hora < 12) {
                System.out.println("Período da manhã.");
            } else if (hora >= 12 && hora < 18) {
                System.out.println("Período da tarde.");
            } else if (hora >= 18 && hora < 24) {
                System.out.println("Período da noite.");
            } else {
                System.out.println("Hora inválida.");
            }
        }


        public static void EX07_05() {
            System.out.println("Questão 7.5: Verifique se uma data está dentro de um período específico.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o dia: ");
            int dia = sc.nextInt();
            System.out.println("Digite o mês: ");
            int mes = sc.nextInt();
            System.out.println("Digite o ano: ");
            int ano = sc.nextInt();


            boolean dataValida = false;

            if (ano > 2020 && ano < 2025) {
                dataValida = true;
            } else if (ano == 2020) {
                if (mes > 1 || (mes == 1 && dia >= 1)) {
                    dataValida = true;
                }
            } else if (ano == 2025) {
                if (mes < 12 || (mes == 12 && dia <= 31)) {
                    dataValida = true;
                }
            }

            if (dataValida) {
                System.out.println("Data dentro do período válido.");
            } else {
                System.out.println("Data fora do período válido.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int questao;
            do {
                System.out.println("Escolha qual questão deseja ver:");
                System.out.println("7.1 - Verifique se um horário informado é válido (24 horas).");
                System.out.println("7.2 - Determine se um mês digitado é válido.");
                System.out.println("7.3 - Verifique se um dia do mês é válido para um mês específico.");
                System.out.println("7.4 - Determine se um horário está no período da manhã, tarde ou noite.");
                System.out.println("7.5 - Verifique se uma data está dentro de um período específico.");

                questao = sc.nextInt();
                switch (questao) {
                    case 1:
                        EX07_01();
                        break;
                    case 2:
                        EX07_02();
                        break;
                    case 3:
                        EX07_03();
                        break;
                    case 4:
                        EX07_04();
                        break;
                    case 5:
                        EX07_05();
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

