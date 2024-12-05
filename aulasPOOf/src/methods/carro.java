package methods;

public class carro {
	public String cor;
	 public String modelo;
	 public double preco;
	 public carro() {
		 
	 }
	 public carro(String c) {
		 this.cor = c; 
	 }
	 public carro(String c, String m, double p) {
		 this.cor = c;
		 this.modelo = m;
		 this.preco = p;
	 }
	
	public void ligar() {
		System.out.println("O carro está ligando! ");
		
	}
	public void desligar() {
		System.out.println("O carro está desligando! ");
	}
	
	

}
