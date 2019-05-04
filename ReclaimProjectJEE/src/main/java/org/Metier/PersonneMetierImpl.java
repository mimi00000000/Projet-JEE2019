package org.Metier;

import java.util.List;

import org.Metier.PersonneMetier;
import org.dao.PersonneRepository;
import org.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneMetierImpl implements PersonneMetier {
	
	@Autowired
	private PersonneRepository personneRepository;

	@Override
	public Personne savePersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public List<Personne> listPersonnes() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}
	
	@Override
	public Personne getPersonneByCode(String cin) {
		// TODO Auto-generated method stub
		return personneRepository.getOne(cin);		
	}

}
