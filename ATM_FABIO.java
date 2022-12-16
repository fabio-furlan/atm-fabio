package br.com.atm_fabio;

import java.util.Scanner;

public class ATM_FABIO {

	static double saldo;
	
	public static void main(String[] args) {

		cabecalho();
		menu();
	}

	public static void cabecalho() {

		// Cabecalho Matriz ATM 6x53.

		for (int linha = 0; linha < 6; linha++) {

			for (int coluna = 0; coluna < 54; coluna++) {

				// Letra A
				if (coluna == 0 && linha == 0 || coluna == 4 && linha == 0 || coluna > 4 && coluna < 6 && linha < 6
						|| coluna > 0 && coluna < 4 && linha == 1 || coluna > 0 && coluna < 4 & linha > 2

						// Letra T
						|| coluna > 10 && coluna < 12 && linha < 6 || coluna > 5 && coluna < 8 && linha > 0
						|| coluna > 8 && coluna < 11 && linha > 0

						// Letra M
						|| coluna > 12 && coluna < 16 && linha <= 0 || coluna == 14 && linha == 1
						|| coluna == 13 && linha > 1 || coluna == 14 && linha > 2 || coluna == 15 && linha > 1

						// -
						|| coluna > 16 && coluna < 18 && linha < 6 || coluna > 17 && coluna < 23 && linha < 2
						|| coluna > 22 && coluna < 24 && linha < 6 || coluna > 17 && coluna < 23 && linha > 2

						// Letra F
						|| coluna == 29 && linha >= 0 || coluna > 24 && coluna < 29 && linha == 1
						|| coluna > 24 && coluna < 29 && linha > 2

						// Letra A2
						|| coluna == 30 && linha == 0 || coluna == 34 && linha == 0
						|| coluna > 30 && coluna < 34 && linha == 1 || coluna > 30 && coluna < 34 && linha > 2

						// Letra B
						|| coluna == 35 && linha >= 0 || coluna == 40 && linha == 0
						|| coluna > 36 && coluna < 40 && linha == 1
						|| coluna > 36 && coluna < 40 && linha > 2 && linha < 5 || coluna == 40 && linha == 5

						// Letra I
						|| coluna > 40 && coluna < 44 && linha >= 0 || coluna == 44 && linha == 1
						|| coluna > 44 && coluna < 48

						// Letra O
						|| coluna == 48 && linha == 0 || coluna == 52 && linha == 0
						|| coluna > 48 && coluna < 52 && linha > 0 && linha < 5 || coluna == 48 && linha == 5
						|| coluna == 52 && linha == 5 || coluna == 53 && linha >= 0) {

					System.out.print(" ");

				} else {

					System.out.print("x");
				}
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("                  SEJA BEM VINDO!");
		System.out.println();
		System.out.printf("  °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n\n");

	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);

		String A = "             °°    1 - Depósito       °°";
		String B = "             °°    2 - Saque          °°";
		String C = "             °°    3 - Empréstimo     °°";
		String D = "             °°    4 - Investimento   °°";
		String E = "             °°    5 - Sair           °°";

		System.out.println("                  °°°  Menu  °°°");
		System.out.println();
		System.out.println("               Digite a opção desejada");
		System.out.println("             ___________________________ ");
		System.out.println();
		System.out.printf("%s \n%s \n%s \n%s \n%s  ", A, B, C, D, E);
		System.out.println();
		System.out.printf("             ___________________________ \n\n");
		System.out.printf("  __________________________________________________ \n\n");
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
			System.out.println("           _____________________________");
			System.out.println("           *<<Digite uma opção válida>>*");
			System.out.println();
			menu();	
		}
		
		scan.close();
	}

	public static void deposito() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("                 °°°  Depósito  °°°");
		System.out.println();
		System.out.println("            Digite o valor para depósito. ");

		double depositar = scanner.nextDouble();
		if(depositar > 0){saldo += depositar;

 	   System.out.println("           Depósito realizado com Sucesso!");
        System.out.printf("    Retire seu comprovante de deposito: R$ %.2f.%n " , depositar);
        System.out.printf("            Seu saldo atual é: R$ %.2f.%n", saldo);
        System.out.println();
	    	   
	    	   }else if (saldo <= depositar) {
	   			System.out.println("     ___________________________________________");
	    		System.out.println("     *<< Valores negativos não são permitidos>>*");
		    	System.out.println();
	    	   
	    	   }else {
	   		   System.out.println("          _________________________________");
	    	   System.out.println("          *<< Transação não autorizada! >>*");
	    	   System.out.println();
	    	   menu();
	    	   }

