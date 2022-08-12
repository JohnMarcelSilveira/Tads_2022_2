import java.io.IOException;
import java.util.Scanner;


public class bee1035 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        int a, b, c,d;
        String linha;
        String[] linhaSplit;

        linha = in.nextLine();
        linhaSplit = linha.split(" ");

        a = Integer.parseInt(linhaSplit[0]);
        b = Integer.parseInt(linhaSplit[1]);
        c = Integer.parseInt(linhaSplit[2]);
        d = Integer.parseInt(linhaSplit[3]);

        if(b>c && d>a && c+d > a+b && c > 0 && d > 0 && a%2 == 0)  { 
        
            System.out.println("Valores aceitos");}

        else {System.out.println("Valores nao aceitos");}
        in.close();

    }

}
