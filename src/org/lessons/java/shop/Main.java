package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto prod1 = new Prodotto("Pera", "Cibo buono", 1.2, 22);
		
		System.out.println(prod1.toString()); 
		
		prod1.setNome("Mela");
		prod1.setDescrizione("Toglie il medico di torno");
		prod1.setPrezzo(1.42);
		prod1.setIva(14);
		
		System.out.println(prod1.toString()); 
		System.out.println("prezzo base: " + prod1.getPrezzo());
		System.out.println("prezzo ivato: " + prod1.getPrezzoConIva());
		System.out.println("padded code: " + prod1.getPaddedCode());
		System.out.println("nome completo: " + prod1.getFullName());
		

	}

}
