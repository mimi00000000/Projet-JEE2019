package org.Metier;

import java.util.List;

import org.entities.Personne;
import org.springframework.stereotype.Component;

@Component
public interface PersonneMetier {
	public Personne savePersonne(Personne p);
	public List<Personne> listPersonnes();
	public Personne getPersonneByCode(String nomReclamation);
}
