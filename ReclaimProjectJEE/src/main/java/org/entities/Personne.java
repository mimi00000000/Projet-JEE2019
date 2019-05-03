package org.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Personne {
	
	@Id
	private String cin;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private Date dateNaissance;
	private String numTele;
	private String sexe;
	
	@OneToMany(mappedBy="reclamant")
	private Collection<Reclamation> reclamations;

	
	@ManyToOne
	@JoinColumn(name="ville_Personne")
	private Ville ville;
	
	
	
	
	public Personne() {
		super();
	}

	public Personne(String cin, String nom, String prenom, String email, String adresse, Date dateNaissance,
			String numTele, String sexe) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.numTele = numTele;
		this.sexe = sexe;
	}
	
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getNumTele() {
		return numTele;
	}
	public void setNumTele(String numTele) {
		this.numTele = numTele;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	public Collection<Reclamation> getReclamtions() {
		return reclamations;
	}

	public void setReclamations(Ville ville) {
		this.reclamations = reclamations;
	}
	
}
