import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da peça:");
        
        int peca1 = sc.nextInt();

        System.out.printf("Número da peça: %d ", peca1);

        System.out.println("Digite o numero de peças: ");

        int quantidadePeca1 = sc.nextInt();

        System.out.println("Digite o valor da peça: ");

        int valorpeca1 = sc.nextInt();

        System.out.println("Digite o número da peça:");
        
        int peca2 = sc.nextInt();

        System.out.printf("Número da peça: %d ", peca2);

        System.out.println("Digite o numero de peças: ");

        int quantidadePeca2 = sc.nextInt();

        System.out.println("Digite o valor da peça: ");

        int valorpeca2 = sc.nextInt();

        double resultadoPeca1 = valorpeca1 * quantidadePeca1;
        double resultadoPeca2 = valorpeca2 * quantidadePeca2;

        double valorPago =  resultadoPeca1 + resultadoPeca2;

        System.out.printf("O valor a ser pago é %f", valorPago );



        sc.close();
    }
}