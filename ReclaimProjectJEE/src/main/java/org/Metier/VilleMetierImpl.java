package org.Metier;

import java.util.List;

import org.dao.VilleRepository;
import org.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VilleMetierImpl implements VilleMetier{
	
	@Autowired
	private VilleRepository villeRepository;

	@Override
	public Ville saveVille(Ville v) {
		// TODO Auto-generated method stub
		return villeRepository.save(v);
	}

	@Override
	public List<Ville> listVilles() {
		// TODO Auto-generated method stub
		return villeRepository.findAll();
	}

}
