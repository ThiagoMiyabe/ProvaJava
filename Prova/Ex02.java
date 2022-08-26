package Prova;

public class Ex02 {
    public static void main(String[] args) {
        long ano, salario = 1000;
        double aumento = 0.015;

        for (ano = 1996; ano < 2022; ano ++) {
            salario *= 1 + (aumento/100);
            aumento = aumento*2;
        }

        System.out.println("Salário final em " + ano + " com aumento percentual de " + aumento + ": " + salario);
    }
}
