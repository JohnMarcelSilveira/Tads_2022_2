import java.util.Scanner;

public class L04Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidadeDeMercadorias,cont;
        float valorUnitario,media,valorTotal;
        System.out.print("Quantas mercadorias têm no estoque:");
        quantidadeDeMercadorias = in.nextInt();
        cont =0;
        valorTotal = 0f;
        while(cont<quantidadeDeMercadorias){
            cont++;
            System.out.print("Digite o valor únitario da "+cont+"ª mercadoria: ");
            valorUnitario = in.nextFloat();
            valorTotal+=valorUnitario;
        }
        media =valorTotal/quantidadeDeMercadorias;
        System.out.printf("O valor total do estoque é: R$ %.2f \nA média do valor de seus produtos é: R$ %.2f",valorTotal,media);
    }
}
