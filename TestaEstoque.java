package br.com.generation.ex.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaEstoque {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		ArrayList<Estoque> produtos = new ArrayList<>();
		
		System.out.println("Número de tipos de produtos diferentes: ");
		int numDif = ler.nextInt();
		
		//Loop para adicionar os inputs no Array
		for(int i=0;i<numDif;i++) {
			System.out.println("Quantidade do "+(i+1)+"º produto: ");
			int quantProd = ler.nextInt();
			produtos.add(new Estoque(quantProd));
		}
		//Remover item da lista
		int k=0;
		while(k !=2) {
			System.out.println("Você deseja retirar algum produto?[Digite 1 para sim e 2 para não] ");
			int rem = ler.nextInt();
			k=rem;
			if(rem==1) {
				System.out.println("Qual o índice do produto a ser removido? ");
				int ind = ler.nextInt();
				produtos.remove(ind);}
		}
		//Atualiza lista
		int at=1;
		while(at != 2) {
			System.out.println("Há alguma adição?[Digite 1 para sim e 2 para não] ");
			int at2 = ler.nextInt();
			at=at2;
			if(at == 1) {
				System.out.println("Quantidade do novo produto: ");
				int quantProd = ler.nextInt();
				produtos.add(new Estoque(quantProd));
			}

		}		
		//Imprime a lista
		for(Estoque i : produtos) {
			System.out.println(i);
		}
		ler.close();
	}

}
