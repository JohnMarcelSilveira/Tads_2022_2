import java.util.Scanner;

public class L02Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, soma;

        System.out.print("Digite dois valores:");

        a = in.nextInt();
        b = in.nextInt();

        soma = a + b;

        if (soma > 20)
            System.out.println(soma + 8);
        else
            System.out.println(soma - 10);

    }
}
