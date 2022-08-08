import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class bee1013 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int a, b, c, MaiorAB, MaiorABC;
        String linha;
        String[] linhaSplit;

        linha = in.nextLine();
        linhaSplit = linha.split(" ");

        a = Integer.parseInt(linhaSplit[0]);
        b = Integer.parseInt(linhaSplit[1]);
        c = Integer.parseInt(linhaSplit[2]);

        MaiorAB = (a+b+Math.abs(a-b))/2;
        MaiorABC = (MaiorAB + c + Math.abs(MaiorAB-c))/2;



        System.out.printf("%d eh o maior\n", MaiorABC);
        in.close();

    }

}
