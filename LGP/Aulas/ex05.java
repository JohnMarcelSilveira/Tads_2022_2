import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float maior, menor, media,mediaAluno, nota1, nota2,temporario;
        int contador = 0;
        char sair = 'n';

        menor = maior = temporario = 0f;

        while(sair!='x'){
            contador++;
            System.out.println("Digite a 1ª nota");
            nota1 = in.nextFloat();
            System.out.println("Digite a 2ª nota");
            nota2 = in.nextFloat();

            mediaAluno = (nota1 + nota2)/2f; 
            if(contador == 1){
                menor = mediaAluno;
            }
            if(mediaAluno<menor){
                menor = mediaAluno;
            }
            if(mediaAluno>maior){
                maior = mediaAluno;
            }            

            temporario = mediaAluno + temporario;

            System.out.println("Para sair digite x");
            sair = in.next().charAt(0);
        }
        media = temporario / contador;
        System.out.println("A maior nota foi " + maior);
        System.out.println("A menor nota foi " + menor);
        System.out.println("A media da turma foi " + media);

    }
}
