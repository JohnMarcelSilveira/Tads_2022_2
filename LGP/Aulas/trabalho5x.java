import java.util.Scanner;

public class trabalho5x{
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
        
        char [][] Campo = new char[8][8];
        
        for(int i = 0; i < Campo.length; i++){
            for(int j = 0; j < Campo[i].length; j++){
                Campo[i][j] = '0';
            }
        }
        
        Campo[0][0] = '-';
        int pLinha = 0;
        int pColuna = 0;
        
        System.out.println("Utilize as teclas W(Cima), S(Baixo), A(Esquerda), D(Direita) e P(Sair) \nO objetivo é percorrer o campo sem Ultrapassar os limites do campo.");
        
        for(int i = 0; i < Campo.length; i++){
            for(int j = 0; j < Campo[i].length; j++){
                System.out.print(Campo[i][j]);
            }
            System.out.println();
        }
            
        boolean ContinuaJogo = true;
        while(ContinuaJogo){
            
            System.out.println("Observe seu campo e caso esteja em alguma EXTREMIDADE tecle para se afastar da mesma. \nFaça seu Próximo Movimento:");
            String Movimento = in.next().toUpperCase();
            
            if(Movimento.equals ("P")){
                System.out.println("Voce acaba de sair do jogo");
                ContinuaJogo = false;
            } else{
                Campo[pLinha][pColuna] = '0';
            
            switch(Movimento){
                case "W":
                    pLinha -= 1;
                    if(pLinha == -1){
                        pLinha = 0;
                    }
                    break;
                
                case "S":
                    pLinha += 1;
                    if(pLinha == 8){
                        pLinha = 7;
                    }
                    break;
                
                case "A":
                    pColuna -= 1;
                    if(pColuna == -1){
                        pColuna = 0;
                    }
                    break;
                    
                case "D":
                    pColuna += 1;
                    if(pColuna == 8){
                        pColuna = 7;
                    }
                    break;
            }
            
            Campo[pLinha][pColuna] = '-';
            
            for(int i = 0; i < Campo.length; i++){
                for(int j = 0; j < Campo[i].length; j++){
                    System.out.print(Campo[i][j]);
                }
                System.out.println();
            }
            
            }
        }
    }
}