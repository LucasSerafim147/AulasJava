package fundamentos03;

public class exercico3 {
	public static void main(String[] args) {
		String s1 = "Será que são iguais?";
		String s2 = "Será que são iguais?";
		
		Boolean b1 = s1.equals(s2);
		
		
		if(b1 == true) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
	}

}
