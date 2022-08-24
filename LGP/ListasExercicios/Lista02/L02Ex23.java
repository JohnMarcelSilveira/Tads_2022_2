import java.util.Scanner;

public class L02Ex23 {
    public static void main(String[] args) {
        int estoqueAtual, estoqueMaximo, estoqueMinimo;
        float estoqueMedio;

        Scanner in = new Scanner(System.in);

        System.out.println("Estoque atual:");
        estoqueAtual = in.nextInt();

        System.out.println("Estoque maximo:");
        estoqueMaximo = in.nextInt();

        System.out.println("Estoque minimo:");
        estoqueMinimo = in.nextInt();

        estoqueMedio = (estoqueMaximo+estoqueMinimo)/2f;

        if(estoqueAtual >= estoqueMedio){
            System.out.println("Efetuar compra");
        }else{
            System.out.println("Não efetuar compra");
        }

    }
}
