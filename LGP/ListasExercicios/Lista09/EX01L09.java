import java.util.Scanner;

public class EX01L09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o tamanho?");
        int tamanho = in.nextInt();

        int matriz[][] = new int[tamanho][tamanho];

        for(int lin =0 ; lin < matriz.length;lin++){
            for(int col = 0; col<matriz[lin].length;col++){
                
                if(col%2==0){
                    matriz[lin][col] = 0;
                }else{
                    matriz[lin][col] = 1;
                }
            }
        }

        for(int lin =0 ; lin < matriz.length;lin++){
            for(int col = 0; col<matriz[lin].length;col++){
                System.out.print(matriz[lin][col] + " ");
            }
            System.out.println();
        }

    }
}
