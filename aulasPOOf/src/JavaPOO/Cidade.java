package JavaPOO;

public class Cidade {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Lucas";
		p1.peso = 68.00;
		p1.idade = 19;
		System.out.printf("%s que tem %d anos e pesa %.2f\n",p1.nome, p1.idade, p1.peso);
		p1.comer();
}
}
