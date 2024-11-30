package methods;

public class calculadora {
	public static void main(String[] args) {
		operacoes calc = new operacoes();
		
		
		int result = calc.somar(10,15);
		System.out.println(result);
		result = calc.somar(10, 10,10);
		System.out.println(result);
	}

}
