package org.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ServiceR  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long numberService;
	
	private String nomService;
	private String emailService;
	private String adresseService;
	private String numTeleService;
	
	@ManyToMany(mappedBy="services")
	private Collection<Reclamation> reclamtions;
	
	
		
	public ServiceR() {
		super();
	}

	public ServiceR(String nomService, String emailService, String adresseService, String numTeleService) {
		super();
		this.nomService = nomService;
		this.emailService = emailService;
		this.adresseService = adresseService;
		this.numTeleService = numTeleService;
	}
	
	public long getNumberService() {
		return numberService;
	}

	public void setNumberService(long numberService) {
		this.numberService = numberService;
	}
	

	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public String getEmailService() {
		return emailService;
	}
	public void setEmailService(String emailService) {
		this.emailService = emailService;
	}
	public String getAdresseService() {
		return adresseService;
	}
	public void setAdresseService(String adresseService) {
		this.adresseService = adresseService;
	}
	public String getNumTeleService() {
		return numTeleService;
	}
	public void setNumTeleService(String numTeleService) {
		this.numTeleService = numTeleService;
	}
	
	

}
