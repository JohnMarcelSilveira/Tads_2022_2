//PROBLEMA: 1005 - Média 1

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;
 

public class bee1005a {
 
    public static void main(String[] args) {
 
     Double nota1,nota2,media;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    
     Scanner in2 = new Scanner(System.in);

     nota1 = in2.nextDouble();
     nota2 = in2.nextDouble();
     
     //nota1 = Double.parseDouble(in.readLine());
     //nota2 = Double.parseDouble(in.readLine());
     
     media = (nota1*3.5 + nota2*7.5)/11;
     
     System.out.printf("MEDIA = %.5f\n",media);
 
    }
 
}