import java.util.Scanner;

public class L02Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorFabrica, valorConsumidor;

        System.out.println("digite o valor de fábrica:");
        valorFabrica = in.nextFloat();

        valorConsumidor = (valorFabrica * 0.45f + valorFabrica * 0.28f) + valorFabrica;

        System.out.printf("o carro vai custar %.2f", valorConsumidor);

    }
}
