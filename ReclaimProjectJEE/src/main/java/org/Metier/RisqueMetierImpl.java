package org.Metier;

import java.util.List;

import org.dao.RisqueRepository;
import org.entities.Risque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RisqueMetierImpl implements RisqueMetier{

	@Autowired
	private RisqueRepository  risqueRepository;
	
	@Override
	public Risque saveRisque(Risque risque) {
		// TODO Auto-generated method stub
		return risqueRepository.save(risque);
	}

	@Override
	public List<Risque> listRisques() {
		// TODO Auto-generated method stub
		return risqueRepository.findAll();
	}

	@Override
	public Risque getRisqueByCode(String nomRisque) {
		// TODO Auto-generated method stub
		return risqueRepository.getOne(nomRisque);
	}

}
