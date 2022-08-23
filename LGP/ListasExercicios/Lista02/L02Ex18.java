import java.util.Scanner;

public class L02Ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numeroDeCarrosVendidos;
        float valorDasVendas,salarioFixo,valorRecebidoPorCarro,salarioFinal;

        System.out.println("Número de carros vendidos");
        numeroDeCarrosVendidos = in.nextInt();
        System.out.println("Valor total das vendas");
        valorDasVendas = in.nextFloat();
        System.out.println("Salario fixo");
        salarioFixo =in.nextFloat();
        System.out.println("Valor recebido por carro vendido");
        valorRecebidoPorCarro = in.nextFloat();

        salarioFinal = salarioFixo + valorDasVendas * 0.05f + valorRecebidoPorCarro;

    }
}
