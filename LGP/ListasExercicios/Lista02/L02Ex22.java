import java.util.Scanner;

public class L02Ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float saldo, debito, credito, saldoAtual;
        int numConta;

        System.out.println("Número da conta");
        numConta = in.nextInt();
        System.out.println("Saldo");
        saldo = in.nextFloat();
        System.out.println("debito");
        debito = in.nextFloat();
        System.out.println("credito");
        credito = in.nextFloat();

        saldoAtual = saldo - debito + credito;

        System.out.printf("Saldo atual: R$%.2f", saldoAtual);

        if (saldoAtual >= 0)
            System.out.println("Saldo Positivo");
        else
            System.out.println("Saldo negativo");

    }
}
