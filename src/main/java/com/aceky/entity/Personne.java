package com.aceky.entity;

import java.time.LocalDate;

public class Personne {
	int id ; 
	String nom ;
	String prenom ;
	boolean sexe ;
	LocalDate dateDeNaissance ;
	StatutMatrimonial statutMatrimonial ;
	String addresse ;
	String contact ;
	public Personne(int id, String nom, String prenom, boolean sexe, LocalDate dateDeNaissance,
			StatutMatrimonial statutMatrimonial, String addresse, String contact) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateDeNaissance = dateDeNaissance;
		this.statutMatrimonial = statutMatrimonial;
		this.addresse = addresse;
		this.contact = contact;
	}
	
	public Personne(String nom, String prenom, boolean sexe, LocalDate dateDeNaissance,
			StatutMatrimonial statutMatrimonial, String addresse, String contact) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateDeNaissance = dateDeNaissance;
		this.statutMatrimonial = statutMatrimonial;
		this.addresse = addresse;
		this.contact = contact;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public boolean isSexe() {
		return sexe;
	}
	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public StatutMatrimonial getStatutMatrimonial() {
		return statutMatrimonial;
	}
	public void setStatutMatrimonial(StatutMatrimonial statutMatrimonial) {
		this.statutMatrimonial = statutMatrimonial;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	} 
}
