package org.RestServices;

import java.util.List;


import org.Metier.ReclamationMetier;
import org.entities.Reclamation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReclamationRestService {
	
	@Autowired
	private ReclamationMetier reclamationMetier;

	@RequestMapping(value="/reclamations", method=RequestMethod.POST)
	@ResponseBody
	public Reclamation saveReclamation(@RequestBody Reclamation r) {
		return reclamationMetier.saveReclamation(r);
	}
	
	@RequestMapping(value="/reclamations", method=RequestMethod.GET)
	public List<Reclamation> listReclamations() {
		return reclamationMetier.listReclamations();
	}

	@RequestMapping(value="/reclamations/{nomrec}", method=RequestMethod.GET)
	public Reclamation getReclamationByCode(@PathVariable String nomrec) {
		return reclamationMetier.getReclamationByCode(nomrec);
	}

}