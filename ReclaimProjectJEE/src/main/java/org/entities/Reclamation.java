package org.entities;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Reclamation implements Serializable{
	//i deleted again the serializable SHIT
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	//i added a default constructor
	public Reclamation() {
		super();
	}
	@Id
	private String nomReclamation;
	
	private String Description;
	private String nomRisque;
	private int numberPersonnes;
	private String localisation;
	private String matriculeVictime;
	private String matriculeSuspect;
	private String photo;
	private Date dateReclamation;
	private String adresse;
	
	
	@ManyToOne
	@JoinColumn(name="reclamant_Code")
	private Personne reclamant;
	
	@ManyToMany
	@JoinTable(name="Recalamation_Services")
	private Collection<ServiceR> services;

	
	public Reclamation(String nomRisque, String nomReclamation, String Description, int numberPersonnes, String localisation,
			String matriculeVictime, String matriculeSuspect, String photo, Date dateReclamation, String adresse) {
		super();
		this.nomRisque = nomRisque;
		this.nomReclamation = nomReclamation;
		this.Description = Description;
		this.numberPersonnes = numberPersonnes;
		this.localisation = localisation;
		this.matriculeVictime = matriculeVictime;
		this.matriculeSuspect = matriculeSuspect;
		this.photo = photo;
		this.dateReclamation = dateReclamation;
		this.adresse = adresse;
	}
	public String getNomReclamation() {
		return nomReclamation;
	}
	public void setNomReclamation(String nomReclamation) {
		this.nomReclamation = nomReclamation;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public int getNumberPersonnes() {
		return numberPersonnes;
	}
	public void setNumberPersonnes(int numberPersonnes) {
		this.numberPersonnes = numberPersonnes;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getMatriculeVictime() {
		return matriculeVictime;
	}
	public void setMatriculeVictime(String matriculeVictime) {
		this.matriculeVictime = matriculeVictime;
	}
	public String getMatriculeSuspect() {
		return matriculeSuspect;
	}
	public void setMatriculeSuspect(String matriculeSuspect) {
		this.matriculeSuspect = matriculeSuspect;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getDateReclamation() {
		return dateReclamation;
	}
	public void setDateReclamation(Date dateReclamation) {
		this.dateReclamation = dateReclamation;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Personne getReclamant() {
		return reclamant;
	}
	public void setReclamant(Personne reclamant) {
		this.reclamant = reclamant;
	}
	
	public Collection<ServiceR> getServices() {
		return services;
	}
	public void setServices(Collection<ServiceR> Services) {
		this.services = services;
	}
	public String getNomRisque() {
		return nomRisque;
	}
	public void setNomRisque(String nomRisque) {
		this.nomRisque = nomRisque;
	}
	
	
	
}
