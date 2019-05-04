package org.Metier;

import java.util.List;
import org.entities.Ville;
import org.springframework.stereotype.Component;

@Component
public interface VilleMetier {
	public Ville saveVille(Ville v);
	public List<Ville> listVilles();
}
