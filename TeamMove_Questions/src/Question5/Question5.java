
package Question5;

import java.util.Scanner;

public class Question5 {
    
    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_RED    = "\u001B[31m";
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE   = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CIANO  = "\u001B[36m";

    
    public static void main(String[] args) {
        
        // Variaveis
        String nomeVendedor = "", nomeGerente = "";
        double salarioVendedor = 0, salarioGerente = 0;
        int opcao = 0, qtdVendedor = 0, qtdGerente = 0, qtdFuncionario = 0, qtdFuncionarioAcima10k = 0, qtdVendedorAbaixo5k = 0;
        double somaSalarioVendedor = 0, somaSalarioFuncionario = 0, somaSalarioGerente = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        //
        showOptions();
        opcao = entrada.nextInt();
                
        while (opcao != 0) {            
            
            switch (opcao) {
                case 1: {
                    System.out.println(ANSI_GREEN + "Você escolheu cadastrar um VENDEDOR." + ANSI_RESET);
                    nomeVendedor           = cadastrarNomeVendedor(nomeVendedor);
                    salarioVendedor        = cadastrarSalarioVendedor(salarioVendedor);
                    qtdVendedor            = somaQtdVendedores(qtdVendedor);
                    somaSalarioVendedor    = somaSalarioVendedores(salarioVendedor, somaSalarioVendedor);
                    somaSalarioFuncionario = somaSalarioFuncionarios(salarioVendedor, somaSalarioFuncionario);
                    qtdFuncionario         = somaQtdFuncionarios(qtdFuncionario);
                    if (salarioVendedor > 10000) {
                        qtdFuncionarioAcima10k = qtdFuncionariosAcima10k(qtdFuncionarioAcima10k);
                    }
                    if (salarioVendedor < 5000) {
                        qtdVendedorAbaixo5k = qtdVendedoresAbaixo5k(qtdVendedorAbaixo5k);
                    }
                    break;
                }
                case 2: {
                    System.out.println(ANSI_GREEN + "Você escolheu cadastrar um GERENTE." + ANSI_RESET);
                    nomeGerente            = cadastrarNomeGerente(nomeGerente);
                    salarioGerente         = cadastrarSalarioGerente(salarioGerente);
                    qtdGerente             = somaQtdGerentes(qtdGerente);
                    somaSalarioGerente     = somaSalarioGerentes(salarioGerente, somaSalarioGerente);
                    somaSalarioFuncionario = somaSalarioFuncionarios(salarioGerente, somaSalarioFuncionario);
                    qtdFuncionario         = somaQtdFuncionarios(qtdFuncionario);
                    if (salarioGerente > 10000) {
                        qtdFuncionarioAcima10k = qtdFuncionariosAcima10k(qtdFuncionarioAcima10k);
                    }
                    break;
                }

                default:
                    System.out.println(ANSI_RED + "Digitou a opção errada." + ANSI_RESET);
                    break;
            }
            
            showOptions();
            opcao = entrada.nextInt();
            
        }
        
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(ANSI_GREEN + "Você saiu da Aplicação." + ANSI_RESET);
        System.out.println("----------------------------------------------------------------------------- \n \n");
//        System.out.println("");

        
        // Resultados Finais
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(ANSI_YELLOW + "RESULTADOS FINAIS" + ANSI_RESET);
        System.out.println("Total de VENDEDORES: " + qtdVendedor);
        System.out.println("Média Salarial dos VENDEDORES: " + (qtdVendedor != 0 ? somaSalarioVendedor/qtdVendedor : 0));
        
        System.out.println("");
        System.out.println("Total de GERENTES: " + qtdGerente);
        System.out.println("Média Salarial dos GERENTES: " + (qtdGerente != 0 ? somaSalarioGerente/qtdGerente : 0));
        
        System.out.println("");
        System.out.println("Total de FUNCIONÁRIOS: " + qtdFuncionario);
        System.out.println("Média Salarial dos FUNCIONÁRIOS: " + (qtdFuncionario != 0 ? somaSalarioFuncionario/qtdFuncionario : 0));
        
        System.out.println("");
        System.out.println("Total de FUNCIONÁRIOS com o Salário Acima de 10k: " + qtdFuncionarioAcima10k);
        System.out.println("Total de VENDEDORES com o Salário Abaixo de 5k: " + qtdVendedorAbaixo5k);
        System.out.println("-----------------------------------------------------------------------------");
        
    }
    
    public static void showOptions() {  
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(ANSI_CIANO + "1 - Informar dados do Vendedor." + ANSI_RESET 
                + " | " + ANSI_YELLOW + " 2 - Informar dados do Gerente. " + ANSI_RESET 
                + " | " + ANSI_PURPLE + " 0 - Sair." + ANSI_RESET);
        System.out.print("Digite a Opção: ");
    }
    
    
    // VENDEDORES
    public static String cadastrarNomeVendedor(String nomeVendedor) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("");
        System.out.print("Nome do Vendedor: ");
        nomeVendedor = entrada.next();
        
        return nomeVendedor;
    }
    
    public static double cadastrarSalarioVendedor(double salarioVendedor) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Salário do Vendedor: ");
        salarioVendedor = entrada.nextDouble();
        
        return salarioVendedor;
    }
    
    public static double somaSalarioVendedores(double salarioVendedor, double somaSalarioVendedor) {
        somaSalarioVendedor = somaSalarioVendedor + salarioVendedor;
        return somaSalarioVendedor;
    }
    
    public static int somaQtdVendedores(int qtdVendedor) {
        qtdVendedor += 1;
        return qtdVendedor;
    }
    
    public static int qtdVendedoresAbaixo5k(int qtdVendedorAbaixo5k) {
        qtdVendedorAbaixo5k += 1;
        return qtdVendedorAbaixo5k;
    }
    
    
    // GERENTES
    public static String cadastrarNomeGerente(String nomeGerente) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("");
        System.out.print("Nome do Gerente: ");
        nomeGerente = entrada.next();
        
        return nomeGerente;
    }
    
    public static double cadastrarSalarioGerente(double salarioGerente) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Salário do Gerente: ");
        salarioGerente = entrada.nextDouble();
        
        return salarioGerente;
    }
    
    public static double somaSalarioGerentes(double salarioGerente, double somaSalarioGerente) {
        somaSalarioGerente = somaSalarioGerente + salarioGerente;
        return somaSalarioGerente;
    }
    
    public static int somaQtdGerentes(int qtdGerente) {
        qtdGerente += 1;
        return qtdGerente;
    }
    
    
    // FUNCIONÁRIOS
    public static double somaSalarioFuncionarios(double salarioFuncionario, double somaSalarioFuncionario) {
        somaSalarioFuncionario = somaSalarioFuncionario + salarioFuncionario;
        return somaSalarioFuncionario;
    }
    
    public static int somaQtdFuncionarios(int qtdFuncionario) {
        qtdFuncionario += 1;
        return qtdFuncionario;
    }
    
    public static int qtdFuncionariosAcima10k(int qtdFuncionarioAcima10k) {
        qtdFuncionarioAcima10k += 1;
        return qtdFuncionarioAcima10k;
    }
    
}
