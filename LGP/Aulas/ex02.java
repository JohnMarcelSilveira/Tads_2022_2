import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int nota100,nota50,nota20,nota10,nota5,nota2,valorSaque,temporario;
        nota10 =nota5=nota2 = 0;
        System.out.println("Quanto vc deseja sacar?");
        valorSaque = temporario = in.nextInt();

        //testar com valor de R$11,00

        nota100 = temporario / 100;
        temporario = valorSaque % 100;
        nota50 = temporario / 50;
        temporario = valorSaque % 50;
        nota20 = temporario / 20;
        temporario = valorSaque % 20;

        if(temporario % 2 == 0){
            nota10 = temporario / 10;
            temporario = valorSaque % 10;
            nota5 = temporario / 5;
            temporario = valorSaque % 5;
            nota2 = temporario / 2;
            temporario = valorSaque % 2;
        }else if(temporario > 5){
            nota5 = 1;
            temporario = temporario - 5;
            nota2 = temporario / 2;
            temporario = valorSaque % 2;
        }

    
        System.out.println("Notas 100: " + nota100);
        System.out.println("Notas 50: " + nota50);
        System.out.println("Notas 20: " + nota20);
        System.out.println("Notas 10: " + nota10);
        System.out.println("Notas 5: " + nota5);
        System.out.println("Notas 2: " + nota2);


    }
}
