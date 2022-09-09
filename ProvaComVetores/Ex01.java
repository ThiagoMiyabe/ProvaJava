package ProvaComVetores;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vetor[] = new double[5];
        double maior = 0, menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o "+(i+1)+"° número: ");
            vetor[i] = sc.nextDouble();
            if (i == 0) {
                maior = vetor[i];
                menor = vetor[i];
            } else {
                if (vetor[i] > maior) {
                    maior = vetor[i];
                } else if (vetor[i] < menor) {
                    menor = vetor[i];
                }
            }
        }
        System.out.println("O menor número foi: " + menor);
        System.out.println("O maior número foi: " + maior);
    }
}
