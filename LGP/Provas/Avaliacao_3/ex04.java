
/*
    Faturamento Anual - Criar um algoritmo que carregue uma matriz 12 x 4 com os
    valores das vendas de uma loja, em que cada linha represente um mês do ano, e
    cada coluna, uma semana do mês. Para fins de simplificação considere que cada
    mês possui somente 4 semanas. Calcule e imprima:
    - Total vendido em cada mês do ano;
    - Total vendido em cada semana durante todo o ano (primeira semana de
    cada mês, segunda semana de cada mês, etc…);
    - Total vendido no ano.
 */

import java.util.Scanner;

public class ex04 {

    private static void mostrarMatriz(int matTemp[][]){
        for(int i = 0; i < matTemp.length; i++){
            for(int j = 0; j < matTemp[i].length; j++){
                System.out.print(matTemp[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int mat[][], totalVendidoMes, totalVendidoSemana, totalVendidoAno;

        mat = new int[12][4];
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        totalVendidoAno= 0;
        

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = in.nextInt();
                totalVendidoAno = totalVendidoAno + mat[i][j];
            }
        }

        mostrarMatriz(mat);
        System.out.println();
        System.out.println("***********************************");
        System.out.println();

        for(int i = 0; i < mat.length; i++){
            totalVendidoMes = 0;
            for(int j = 0; j < mat[i].length; j++){
                totalVendidoMes = totalVendidoMes + mat[i][j];
            }
            System.out.println("Total vendido em " + mes[i] + " R$ " + totalVendidoMes);
        }
        System.out.println();
        System.out.println("***********************************");
        System.out.println();

        for(int j = 0; j < mat[0].length; j++){
            totalVendidoSemana = 0;
                for(int i = 0; i < mat.length; i++){
                    totalVendidoSemana = totalVendidoSemana + mat[i][j];
            }

            System.out.println("Total vendido na semana " + (j+1) + " R$ " + totalVendidoSemana);
        }

        System.out.println();
        System.out.println("***********************************");
        System.out.println();

        System.out.println("Total vendido no ano R$ " + totalVendidoAno); 
        
    }
}
