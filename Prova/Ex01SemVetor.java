package Prova;

import java.util.Scanner;

public class Ex01SemVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        int maior, menor;
        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        maior = n1;
        menor = n1;
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        if (n2 > maior) {
            maior = n2;
        }
        if (n2 < menor) {
            menor = n2;
        }
        System.out.println("Digite o 3º número: ");
        n3 = sc.nextInt();
        if (n3 > maior) {
            maior = n3;
        }
        if (n3 < menor) {
            menor = n3;
        }
        System.out.println("Digite o 4º número: ");
        n4 = sc.nextInt();
        if (n4 > maior) {
            maior = n4;
        }
        if (n4 < menor) {
            menor = n4;
        }
        System.out.println("Digite o 5º número: ");
        n5 = sc.nextInt();
        if (n5 > maior) {
            maior = n5;
        }
        if (n5 < menor) {
            menor = n5;
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
