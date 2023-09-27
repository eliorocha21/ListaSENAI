package Atividades_SENAI;
/*Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.*/

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.println("Antecessor = " + (numero -1));
    }
}
