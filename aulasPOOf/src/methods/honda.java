package methods;

public class honda extends carro {
	public String motor;
	
	public honda(String motor, String modelo, String cor, double preco) {
		super(cor,modelo,preco);
		this.motor = motor;
	}
	
}
