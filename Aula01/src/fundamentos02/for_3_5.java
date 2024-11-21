package fundamentos02;

public class for_3_5 {
	public static void main(String[] args) {
		int soma = 0,x = 0,y= 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 5 == 0 ) {
				y += i;

			} if (i % 3 == 0) {
				x += i;

			}

		}System.out.println(x);
		System.out.println(y);
		soma = x + y;
		System.out.println(soma);
	}
}
