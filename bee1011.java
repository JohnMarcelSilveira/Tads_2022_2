import java.util.Scanner;

//package .git;

public class bee1011 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Double raio, resultado;
        Double pi = 3.14159;

        raio = Double.parseDouble(in.nextLine());

        resultado = (4 / 3.0) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", resultado);

        in.close();
    }
}
