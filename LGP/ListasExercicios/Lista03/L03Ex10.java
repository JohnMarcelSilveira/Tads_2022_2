import java.util.Scanner;

public class L03Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sexo;
        float altura,pesoIdeal=0f;
        boolean continua = true;

        System.out.println("Digite a altura e sexo (1-homem 2-mulher)");
        altura = in.nextFloat();
        sexo = in.nextInt();

        if(sexo == 1){
            pesoIdeal = 72.7f*altura-58f;            
        }else if(sexo == 2){
            pesoIdeal = 62.1f*altura-44.7f;
        }else{
            System.out.println("Você digitou um valor errado para o sexo, digite 1 para homem e 2 para mulher");
            continua = false;
        }

        if(continua){
            System.out.printf("Seu peso ideal é %.2f\n",pesoIdeal);
        }
    }
}
