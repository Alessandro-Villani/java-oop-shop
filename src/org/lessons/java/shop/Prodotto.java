package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	public Prodotto(String nome, String descrizione, double prezzo, int iva) {
		Random rand = new Random();
		this.codice = rand.nextInt(100000000);
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
	
	public String getFormattedPrezzo() {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(prezzo);
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
		double percIva = (getPrezzo() * getIva()) /100;
		return getPrezzo() + percIva;
	}
	
	public String getFormattedPrezzoConIva() {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(getPrezzoConIva());
	}
		
	public String getPaddedCode() {
		String code = "" + getCodice();
		while (code.length() < 8) {
			code = "0" + code;
		}
		return code;
	}
	
	public String getFullName() {
		return getPaddedCode() + getNome(); 
	}
	
	@Override
	public String toString() {
		
		return "Prodotto n.: " + getPaddedCode() + " Nome: " + getNome() + ", Prezzo base: " + getFormattedPrezzo() + "€, Iva: " + getIva() + "%, Prezzo Ivato: " + getFormattedPrezzoConIva() + "€.";
		
	}
	
	
}
