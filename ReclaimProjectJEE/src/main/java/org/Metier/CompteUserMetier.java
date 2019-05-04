package org.Metier;

import java.util.List;

import org.entities.CompteUser;
import org.springframework.stereotype.Component;

@Component
public interface CompteUserMetier {
	public CompteUser saveCompteUser(CompteUser cu);
	public List<CompteUser> listCompteUsers();
	public CompteUser getCompteUserByCode(String cin);
}
