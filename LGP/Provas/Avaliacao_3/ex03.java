

import java.util.Scanner;

/*
        Campeonato Mundial - Em ritmo de copa do mundo, você foi escalado para
        desenvolver um software que mostre qual o time com a maior pontuação da
        competição. O software deve armazenar em uma matriz todos os jogos e em um
        outro vetor, o resultado de cada um dos jogos, sendo 0 considerado empate, 1 o
        primeiro time do jogo ganhou e, 2 o segundo time do jogo ganhou. Lembrando que
        cada vitória garante ao time 3 pontos e um empate garante 1 ponto e, considerando
        as entradas nos seguintes formatos:
        jogos = [
        [ “Brasil”, “Servia”]
        [“Alemanha”, “Brasil”]
        [“Servia, “Alemanha”]
        ]
        resultados = [ 0, 0, 2 ]
        No exemplo acima, Alemanha foi o time que somou mais pontos, totalizando 4.
        ● Considere que o número de times não é conhecido, isso faz parte da lógica.
        ● Pense na utilização de vetores auxiliares.
 */

public class ex03 {  
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultado[] = new int[3];
        int jogosInt[][] = new int[3][3];

        int timesCodigo[] = {1,2,3}; 
        String timesNome[] = {"Brasil","Servia","Argentina"};
        // 1 - Brasil , 2 - Servia , 3 - Argentina 

        int pontosTime[] = new int[3];

        String jogos[][] = {
            {"Brasil", "Servia"},
            {"Argentina", "Brasil"},
            {"Servia", "Argentina"}
            };

            for(int i = 0; i < resultado.length; i++){
                System.out.println("Digite o valor do " + (i+1) + " jogo:");
                resultado[i] = in.nextInt();
            }            

            for(int i = 0; i < jogos.length; i++){
                for(int j = 0; j < jogos[i].length; j++){
                    switch(jogos[i][j]){
                        case "Brasil": jogosInt[i][j] = 1; break;
                        case "Servia": jogosInt[i][j] = 2; break;
                        case "Argentina": jogosInt[i][j] = 3; break;
                    }  
                }
            }
           

            int confronto[] = new int[2];

            for(int i = 0; i < jogos.length; i++){
                for(int j = 0; j < jogos[i].length; j++){                   
                    confronto[j] = jogosInt[i][j];                    
                }
                switch(resultado[i]){
                    case 0: 
                        pontosTime[confronto[0]-1] = pontosTime[confronto[0]-1] + 1;
                        pontosTime[confronto[1]-1] = pontosTime[confronto[1]-1] + 1;
                        break;
                    case 1: 
                        pontosTime[confronto[0]-1] = pontosTime[confronto[0]-1] + 3;
                        break;
                    case 2: 
                        pontosTime[confronto[1]-1] = pontosTime[confronto[1]-1] + 3;
                        break;

                };
                
            }
            int campeao = 0;
            int pontosCampeao = -1;
            for(int i = 0; i < jogos.length; i++){  
                
                if(pontosTime[i] >= pontosCampeao)
                    campeao = i;
            }

            System.out.println("*********************************");
            System.out.println("O time campeão foi " + timesNome[campeao]);
            System.out.println("*********************************");

            for(int i = 0; i < jogos.length; i++){
                
                    System.out.println("pontos do time " + timesNome[i] +" : " +pontosTime[i]);

            };
    }
}
