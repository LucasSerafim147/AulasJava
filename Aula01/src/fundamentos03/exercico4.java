package fundamentos03;

import java.util.Scanner;

public class exercico4 {
	public static void main(String[] args) {
		Scanner scr = new Scanner (System.in);
		String txt;
		System.out.println("Insira algum texto: ");
		txt = scr.next();
		String alo = txt.toUpperCase();
		System.out.println(alo);
		
	}
}
