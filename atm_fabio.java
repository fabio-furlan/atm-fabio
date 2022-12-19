package br.com.atm_fabio;

public class atm_fabio {

	public static void main(String[] args) {
		

		for (int linha = 0; linha < 6; linha ++) {

			for (int coluna = 0; coluna < 54; coluna ++) {
				// A
				if (coluna ==0 && linha ==0 
				|| coluna ==4 && linha ==0
				||coluna > 4 && coluna < 6 && linha < 6 
				|| coluna > 0 && coluna < 4 && linha ==1
				|| coluna >0 && coluna < 4 & linha >2
				
				//T
				|| coluna > 10 && coluna < 12 && linha <6
				|| coluna >5 && coluna < 8 && linha >0
				|| coluna >8 && coluna < 11 && linha >0
				
				//M
				|| coluna >12 && coluna <16 && linha <=0
				|| coluna == 14 && linha == 1
				|| coluna == 13 && linha >1
				|| coluna == 14 && linha >2
				|| coluna == 15 && linha >1
				
				// - 
				|| coluna >16 && coluna < 18 && linha <6 || coluna >17 && coluna < 23 && linha < 2
				|| coluna >22 && coluna <24 && linha < 6
				|| coluna > 17 && coluna < 23 && linha >2
				
				// F
				|| coluna ==29 && linha >=0
				|| coluna >24 && coluna <29 && linha == 1 
				|| coluna > 24 && coluna <29 && linha >2
				
				// A2
				|| coluna == 30 && linha ==0
				|| coluna == 34 && linha ==0
				|| coluna >30 && coluna < 34 && linha ==1
				|| coluna > 30 && coluna <34 && linha >2
				
				//B 
				|| coluna ==35 && linha >=0
				|| coluna ==40 && linha ==0 
				|| coluna > 36 && coluna <40 && linha ==1
				|| coluna > 36 && coluna < 40 && linha >2 && linha <5
				|| coluna ==40 && linha ==5
				
				// I
				|| coluna >40 && coluna <44 && linha >=0
				|| coluna == 44 && linha ==1
				|| coluna >44 && coluna <48
				
				// O
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
		System.out.println("                                             Seja Bem Vindo!");

	}

}
