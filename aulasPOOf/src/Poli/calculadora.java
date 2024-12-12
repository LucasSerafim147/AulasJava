package Poli;

public class calculadora {
	public static void main(String[] args) {
		operacao a = new operacao();
		operacao b = new operacao();
		
		
		System.out.println(a.somar(10.5, 13.5));
		System.out.println(b.somar(10, 12.6));
		System.out.println(b.somar(12, 12, 12));
		
		
		
	}

}
