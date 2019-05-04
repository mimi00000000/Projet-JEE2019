package org.Metier;

import java.util.List;

import org.dao.ReclamationPepository;
import org.entities.Reclamation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamationMetierImpl implements ReclamationMetier{

	@Autowired
	private ReclamationPepository reclamationRepository;
	
	@Override
	public Reclamation saveReclamation(Reclamation r) {
		// TODO Auto-generated method stub
		return reclamationRepository.save(r);
	}

	@Override
	public List<Reclamation> listReclamations() {
		// TODO Auto-generated method stub
		return reclamationRepository.findAll();
	}

	@Override
	public Reclamation getReclamationByCode(String nomrec) {
		// TODO Auto-generated method stub
		return reclamationRepository.getOne(nomrec);
	}
	
}
