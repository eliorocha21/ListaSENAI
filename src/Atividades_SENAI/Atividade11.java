package Atividades_SENAI;

import java.util.Scanner;

/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor.*/
public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor fixo de salário: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Numero de carros vendidos: ");
        int carrosVendidos = sc.nextInt();
        double valorPorCarro = 100*carrosVendidos;
        System.out.println("Valor total das vendas: ");
        double valorVendas = sc.nextDouble();
        double comissao = (valorVendas * 5)/100;
        double salarioFinal = (salarioFixo + valorPorCarro + comissao);
        System.out.println("Salario final foi de: " + salarioFinal);
    }
}
