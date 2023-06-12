//Escreva um programa que solicite o nome do usuário e exiba uma saudação personalizada.

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        System.out.println("Qual seu nome?");
        System.out.printf("Seja bem vindo: %s",name);

        sc.close();
    }
}
