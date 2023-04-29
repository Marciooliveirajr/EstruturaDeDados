package EstruturaDeDados;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class exercicio1 {
	

		public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int op;
			String nome = null;
			
			Queue<String> fila = new LinkedList();
			
			do {
		    System.out.println("*************************************************************");
			System.out.println("\t Menu principal");
			System.out.println("1- Adicionar Cliente na Fila ");
			System.out.println("2- Listar Todos os Clientes ");
			System.out.println("3- Retirar Cliente da Fila ");
			System.out.println("0- Sair");
			System.out.println("\n*************************************************************");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
						
			switch(op) {
			
			case 1:
				leia.nextLine();
				System.out.println("\nDigite seu nome para ser adicionado : \n");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("\nFila: \n"+fila+"\nCliente Adicionado! ");
				
			break;
			
			case 2:
				leia.nextLine();
				System.out.println("Lista de Cientes na Fila: \n"+fila);
				
				break;
				
			case 3: 
				leia.nextLine();
				if(fila.contains(nome)) {
					fila.remove(nome);
					System.out.println("Fila: \n"+fila+"\nO Cliente Foi Chamado!");
					
					
				}else {
					
					System.out.println("A Fila Está Vazia!");
				
				}
				
				 break;
				
			case 0:
				System.out.println("Muito obrigado pela preferência e pelo carinho!!");
				System.out.println("Volte sempre!!");
				break;
				
			default:
				System.out.println("\nOpção inválida");
			
			}
			}while(op != 0);
				
					
	  }	
	}

		
	


	

		

	
	
		



