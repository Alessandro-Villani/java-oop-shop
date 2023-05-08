package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	public Prodotto(String nome, String descrizione, double prezzo, int iva) {
		Random rand = new Random();
		this.codice = rand.nextInt(10000000);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	public double getPrezzoConIva() {
		double percIva = (getPrezzo() * getIva()) /2;
		return getPrezzo() + percIva;
	}
	
	public String getFullName() {
		return getCodice() + getNome(); 
	}
	
	public String getPaddedCode() {
		String code = "" + getCodice();
		while (code.length() < 8) {
			code = "0" + code;
		}
		return code;
	}
	
	
}
