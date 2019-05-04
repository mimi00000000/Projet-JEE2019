package org.Metier;

import java.util.List;

import org.entities.Historique;
import org.springframework.stereotype.Component;

@Component
public interface HistoriqueMetier {
	public Historique savePersonneHistorique(Historique h);
	public List<Historique> listHistoriques();
	public Historique getHistoriqueByCode(long idhistorique);
}
