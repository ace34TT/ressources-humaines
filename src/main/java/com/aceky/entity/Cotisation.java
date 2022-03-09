package com.aceky.entity;

public class Cotisation {
	int id ;
	String name ;
	float valeur ;
	String unite ;
	public Cotisation(int id, String name, float valeur, String unite) {
		super();
		this.id = id;
		this.name = name;
		this.valeur = valeur;
		this.unite = unite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	
	
}
