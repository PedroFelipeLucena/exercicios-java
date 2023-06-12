//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Esse programa possui o intuito de te ajudar a somar dois números inteiros e retornar o valor da soma. Digite o primeiro valor: ");

        int v1 = sc.nextInt();

        System.out.println("Printe o segundo valor:");

        int v2 =sc.nextInt();

        int resultadoSoma = (v1+v2);

        System.out.printf("O resultado da soma é %d, os valores utilizados na soma são: %d e %d", resultadoSoma, v1, v2);

        sc.close();
    }
}
