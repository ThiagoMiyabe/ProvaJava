package Prova;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int a [] =  new int[5];
        int maior = 0, menor = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um numero: ");
            a[i] = sc.nextInt();
            if (a[i] > maior) {
                maior = a[i];
            }
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
    }
}
