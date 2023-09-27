package Atividades_SENAI;

import java.util.Scanner;
/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.*/

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de eleitores: ");
        int eleitores = sc.nextInt();

        System.out.println("Número de votos brancos: ");
        int votoBranco = sc.nextInt();

        System.out.println("Número de votos nulos: ");
        int votoNulo = sc.nextInt();

        System.out.println("Número de votos válidos: ");
        int votoValido = sc.nextInt();

        int totalVotos = votoBranco + votoNulo + votoValido;

        double percentualBranco = (votoBranco * 100.0) / eleitores;
        double percentualNulo = (votoNulo * 100.0) / eleitores;
        double percentualValido = (votoValido * 100.0) / eleitores;

        System.out.println("Percentual de votos brancos: " + percentualBranco + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulo + "%");
        System.out.println("Percentual de votos válidos: " + percentualValido + "%");

        sc.close();
    }
}
