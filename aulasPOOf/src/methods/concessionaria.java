package methods;

public class concessionaria {
	public static void main(String[] args) {
		carro c0 = new carro();
		carro c1 = new carro("Azul");
		carro c2 = new carro("preto", "Onix", 1200.00);
		
		c1.desligar();
		c1.acelerar();
	}
}
