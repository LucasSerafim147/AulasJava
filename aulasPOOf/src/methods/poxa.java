package methods;

public class poxa {
	public static void main(String[] args) {
		JavaMetodos j1 = new JavaMetodos();
		int anos = j1.idade();
		System.out.println("a pessoa tem "+ anos + " anos de idade");
		
		double preco = j1.valor();
		System.out.println("Esse produto custou R$"+preco);
		
		String Nome = j1.nome();
		System.out.println(Nome + ", é seu nome?");
		
		Boolean estado = j1.Estado();
		System.out.println(estado);
	}
}
