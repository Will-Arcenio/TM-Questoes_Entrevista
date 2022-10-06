
package Question1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question1 {
    
    public static void main(String[] args) {
        
        int numbers[] = new int[51];
        float maiorNumero = 0, menorNumero = 0 , somaTotal = 0, qtdNum = 0, mediaNumeros;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.0");
        
        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numbers[i] = entrada.nextInt();
            
            if (i == 1) {
                maiorNumero = numbers[i];
                menorNumero = numbers[i];
            }
            
            //
            if (numbers[i] > maiorNumero) {
                maiorNumero = numbers[i];
            }
            
            if (numbers[i] < menorNumero) {
                menorNumero = numbers[i];
            }
            
            somaTotal += numbers[i];
            qtdNum = i;
        }
        
        //Calcula Média dos números;
        mediaNumeros = somaTotal/qtdNum;
        
        //Maior Número;
        System.out.println("O maior número é: " + maiorNumero);
        
        //Menor Número;
        System.out.println("O menor número é: " + menorNumero);
        
        //Mostra Soma Total;
        System.out.println("A soma total dos números é: " + somaTotal);
        
        //Média dos Números;
        System.out.println("A média dos números digitados é: " + formato.format(mediaNumeros));
                
    }
    
}
