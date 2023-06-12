import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionario: ");

        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");

        int horasTrabalhadas = sc.nextInt();

        
        System.out.println("Digite o valor que o funcionario recebe por hora:");

        double pagamentoHora =sc.nextDouble();

        double calculoSalario = pagamentoHora * horasTrabalhadas;

        System.out.printf("O Numero de registro do funicionario é %d, as horas trabalhadas são %d e o seu salario é %.2f", numeroFuncionario, horasTrabalhadas, calculoSalario);
        
        Locale.setDefault(Locale.US);
        sc.close();

    }
}
