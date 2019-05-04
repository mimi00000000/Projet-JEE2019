package org.Metier;

import java.util.List;

import org.entities.Reclamation;
import org.springframework.stereotype.Component;

@Component
public interface ReclamationMetier {
	public Reclamation saveReclamation(Reclamation r);
	public List<Reclamation> listReclamations();
	public Reclamation getReclamationByCode(String nomrec);
}
