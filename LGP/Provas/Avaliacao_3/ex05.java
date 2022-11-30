

/*
        Sudoku Validator - Dada uma matriz 9 x 9 preenchida com números inteiros (pode
        ser preenchido diretamente no código). Faça um programa que indique se a matriz
        possui valores válidos para um jogo de Sudoku. Considere que o valor zero é
        atribuído a espaços não preenchidos, mais detalhes na explicação em aula.
 */

        /* em cada linha eu nao tenho repeição
         * em ccda coluna eu nao tenho repetição
         * em cada bloco de 3 eu não tenho repetição
         */

public class ex05 {

    private static void mostrarMatriz(int matTemp[][]){
        for(int i = 0; i < matTemp.length; i++){
            for(int j = 0; j < matTemp[i].length; j++){
                System.out.print(matTemp[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean colunaValida(int mat[][], int valor, int linha){

        //coloquei o valor como parametro porque ao preencher o sudoke o usuario precisa indicar em qual posição ele vai digitar e qual valor ele vai digitar

        boolean valida = true;
       
            for(int j = 0; j < mat[linha].length; j++){
              
              valida = mat[linha][j] == valor  ? false : true;
              if(!valida) break;
            }        

        return valida;
    }

    private static boolean linhaValida(int mat[][], int valor, int coluna){

        //coloquei o valor como parametro porque ao preencher o sudoke o usuario precisa indicar em qual posição ele vai digitar e qual valor ele vai digitar
        boolean valida = true;
       
            for(int i = 0; i < mat.length; i++){
              valida = mat[i][coluna] == valor ? false : true;
              if(!valida) break;
            }        

        return valida;
    }

    public static void main(String[] args) {

        int mat[][];

        mat = new int[9][9];
        
       

        mat[0][0]= 1;
        mat[0][5]= 1;
        //mat[1][5] = 1;

        mostrarMatriz(mat);

        System.out.println(linhaValida(mat, 1, 0));

        
    }
}
