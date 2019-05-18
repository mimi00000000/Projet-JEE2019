package org.RestServices;

import java.util.List;

import org.Metier.PersonneMetier;
import org.entities.Personne;
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
public class PersonneRestService {
	 
	@Autowired
	private PersonneMetier personneMetier;

	@RequestMapping(value="/users", method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin("http://localhost:4200")
	public Personne savePersonne(@RequestBody Personne p) {
		return personneMetier.savePersonne(p);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public List<Personne> listPersonnes() {
		return personneMetier.listPersonnes();
	}

	@RequestMapping(value="/users/{cin}", method=RequestMethod.GET)
	@CrossOrigin(origins ="http://localhost:4200")
	public Personne getPersonne(@PathVariable String cin) {
		return personneMetier.getPersonneByCode(cin);
	}
}