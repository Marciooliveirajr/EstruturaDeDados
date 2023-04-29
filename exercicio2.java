package EstruturaDeDados;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		int op;
		String livro = null;
		Stack<String> pilha = new Stack<String>();

		do {
			System.out.println("\t Menu de livros");
			System.out.println("1- Adicionar um novo livro na pilha ");
			System.out.println("2- Listar todos os livros ");
			System.out.println("3- Retirar um livro da pilha ");
			System.out.println("0- Sair");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
						
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: \n");
				livro = leia.nextLine();
				pilha.add(livro);
				System.out.println("\nPilha: \n"+pilha+"\nLivro Adicionado! ");
				
			break;
			
			case 2:
				leia.nextLine();
				System.out.println("Pilha de livros: \n"+pilha);
				System.out.println("\n");
			break;
				
			case 3: 
				leia.nextLine();
				if(pilha.contains(livro)) {
					pilha.remove(livro);
					System.out.println("Pilha: \n"+pilha+"\nO Livro foi removido!");
					
				}else {
					System.out.println("A Pilha Está Vazia!");
					
				}
			break;
				
			case 0:
				System.out.println("Muito obrigado pela preferência e pelo carinho!!");
				System.out.println("Volte sempre!!");
			break;
				
			default:
				System.out.println("\nOpção inválida! Tente uma opção válida...");
				

			}
			}while(op != 0);
				
	}

}

