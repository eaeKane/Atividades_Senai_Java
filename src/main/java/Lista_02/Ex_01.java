package Lista_02;

public class Ex_01 {

    public static void Calculo(double raiz, int CasasDecimais) {
        switch (CasasDecimais) {
            case 0:
                System.out.printf("Resultado: %.0f\n\n", Math.sqrt(raiz));
                break;
            case 1:
                System.out.printf("Resultado: %.1f\n\n", Math.sqrt(raiz));
                break;
            case 2:
                System.out.printf("Resultado: %.2f\n\n", Math.sqrt(raiz));
                break;
            case 3:
                System.out.printf("Resultado: %.3f\n\n", Math.sqrt(raiz));
                break;
        }
    }

    public static void main(String[] args) {

        System.out.println("Exercicio 01: Math.sqrt:");

        System.out.println("Questão 1: Calcule a raiz quadrada de 16.");
        Calculo(16, 0);

        System.out.println("Questão 2: Determine a raiz quadrada de 81.");
        Calculo(81, 0);

        System.out.println("Questão 3: Encontre a raiz quadrada de 2 e arredonde para duas casas decimais.");
        Calculo(2, 2);

        System.out.println("Questão 4: Qual é a raiz quadrada de 0?");
        Calculo(0, 0);

        System.out.println("Questão 5: Calcule a raiz quadrada de 144.");
        Calculo(144, 0);

        System.out.println("Questão 6: Encontre a raiz quadrada do número 225.");
        Calculo(225, 0);

        System.out.println("Questão 7: Qual é a raiz quadrada de 0.25?");
        Calculo(0.25, 1);

        System.out.println("Questão 8: Descubra a raiz quadrada de 1.");
        Calculo(1, 0);

        System.out.println("Questão 9: Calcule a raiz quadrada de 10 e arredonde para uma casa decimal.");
        Calculo(10, 1);

        System.out.println("Questão 10: Qual é a raiz quadrada de 400?");
        Calculo(400, 0);

        System.out.println("Questão 11: Determine a raiz quadrada de 0.04.");
        Calculo(0.04, 1);

        System.out.println("Questão 12: Qual é a raiz quadrada de 121?");
        Calculo(121, 0);


        System.out.println("Questão 13: Calcule a raiz quadrada de 625.");
        Calculo(625, 0);

        System.out.println("Questão 14: Encontre a raiz quadrada de 50 e arredonde para duas casas decimais.");
        Calculo(50, 2);

        System.out.println("Questão 15: Qual é a raiz quadrada de 900?");
        Calculo(900, 0);

        System.out.println("Questão 16: Descubra a raiz quadrada de 10000.");
        Calculo(10000, 0);

        System.out.println("Questão 17: Calcule a raiz quadrada de 0.001 e arredonde para três casas decimais.");
        Calculo(0.001, 3);

        System.out.println("Questão 18: Qual é a raiz quadrada de 36?");
        Calculo(36, 0);

        System.out.println("Questão 19: Determine a raiz quadrada de 49.");
        Calculo(49, 0);

        System.out.println("Questão 20: Qual é a raiz quadrada de 169?");
        Calculo(169, 0);

    }
}
