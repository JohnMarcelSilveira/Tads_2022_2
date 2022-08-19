import java.util.Scanner;

public class L02Ex12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final float PRECO_MACA = 1.5f;
        final float PRECO_MACA_DESCONTO = 1.3f;

        int numMaca;
        float totalCompra;

        System.out.println("Quantas maças você quer?");
        numMaca = in.nextInt();

        if (numMaca < 12)
            totalCompra = numMaca * PRECO_MACA;
        else
            totalCompra = numMaca * PRECO_MACA_DESCONTO;

        System.out.printf("Total da compra: R$%.2f \n", totalCompra);
    }
}
