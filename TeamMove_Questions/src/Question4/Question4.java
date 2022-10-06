
package Question4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question4 {
    
    public static void main(String[] args) {
        
        String produto, tipo;
        float preco = 0, precoDesconto = 0, percentDesconto = 0;
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        //
        System.out.print("Produto: ");
        produto = entrada.next();
        
        System.out.print("Tipo do Produto: ");
        tipo = entrada.next().toUpperCase();
        
        System.out.print("Preço do Produto R$: ");
        preco = entrada.nextFloat();
        
        //Verificações
        if (tipo.equals("MOVEIS")){
            percentDesconto = 10;
            precoDesconto = preco - (preco * (percentDesconto/100));
        }
        
        if (tipo.equals("ELETRO")) {
            percentDesconto = 5;
            precoDesconto = preco - (preco * (percentDesconto/100));
        }
        
        //
        System.out.println("O Produto '" + produto.toUpperCase() + "' do tipo '" + tipo + "' tem '" + percentDesconto 
                + "%' e seu novo preço é R$ " + formato.format(precoDesconto));
        
    }
    
}
