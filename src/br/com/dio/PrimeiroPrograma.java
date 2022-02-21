package br.com.dio;

import java.util.Scanner;

public class PrimeiroPrograma {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int a, b, c;

            System.out.println("Digite o primeiro valor: ");
            a = scan.nextInt();
            System.out.println("Digite o segundo valor ");
            b = scan.nextInt();
            System.out.println("Digite o terceiro valor");
            c = scan.nextInt();

            double soma = soma(a, b, c);
            double subtracao = subtracao(a, b, c);
            double multiplicacao = multiplicacao(a, b, c);
            double divisao = divisao(a, b, c);

            System.out.println(soma);
            System.out.println(subtracao);
            System.out.println(multiplicacao);
            System.out.println(divisao);

        }

        public static double soma(double a, double b, double c) {
            return a + b + c;
        }

        public static double subtracao(double a, double b, double c) {
            return a - b - c;
        }
        public static double multiplicacao(double a, double b, double c) {
            return a * b * c;
        }
        public static double divisao(double a, double b, double c) {
            return a / b / c;
        }


}
