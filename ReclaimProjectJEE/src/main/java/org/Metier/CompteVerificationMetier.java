package org.Metier;

import java.util.List;

import org.entities.CompteVerification;
import org.springframework.stereotype.Component;

@Component
public interface CompteVerificationMetier {
	public CompteVerification saveCompteVerifications(CompteVerification cv);
	public List<CompteVerification> listCompteVerifications();
	public CompteVerification getCompteVerificationByCode(String cin);
}
