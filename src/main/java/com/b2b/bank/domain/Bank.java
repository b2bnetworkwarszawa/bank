package com.b2b.bank.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Klient> klienci = new ArrayList<Klient>();
	private String nazwaBanku;
	public List<Klient> getKlienci() {
		return klienci;
	}
	public void setKlienci(List<Klient> klienci) {
		this.klienci = klienci;
	}
	public String getNazwaBanku() {
		return nazwaBanku;
	}
	public void setNazwaBanku(String nazwaBanku) {
		this.nazwaBanku = nazwaBanku;
	}
	//dodanie linijki komentarza
	
	//kolejna linijak bo nie dodałam nazwy brancha dlatego pewnie nie było notyfikacji

}
