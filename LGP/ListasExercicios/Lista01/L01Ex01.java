package ListasExercicios.Lista01;
import java.util.Scanner;

public class L01Ex01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Informe um número:");

        numero = in.nextInt();

        System.out.println("O número antecessor ao informado é: " + (numero - 1));

        in.close();

    }

}
