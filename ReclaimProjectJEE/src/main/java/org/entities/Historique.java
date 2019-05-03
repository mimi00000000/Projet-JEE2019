package org.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Historique  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idhistorique;
	private float pourcentageRisque;
	private int nombreSignal;
	private int nombreConfirmation;	
	
	@ManyToOne
	@JoinColumn(name="ville_H_risque")
	private Ville ville;
	
	@ManyToOne
	@JoinColumn(name="Type_Risque_H")
	private Risque risque;
	
	public Historique() {
		super();
	}

	public Historique(Ville ville, float pourcentageRisque, int nombreSignal, int nombreConfirmation) {
		super();
		this.pourcentageRisque = pourcentageRisque;
		this.nombreSignal = nombreSignal;
		this.nombreConfirmation = nombreConfirmation;
		this.ville = ville;
	}
	
	public float getPourcentageRisque() {
		return pourcentageRisque;
	}
	public void setPourcentageRisque(float pourcentageRisque) {
		this.pourcentageRisque = pourcentageRisque;
	}
	public int getNombreSignal() {
		return nombreSignal;
	}
	public void setNombreSignal(int nombreSignal) {
		this.nombreSignal = nombreSignal;
	}
	public int getNombreConfirmation() {
		return nombreConfirmation;
	}
	public void setNombreConfirmation(int nombreConfirmation) {
		this.nombreConfirmation = nombreConfirmation;
	}

	public long getIdhistorique() {
		return idhistorique;
	}

	public void setIdhistorique(long idhistorique) {
		this.idhistorique = idhistorique;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	public Risque getRisque() {
		return risque;
	}

	public void setRisque(Risque risque) {
		this.risque = risque;
	}
	
	
}
