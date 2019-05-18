package org.RestServices;

import java.util.List;

import org.Metier.CompteVerificationMetier;
import org.entities.CompteVerification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class CompteVerificationRestService {

	@Autowired
	private CompteVerificationMetier compteVerificationMetier;
	
	@RequestMapping(value="/comptesVerification", method=RequestMethod.POST)
	@CrossOrigin("http://localhost:4200")
	@ResponseBody
	public CompteVerification saveCompteVerifications(@RequestBody CompteVerification cv) {
		return compteVerificationMetier.saveCompteVerifications(cv);
	}
	
	@RequestMapping(value="/comptesVerification", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public List<CompteVerification> listCompteVerifications() {
		return compteVerificationMetier.listCompteVerifications();
	}

	
	@RequestMapping(value="/comptesVerification/{cin}", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public CompteVerification getCompteVerificationByCode(@PathVariable String cin) {
		return compteVerificationMetier.getCompteVerificationByCode(cin);
	}
	
}
