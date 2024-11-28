package fundamentos03;

public class ex8 {
	public static void main(String[] args) {
		String um = "Hello";
		String dois = "HELLO";
		boolean b1 = um.equals ("Hello");
		boolean b2 = um.equals (dois);
		boolean b3 = um.equalsIgnoreCase (dois);
		boolean b4= um.equalsIgnoreCase("azul");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}
}
