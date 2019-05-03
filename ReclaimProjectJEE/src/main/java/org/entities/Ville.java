package org.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ville  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String ville;

	@OneToMany(mappedBy="ville")
	private Collection<Personne> personne;
	
	@OneToMany(mappedBy="ville")
	private Collection<Historique> historique;
	
	public Ville() {
		super();
	}

	public Ville(String ville) {
		super();
		this.ville = ville;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
