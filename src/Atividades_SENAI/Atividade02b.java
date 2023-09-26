package Atividades_SENAI;

import java.util.Scanner;

public class Atividade02b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 30;
        int B = 20;
        int C = A + B;
        System.out.println(C);
        B = 10;
        System.out.println(B + " , " + C);
        C = A + B;
        System.out.println(A + " , " + B + " , " + C);
    }
}
