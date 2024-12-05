package methods;

public class carro {
	public String cor;
	public String modelo;
	public double preco;
	public boolean estado;

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
		if (estado == false) {
			System.out.println("O carro está ligando! ");
			estado = true;
		} else
			System.out.println("o carro já esta ligado");
	}

	public void acelerar() {
		if (estado == true) {
			System.out.println("O carro está acelerando");
			estado = false;
		} else {
			System.out.println("O carro está desligado, não pode acelerar ");
		}
	}

	public void freiar() {
		if(estado == true) {
		System.out.println("O carro está freiando");
		estado = false;}
		else {
			System.out.println("o carro não pode freiar, ele está desligado!");
		}
	}

	public void desligar() {
		if(!estado) {
		System.out.println("O carro está desligando! ");
		estado = false;
		}else {
			System.out.println("O carro já está desligado");
		}
	}

	public void abastecer() {
		System.out.println("O carro está abastecendo");
	}

}
