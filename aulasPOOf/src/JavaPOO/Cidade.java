package JavaPOO;

public class Cidade {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.cadastrar();
	//	p2.cadastrar();
		System.out.printf("%s que tem %d anos e pesa %.2f\n",p1.nome, p1.idade, p1.peso);
		p1.comer();
		
}
}
