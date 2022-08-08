import java.io.IOException;
import java.util.Scanner;

public class bee1008 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int numFuncionario, horasTrabalhadas;
        double valorPorHora, salario;

        numFuncionario = in.nextInt();
        horasTrabalhadas = in.nextInt();
        valorPorHora = in.nextDouble();

        salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        in.close();

    }

}