		menu();
		scanner.close();
	}

	public static void saque() {
		
    	Scanner scanner = new Scanner(System.in);
	   
	     System.out.println("                 °°°  Saque  °°°");
	     System.out.println();
		 System.out.println("            Digite o valor para saque.");

      
       double saque = scanner.nextDouble();

       
       if(saque <= 0){
			System.out.println("         _________________________________");
    	   System.out.println("          *<< Transação não autorizada! >>*");
    	   System.out.println();
    	   }else if (saldo >= saque) {
    	   saldo -= saque;

    	   System.out.println("               Transação autorizada!");
    	   System.out.println("           Saque realizado com Sucesso!");
           System.out.printf("           Retire seu dinheiro: R$ %.2f%n" , saque);
           System.out.printf("            Seu saldo atual é: R$ %.2f%n", saldo);
           System.out.println();
    	   }else {
   		   System.out.println("            __________________________");
    	   System.out.println("            *<< Saldo insuficiente >>*");
    	   System.out.println();
    	   }
       	menu();
       	
       	scanner.close();
       		}
	
	public static void menu1() {
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);

		String S = "              °°°      1 - Sim      °°°";
		String N = "              °°°      2 - Não      °°°";

		System.out.printf("                 °°° Empréstimo °°°\n");
		System.out.println();
		System.out.print("\n Parabéns! Você tem um empréstimo aprovado no valor de\n R$ 5.000,"
				+ "com juros de 5% ao mês e pagamento em até 12X.\n");
		System.out.println();
		System.out.println("  Quer saber mais?");
		System.out.println();
		System.out.printf("%s \n%s  \n \n", S, N);
		System.out.println("  ___________________________________________________");
		
		int op = sc.nextInt();

		switch (op) {
		
		case 1:
			sim();
			break;
		case 2:
			Nao();
			break;
			
		default:
			System.out.println("         _________________________________");
			System.out.println("          *<< Escolha uma opção válida >>*");
			System.out.println();
			menu1();
		}
		
		sc.close();
		
		
	}
	
	public static void emprestimo() {
		menu1();
		
	}
	
	 public static void sim() {
		 
		System.out.println(" ");
		Scanner yes = new Scanner(System.in);

		String A1 = "            °°°  1 - 12x R$ 437,50  °°°";
		String B1 = "            °°°  2 - 9x  R$ 583,33  °°°";
		String C1 = "            °°°  3 - 6x  R$ 833,33  °°°";
		String D1 = "            °°°  4 - Voltar ao menu °°°";
		
		System.out.println("                    *ATENÇÃO!*\n\n");
		System.out.println("  Para valores acima de R$ 5.000 e outras condições de\n pagamentos, você deverá comparecer até sua agência para\n consultar disponibilidade.\n\n");
		System.out.println("                 Escolha uma opção ?");
		System.out.println();
		System.out.printf("%s \n%s  \n%s \n%s \n", A1,B1,C1,D1);
		
		int opE = yes.nextInt();

		switch (opE) {
		
		case 1:
			simE12X();
			break;
		case 2:
			simE9X();
			break;
		case 3:
			simE6X();
			break;
		case 4:
			cancelar();
			break;
			
		default:
			System.out.println();
			System.out.println("           ______________________________");
			System.out.println("          *<< Escolha uma opção válida >>*");
			
			System.out.println();
			sim();
			sair();
			yes.close();
			
		}
		
	}
	 
	 private static void cancelar() {
		 System.out.printf( "   ___________________________________________________\n\n");
		menu();
		
	}

	private static void simE6X() {
		
double emprestimo = 5000 + saldo;
		
		System.out.println("                Empréstimo contratado!");
		System.out.println("            06 parcelas de R$ 833,33 com a \n            primeira parcela para 30 dias.\n\n");
		System.out.printf("             Seu saldo atual é R$ %.2f\n\n\n ", emprestimo);
		
		sair();
	}

	private static void simE9X() {
double emprestimo = 5000 + saldo;
		
		System.out.println("                Empréstimo contratado!");
		System.out.println("            09 parcelas de R$ 583,33 com a \n            primeira parcela para 30 dias.\n\n");
		System.out.printf("             Seu saldo atual é R$ %.2f\n\n\n ", emprestimo);
		
		sair();
		
	}

	private static void simE12X() {
		
		double emprestimo = 5000 + saldo;
		
		System.out.println("                Empréstimo contratado!");
		System.out.println("            12 parcelas de R$ 437,50 com a \n            primeira parcela para 30 dias.\n\n");
		System.out.printf("             Seu saldo atual é R$ %.2f\n\n\n ", emprestimo);
		
		sair();
		
	}

	public static void Nao() {
		 System.out.println();
		 System.out.println();
		menu(); 
			
		}
	
	public static void investimento() {

	}

	public static void sair() {

		System.out.println("              <<< Sessão encerrada >>>");
		System.out.printf("  \n °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n\n");
		
	}

}
