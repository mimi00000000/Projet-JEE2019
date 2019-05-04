package org.Metier;

import java.util.List;

import org.dao.HistoriqueRepository;
import org.entities.Historique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriqueMetierImpl implements HistoriqueMetier{
	
	@Autowired
	private HistoriqueRepository historiquenRepository;

	@Override
	public Historique savePersonneHistorique(Historique h) {
		// TODO Auto-generated method stub
		return historiquenRepository.save(h);
	}

	@Override
	public List<Historique> listHistoriques() {
		// TODO Auto-generated method stub
		return historiquenRepository.findAll();
	}

	@Override
	public Historique getHistoriqueByCode(long idhistorique) {
		// TODO Auto-generated method stub
		return historiquenRepository.getOne(idhistorique);
	}

}
