package Atividades_SENAI;
/* Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.*/

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        double salario = sc.nextDouble();
        double percentual = (salario*10)/100;
        double novoSalario = (salario + percentual);
        System.out.println("O novo salário com aumento de 10% é: " + novoSalario);
    }
}
