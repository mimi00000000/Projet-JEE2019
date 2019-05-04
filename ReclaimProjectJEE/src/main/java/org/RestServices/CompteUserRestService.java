package org.RestServices;

import java.util.List;

import org.Metier.CompteUserMetier;
import org.entities.CompteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteUserRestService {
	
	@Autowired(required=true)
	private CompteUserMetier compteUserMetier;

	@RequestMapping(value="/comptes", method=RequestMethod.POST)
	@ResponseBody
	public CompteUser saveCompteUser(CompteUser cu) {
		return compteUserMetier.saveCompteUser(cu);
	}

	@RequestMapping(value="/comptes", method=RequestMethod.GET)
	public List<CompteUser> listCompteUsers() {
		return compteUserMetier.listCompteUsers();
	}

	@RequestMapping(value="/comptes/{cin}", method=RequestMethod.GET)
	public CompteUser getCompteUserByCode(String cin) {
		return compteUserMetier.getCompteUserByCode(cin);
	}
	
	

}
