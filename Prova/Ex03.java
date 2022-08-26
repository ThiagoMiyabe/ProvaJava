package Prova;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float massaInicial, massaFinal;
        int horas = 0, minutos = 0, segundos = 0, segundosTotais = 0;

        System.out.println("Massa inicial em gramas: ");
        massaInicial = sc.nextFloat();
        massaFinal = massaInicial;

        while (massaFinal >= 0.5) {
            segundos += 50;
            segundosTotais += 50;

            if (segundos > 60) {
                minutos++;
                segundos -= 60;
            }
            if (minutos > 60) {
                horas++;
                minutos -= 60;
            }

            massaFinal = massaFinal/2;
        }

        System.out.println("Massa inicial: " + massaInicial + " | Massa final: " + massaFinal);
        System.out.println("Horas, minutos e segundos: " + horas + ":" + minutos + ":" + segundos);
        System.out.println("Segundos totais: " + segundosTotais);
    }
}
