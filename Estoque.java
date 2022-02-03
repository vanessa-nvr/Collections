package br.com.generation.ex.collections;

public class Estoque {
		
		//Atributos
		private int quantProd;
		
		//Construtor
		public Estoque(int quantProd) {
			super();
			this.quantProd = quantProd;
		}
		
		//Métodos
		public int getQuantProd() {
			return quantProd;
		}

		public void setQuantProd(int quantProd) {
			this.quantProd = quantProd;
		}
		
		//Polimorfismo do metodo ToString dentro da classe String
		@Override
		public String toString() {
			return "Estoque [quantProd=" + quantProd + "]";
		}

}
