//Escreva um programa que solicite dois números inteiros e exiba a soma deles.

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número inteiro a ser somado:");
        
        int x1;

        x1 = sc.nextInt();
        
        System.out.println("Escreva o segundo número inteiro a ser somado:");
        
        int x2;
        
        x2 = sc.nextInt();
        
        int conta = (x1 + x2);
        
        System.out.println("resultado da conta:");
        System.out.println(conta);

        sc.close();
    }
}