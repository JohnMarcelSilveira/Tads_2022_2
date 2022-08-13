//1010 - Cálculo Simples

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bee1010 {

    public static void main(String[] args) throws IOException {

        String linha1, linha2;
        String[] array1, array2;
        Double valorTotal, valorPeca1, valorPeca2;
        int qtdPeca1, qtdPeca2;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        linha1 = in.readLine();
        linha2 = in.readLine();

        array1 = linha1.split(" ");
        array2 = linha2.split(" ");

        qtdPeca1 = Integer.parseInt(array1[1]);
        qtdPeca2 = Integer.parseInt(array2[1]);

        valorPeca1 = Double.parseDouble(array1[2]);
        valorPeca2 = Double.parseDouble(array2[2]);

        valorTotal = qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }

}