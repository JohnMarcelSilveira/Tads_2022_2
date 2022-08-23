import java.util.Scanner;

public class L02Ex16 {
    public static void main(String[] args) {
        float salario, valorEmprestimo, valorPrestacao;
        int numPrestacoes;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do salário:");
        salario = in.nextFloat();
        System.out.println("Digite o valor do emprestimo:");
        valorEmprestimo = in.nextFloat();
        System.out.println("Digite o número de prestações:");
        numPrestacoes = in.nextInt();

        valorPrestacao = valorEmprestimo / (float) numPrestacoes;

        if (salario <= 0 || valorEmprestimo <= 0 || numPrestacoes <= 0) {
            System.out.println("Nenhum dos valores pode ser zero");
        } else if (valorPrestacao / salario >= 0.3) {
            System.out.printf("O emprestimo não pode ser concedido pois atinge %.2f %% do salário do funcionario",
                    (valorPrestacao / salario) * 100);
        } else
            System.out.printf("Emprestimo de R$%.2f concedido com sucesso em %d prestações de R$%.2f", valorEmprestimo,
                    numPrestacoes, valorPrestacao);

    }
}
