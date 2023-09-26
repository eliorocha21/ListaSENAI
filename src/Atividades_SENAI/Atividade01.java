package Atividades_SENAI;
/*1) Escreva um algoritmo que armazene o valor 10 em uma variável A e o valor 20 em uma variável B.
A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o
valor que está em A passe para B e vice-versa. Ao final, escrever os valores que ficaram armazenados
nas variáveis.*/
public class Atividade01 {
        public static void main(String[] args) {
            int A = 10;
            int B = 20;

            System.out.println("Valores iniciais:");
            System.out.println("A: " + A);
            System.out.println("B: " + B);

            int temp = A;
            A = B;
            B = temp;

            System.out.println("\nValores trocados:");
            System.out.println("A: " + A);
            System.out.println("B: " + B);
        }
    }
