import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class bee1012 {

    public static void main(String[] args) throws IOException  {
        Scanner in = new Scanner(System.in);
        String linha;
        String[] linhaSplit;
        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;
        
        linha = in.nextLine();
        linhaSplit = linha.split(" ");

        a = Double.parseDouble(linhaSplit[0]);
        b = Double.parseDouble(linhaSplit[1]);
        c = Double.parseDouble(linhaSplit[2]);

        areaTriangulo = (a*c)/2;
        areaCirculo = pi * Math.pow(c, 2);
        areaTrapezio = ((a+b)*c)/2;
        areaQuadrado = b*b;
        areaRetangulo = a*b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        in.close();

    }

}
