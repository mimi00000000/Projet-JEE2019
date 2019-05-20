package org.RestServices;

import java.util.Date;

import org.Metier.CompteUserMetier;
import org.Metier.CompteVerificationMetier;
import org.Metier.PersonneMetier;
import org.entities.CompteUser;
import org.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class LoginResgisterRestServices {
	
	@Autowired
	private CompteUserMetier compteUserMetier;
	
	@Autowired
	private CompteVerificationMetier compteVerificationMetier;
	
	@Autowired
	private PersonneMetier personneMetier;
	
	@RequestMapping(value="/login{cin, motdepasse}", method=RequestMethod.GET)
	@ResponseBody
	@CrossOrigin("http://localhost:4200")
	public Personne login(@PathVariable String cin,@PathVariable String motdepasse) {
		if(compteUserMetier.getCompteUserByCode(cin) != null) {
			CompteUser compteuser = compteUserMetier.getCompteUserByCode(cin);
			if(compteuser.getMotdepasseU().equals(motdepasse)) {
				return personneMetier.getPersonneByCode(cin);
			}
		}
		return null;
	}
	@RequestMapping(value="/signup{cin, motdepasse, nom, prenom, email, adresse, dateNaissance, numTele, sexe, ville}", method=RequestMethod.GET)
	@ResponseBody
	@CrossOrigin("http://localhost:4200")
	public Personne signup(@PathVariable String cin,@PathVariable String motdepasse) {
		if(compteUserMetier.getCompteUserByCode(cin) != null) {
			CompteUser compteuser = compteUserMetier.getCompteUserByCode(cin);
			if(compteuser.getMotdepasseU().equals(motdepasse)) {
				return personneMetier.getPersonneByCode(cin);
			}
		}
		return null;
	}
}
