package org.RestServices;

import java.util.List;
import org.Metier.VilleMetier;
import org.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VilleRestService {
	
	@Autowired
	private VilleMetier villeMetier;
	
	@RequestMapping(value="/villes", method=RequestMethod.POST)
	@ResponseBody
	public Ville saveVille(@RequestBody Ville v) {
		return villeMetier.saveVille(v);
	}
	
	@RequestMapping(value="/villes", method=RequestMethod.GET)
	public List<Ville> listVilles() {
		return villeMetier.listVilles();
	}

}