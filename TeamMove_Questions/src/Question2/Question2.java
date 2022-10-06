package Question2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question2 {
    
    public static void main(String[] args) {
        
        String nomeAluno;
        float n1 = 0, n2 = 0, n3 = 0, mediaNotas;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        System.out.print("Nome do Aluno: ");
        nomeAluno = entrada.next();
        System.out.print("Aluno: " + nomeAluno);
        
        System.out.print("Nota 1: ");
        n1 = entrada.nextFloat();
        
        System.out.print("Nota 2: ");
        n2 = entrada.nextFloat();
        
        System.out.print("Nota 3: ");
        n3 = entrada.nextFloat();
        
        mediaNotas = (n1 + n2 + n3) / 3;
        
        //
        if (mediaNotas >= 7.0) {
            System.out.println("O Aluno '" + nomeAluno.toUpperCase() + "' teve uma média '" + formato.format(mediaNotas) + "' e está APROVADO.");
        } else {
            System.out.println("O Aluno '" + nomeAluno.toUpperCase() + "' teve uma média '" + formato.format(mediaNotas) + "' e está REPROVADO.");
        }
        
    }
    
}
