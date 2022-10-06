
package Question3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3 {
    
    public static void main(String[] args) {
        
        String nomeFunci;
        float salario = 0, novoSalario = 0, percentReajuste = 0;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        System.out.print("Nome do Funcionário: ");
        nomeFunci = entrada.next();
        
        System.out.print("Salário do Funcionário: ");
        salario = entrada.nextFloat();
        
        System.out.print("Percentual do Reajuste: ");
        percentReajuste = entrada.nextFloat();
        
        //Calcular
        novoSalario = salario + (salario * (percentReajuste/100));
        
        //
        System.out.println("O Funcionário '" + nomeFunci.toUpperCase() + "' terá um reajuste de '" + percentReajuste + "%' em seu salário.\n"
                + "Seu novo salário será R$ " + formato.format(novoSalario) + ".");
        
    }
    
}
