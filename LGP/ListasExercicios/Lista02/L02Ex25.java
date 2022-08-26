import java.util.Scanner;

public class L02Ex25{
    public static void main(String[] args) {
        float valorProduto,soma;
        int moeda1,moeda50,moeda25,moeda10,moeda5;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do produto");
        valorProduto = in.nextFloat();
        System.out.println("Quantidade de moedas de 1 real");
        moeda1 = in.nextInt();
        System.out.println("Quantidade de moedas de 50 centavos");
        moeda50 = in.nextInt();
        System.out.println("Quantidade de moedas de 25 centavos");
        moeda25 = in.nextInt();
        System.out.println("Quantidade de moedas de 10 centavos");
        moeda10 = in.nextInt();
        System.out.println("Quantidade de moedas de 5 centavos");
        moeda5 = in.nextInt();

        soma = moeda5*0.05f+moeda10*0.10f+moeda25*0.25f+moeda50*0.50f+moeda1;

        if(soma==valorProduto){
            System.out.println("pode comprar");
        }else{
            System.out.println("sem dinheiro");
        }
        
    }
}