package org.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Risque implements Serializable{
	//jai supprime implements serializable
	//get works when i deleted the serialiqable shit!!!
	public Risque() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id
	private String nomRisque;
	private String descriptionRisque;
	private String TypeRisque;


	public String getTypeRisque() {
		return TypeRisque;
	}

	public void setTypeRisque(String typeRisque) {
		TypeRisque = typeRisque;
	}
		
	public Risque(String TypeRisque,String nomRisque, String descriptionRisque) {
		super();
		this.nomRisque = nomRisque;
		this.descriptionRisque = descriptionRisque;
		this.TypeRisque = TypeRisque;
	}
	
	public String getNomRisque() {
		return nomRisque;
	}
	public void setNomRisque(String nomRisque) {
		this.nomRisque = nomRisque;
	}
	public String getDescriptionRisque() {
		return descriptionRisque;
	}
	public void setDescriptionRisque(String descriptionRisque) {
		this.descriptionRisque = descriptionRisque;
	}
	
	
	
}
