package Atividades_SENAI;

import java.util.Scanner;

public class Atividade02c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 10;
        int B = 20;
        int C = A;
        B = C;
        A = B;
        System.out.println(A + " , " + B + " , " + C);
    }
}
