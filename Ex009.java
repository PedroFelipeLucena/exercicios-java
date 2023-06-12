import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite os valores de A, B e C:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = (a*c)/2;
        System.out.printf("A área do triângulo retângulo é: %.1f%n", areaTriangulo);

        double areaCirculo = Math.PI * Math.pow(c, 2);
        System.out.printf("A área do circulo é: %.1f%n", areaCirculo);

        double areaTrapezio = (a+b)*c/2;
        System.out.printf("A área do circulo é: %.1f%n", areaTrapezio);

        double areaQuadrado = b*4;
        System.out.printf("A área do quadrado é: %.1f%n", areaQuadrado);

        double areaRetangulo = a*b;
        System.out.printf("A área do retangulo é: %.1f%n", areaRetangulo);
        sc.close();
    }
}
