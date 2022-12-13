package br.com.atm_fabio;

import java.util.Scanner;

public class ATM_FABIO {
	

	public static void main(String[] args) {
	
		
		cabecalho();
		menu();
		deposito();
		saque ();
		emprestimo();
		investimento();
		sair();
		 
	}
	 
	
	public static void cabecalho(){

	
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

					System.out.print("- ");

				} else {

					System.out.print("X ");
				}	
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("      Seja Bem Vindo!");
		System.out.println();
		System.out.println("----------------------------");
		
		
		
	}
	
	
	public static void menu() {

			Scanner scan = new Scanner(System.in);
			 
			String A = "°°°   1 - Deposito      °°°";
			String B = "°°°   2 - Saque         °°°";
			String C = "°°°   3 - Emprestimo    °°°";
			String D = "°°°   4 - Investimento  °°°";
			String E = "°°°   5 - Sair          °°°";
			
				//System.out.println();
				System.out.println("  Digite a opção desejada");
				System.out.println();
				System.out.printf("%s \n%s \n%s \n%s \n%s ", A, B, C, D, E);
				System.out.println();
				int opcao = scan.nextInt();
				System.out.println();
				System.out.println("----------------------------");
				
			
			  
			 /*switch (opcao) {
			     case 1:
			       System.out.println("Deposito.");
			       break;
			       
			     case 2: 
			    	 System.out.println("Saque.");
			    	 break;
			    
			     case 3:
			    	 System.out.println("Emprestimo");
			    	 break;
			    
			     case 4: 
			    	 System.out.println("Investimento");
			    	 break;
			    	 
			     case 5:
			    	 System.out.println("Sair");
			    	 break;
			    	 
		   default:
		      System.out.println("Digite uma opção válida.");
		   }*/
	}
	
	public static void deposito() {
		
		
	}
	
	public static void saque() {
		
	}
	
	public static void emprestimo() {
		
	}
	
	public static void investimento() {
		
	}
	
	public static void sair() {
		
		Scanner scan = new Scanner(System.in);
		
		 
		
    	 int opcao1 = scan.nextInt();
    	 
    	 switch (opcao1) {
	     
	     case 5:
	    	 System.out.println(" <<< Sessão encerrada >>>");
	    	 
	    	 
	    	 break;
	    	 
   default:
      System.out.println("Digite uma opção válida.");
   }return ; 
    	
	}
}

	

