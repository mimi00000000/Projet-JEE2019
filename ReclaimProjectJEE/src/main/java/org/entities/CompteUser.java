package org.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompteUser implements Serializable{
	
	//i deleted that BIG SHIT called ! implementes Serializable : i don't know what does it do here : big shit safi :'
	
	/**
	 * 
	 */
	
	
	//private static final long serialVersionUID = 1L;  --> this one is needed for the Serializable thing!
	
	@Id
	private String cinU;
	private String motdepasseU;
	private String natureCompte;
	
	
	public CompteUser() {
		super();
	}

	public CompteUser(String cinU, String motdepasseU, String natureCompte) {
		super();
		this.cinU = cinU;
		this.motdepasseU = motdepasseU;
		this.natureCompte = natureCompte;
	}
	
	public String getCinU() {
		return cinU;
	}
	public void setCinU(String cinU) {
		this.cinU = cinU;
	}
	public String getMotdepasseU() {
		return motdepasseU;
	}
	public void setMotdepasseU(String motdepasseU) {
		this.motdepasseU = motdepasseU;
	}
	public String getNatureCompte() {
		return natureCompte;
	}
	public void setNatureCompte(String natureCompte) {
		this.natureCompte = natureCompte;
	}

	
}
