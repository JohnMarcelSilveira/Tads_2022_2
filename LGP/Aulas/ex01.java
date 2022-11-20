import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int idade;


            System.out.print("Digite sua idade:");
            idade = in.nextInt();

            if(idade > 60 || idade < 4){
                System.out.println("Impossivel realizar a prova!");
            }else if(idade >= 18){
                System.out.println("Adulto!");
            }else if(idade >= 14){
                System.out.println("Juvenil!");
            }else if(idade >= 19){
                System.out.println("Infantil!");
            }else{
                System.out.println("Mirim!");
            }
        }


    }
}
