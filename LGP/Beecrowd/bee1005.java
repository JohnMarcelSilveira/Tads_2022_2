//PROBLEMA: 1005 - Média 1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

public class bee1005 {
 
    public static void main(String[] args) throws IOException {
 
     Double nota1,nota2,media;
     BufferedReader in = new BufferedReader(new InputStreamReader(System.in));    
     
     nota1 = Double.parseDouble(in.readLine());
     nota2 = Double.parseDouble(in.readLine());
     
     media = (nota1*3.5 + nota2*7.5)/11;
     
     System.out.printf("MEDIA = %.5f\n",media);
 
    }
 
}