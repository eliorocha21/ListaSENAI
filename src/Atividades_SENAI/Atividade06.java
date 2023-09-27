package Atividades_SENAI;

import java.util.Scanner;

/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
área do retângulo.*/
public class Atividade06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base: ");
        double base = sc.nextDouble();
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura);
        System.out.println("Area : " + area);

    }
}
