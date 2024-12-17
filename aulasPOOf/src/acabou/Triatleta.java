package acabou;

public class Triatleta implements Corredor,Ciclista,Nadador {
	
	String Nome;
	double peso,altura;
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public void aquecer() {
		System.out.println("Aquecendo");
		
	}
	@Override
	public void nadar() {
		System.out.println("Nadando");
		
	}
	@Override
	public void pedalar() {
		System.out.println("pedalando");
		
	}
	@Override
	public void correr() {
		System.out.println("correndo");
		
	}
	

}
