package org.RestServices;

import java.util.List;

import org.Metier.CompteUserMetier;
import org.entities.CompteUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class CompteUserRestService {
	
	@Autowired
	private CompteUserMetier compteUserMetier;

	@RequestMapping(value="/comptes", method=RequestMethod.POST)
//	@CrossOrigin("http://localhost:4200")
	@ResponseBody
	public CompteUser saveCompteUser(CompteUser cu) {
		return compteUserMetier.saveCompteUser(cu);
	}

	@RequestMapping(value="/comptes", method=RequestMethod.GET)
	//@CrossOrigin("http://localhost:4200")
	public List<CompteUser> listCompteUsers() {
		return compteUserMetier.listCompteUsers();
	}

	@RequestMapping(value="/comptes/{cin}", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public CompteUser getCompteUserByCode(@PathVariable String cin) {
		return compteUserMetier.getCompteUserByCode(cin);
	}
	
	

}
