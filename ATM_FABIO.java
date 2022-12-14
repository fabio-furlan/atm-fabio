package br.com.atm_fabio;

import java.util.Scanner;

public class ATM_FABIO {
	
	static double saldo  ;

	public static void main(String[] args) {
		
		//double SaldoLiquido = SaldoDeposito + SaldoSaque;
		cabecalho();
		menu();
		
		
	}
	
	public static void cabecalho() {
		
		// Cabecalho Matriz ATM 6x53.
		
		for (int linha = 0; linha < 6; linha ++) {

			for (int coluna = 0; coluna < 54; coluna ++) {
				
				// Letra A
				if (coluna ==0 && linha ==0 
				|| coluna ==4 && linha ==0
				|| coluna > 4 && coluna < 6 && linha < 6 
				|| coluna > 0 && coluna < 4 && linha ==1
				|| coluna >0 && coluna < 4 & linha >2
				
				// Letra T
				|| coluna > 10 && coluna < 12 && linha <6
				|| coluna >5 && coluna < 8 && linha >0
				|| coluna >8 && coluna < 11 && linha >0
				
				// Letra M
				|| coluna >12 && coluna <16 && linha <=0
				|| coluna == 14 && linha == 1
				|| coluna == 13 && linha >1
				|| coluna == 14 && linha >2
				|| coluna == 15 && linha >1
				
				// - 
				|| coluna >16 && coluna < 18 && linha <6 || coluna >17 && coluna < 23 && linha < 2
				|| coluna >22 && coluna <24 && linha < 6
				|| coluna > 17 && coluna < 23 && linha >2
				
				// Letra F
				|| coluna ==29 && linha >=0
				|| coluna >24 && coluna <29 && linha == 1 
				|| coluna > 24 && coluna <29 && linha >2
				
				// Letra A2
				|| coluna == 30 && linha ==0
				|| coluna == 34 && linha ==0
				|| coluna >30 && coluna < 34 && linha ==1
				|| coluna > 30 && coluna <34 && linha >2
				
				//Letra B 
				|| coluna ==35 && linha >=0
				|| coluna ==40 && linha ==0 
				|| coluna > 36 && coluna <40 && linha ==1
				|| coluna > 36 && coluna < 40 && linha >2 && linha <5
				|| coluna ==40 && linha ==5
				
				// Letra I
				|| coluna >40 && coluna <44 && linha >=0
				|| coluna == 44 && linha ==1
				|| coluna >44 && coluna <48
				
				// Letra O
				||coluna ==48 && linha ==0 
				||coluna ==52 && linha ==0
				|| coluna > 48 && coluna < 52 && linha >0 && linha <5
				|| coluna ==48 && linha ==5
				|| coluna == 52 && linha ==5
				|| coluna ==53 && linha >=0
				) {

					System.out.print("-");

				} else {

					System.out.print("X");
				}	
			}

			System.out.println();
		}
		
		System.out.println();
		System.out.println("      Seja Bem Vindo!");
		System.out.println();
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		
		
		
	}
	
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		 
		
		String A = "°°    1 - Depósito       °°";
		String B = "°°    2 - Saque          °°";
		String C = "°°    3 - Emprestimo     °°";
		String D = "°°    4 - Investimento   °°";
		String E = "°°    5 - Sair           °°";
	
			System.out.println("       °°°  Menu  °°°");
			System.out.println();
			System.out.println("   Digite a opção desejada");
			System.out.println("____________________________");
			System.out.println();
			System.out.printf("%s \n%s \n%s \n%s \n%s  ", A, B, C, D, E);
			System.out.println();
			System.out.println("____________________________");
			
			int opcao = scan.nextInt();

			switch (opcao) {
			
		     case 1:
		       deposito();
		       break;
		       
		     case 2: 
		    	 saque();
		    	 break;
		    
		     case 3:
		    	 emprestimo();
		    	 break;
		    
		     case 4: 
		    	 investimento();
		    	 break;
		    	 
		     case 5:
		    	 sair();
		    	 break;
		    	 
	   default:
	      System.out.println("   Digite uma opção válida.");
	      System.out.println();
	      menu();
			}
			
			scan.close();
	}
	
	public static void deposito() {

		 Scanner scanner = new Scanner(System.in);
	    
	        
	     System.out.println("    °°°  Depósito  °°°");
	     System.out.println();
		 System.out.println("Digite o valor para depósito. ");
		 System.out.println();
       
        double depositar = scanner.nextDouble();
        
        saldo = saldo + depositar;
        System.out.println();
        System.out.println("Depósito realizado com Sucesso!");
       
        System.out.println();
        System.out.printf("Seu saldo atual é: R$ %.2f\n\n " , saldo);
        
        menu();
        scanner.close(); 
}
	
    public static void saque() {
		
    	Scanner scanner = new Scanner(System.in);
	   
	     System.out.println("      °°° Saque °°°");
	     System.out.println();
		 System.out.println("Digite o valor para saque.");
		 System.out.println();
      
       double saque = scanner.nextDouble();
       System.out.println("\n");
       saldo = saldo - saque;
       if (saque >= saldo) { 
   	   
    	   System.out.println("Saque realizado com Sucesso!"); 
    	   System.out.println();
           System.out.printf("Seu saldo atual é: R$ %.2f", saldo);
           System.out.println("\n");
          menu();
          
       }else {
    	   System.out.println();
    	   System.out.println(">>>> Saldo insuficiênte <<<<");
    	   System.out.println();
    	   
    	   menu();  
       }
      
	}
    
    public static void emprestimo() {
	
}
    
    public static void investimento() {
	
}
    
    public static void sair() {
    	
	    System.out.println("  <<< Sessão encerrada >>>");
		
	}
    
}

	

