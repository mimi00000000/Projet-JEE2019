package org.Metier;

import java.util.List;

import org.dao.CompteVerificationPepository;
import org.entities.CompteVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompteVerificationMetierImpl implements CompteVerificationMetier{
	
	@Autowired
	private CompteVerificationPepository compteVerificationRepository;

	@Override
	public CompteVerification saveCompteVerifications(CompteVerification cv) {
		// TODO Auto-generated method stub
		return compteVerificationRepository.save(cv);
	}

	@Override
	public List<CompteVerification> listCompteVerifications() {
		// TODO Auto-generated method stub
		return compteVerificationRepository.findAll();
	}

	@Override
	public CompteVerification getCompteVerificationByCode(String cin) {
		// TODO Auto-generated method stub
		return compteVerificationRepository.getOne(cin);
	}

}
