import java.util.Scanner;

public class L04Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1,nota2,nota3,maior1,maior2;
        int cont = 0;
        nota1=nota2=nota3=maior1=maior2=0f;
        while(cont<3){
            cont++;
            System.out.print("Digite a "+cont+"ª nota:");
            if(cont==1){
                nota1 = in.nextFloat();
                maior1 = nota1;
            }else if(cont==2){
                nota2 = in.nextFloat();
                if(nota2>maior1 || maior1 == nota2){
                    maior2 = nota2;
                }
            }else{
                nota3 = in.nextFloat();
                if(nota3 > maior2){
                    maior2 = nota3;
                }else if(nota3 > maior1){
                    maior1 = nota3;
                }
            }
        }
        
        System.out.println(maior1 +"\n"+ maior2);

    }
}
