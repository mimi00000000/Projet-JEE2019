package org.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CompteVerification  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String cinV;
	private String nomV;
	private String prenomV;
	private Date dateNaissanceV;
	
	
	
	public CompteVerification() {
		super();
	}

	public CompteVerification(String cinV, String nomV, String prenomV, Date dateNaissanceV) {
		super();
		this.cinV = cinV;
		this.nomV = nomV;
		this.prenomV = prenomV;
		this.dateNaissanceV = dateNaissanceV;
	}
	
	public String getCinV() {
		return cinV;
	}
	public void setCinV(String cinV) {
		this.cinV = cinV;
	}
	public String getNomV() {
		return nomV;
	}
	public void setNomV(String nomV) {
		this.nomV = nomV;
	}
	public String getPrenomV() {
		return prenomV;
	}
	public void setPrenomV(String prenomV) {
		this.prenomV = prenomV;
	}
	public Date getDateNaissanceV() {
		return dateNaissanceV;
	}
	public void setDateNaissanceV(Date dateNaissanceV) {
		this.dateNaissanceV = dateNaissanceV;
	}
	
	

}
