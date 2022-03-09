package com.aceky.entity;

import java.time.LocalDate;

public class Employe extends Personne {
	int matricule ;
	Poste poste ;
	LocalDate dateEmbauche ;
	Contrat contrat ;
	float salaireDeBase ;
	float conge ;
	Cotisation cotisation [];
	
	public Employe(int id, String nom, String prenom, boolean sexe, LocalDate dateDeNaissance,
			StatutMatrimonial statutMatrimonial, String addresse, String contact) {
		super(id, nom, prenom, sexe, dateDeNaissance, statutMatrimonial, addresse, contact);
		// TODO Auto-generated constructor stub
	}
	
	public Employe( String nom, String prenom, boolean sexe, LocalDate dateDeNaissance,
			StatutMatrimonial statutMatrimonial, String addresse, String contact) {
		super(nom, prenom, sexe, dateDeNaissance, statutMatrimonial, addresse, contact);
		// TODO Auto-generated constructor stub
	}

}
