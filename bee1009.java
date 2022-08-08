import java.io.IOException;
import java.util.Scanner;

public class bee1009 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String nomeVendedor;
        double salarioFixo, vendas, salarioComComissao;

        nomeVendedor = in.next();
        salarioFixo = in.nextDouble();
        vendas = in.nextDouble();

        salarioComComissao = (vendas * 0.15) + salarioFixo;
        System.out.printf("TOTAL = R$ %.2f\n", salarioComComissao);

        in.close();

    }

}
