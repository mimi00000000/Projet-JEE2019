package org.RestServices;

import java.util.List;

import org.Metier.HistoriqueMetier;
import org.entities.Historique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class HistoriqueRestService {
	
	@Autowired
	private  HistoriqueMetier  historiqueMetier;

	@RequestMapping(value="/historiques", method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin("http://localhost:4200")
	public Historique savePersonneHistorique(Historique h) {
		return historiqueMetier.savePersonneHistorique(h);
	}

	@RequestMapping(value="/historiques", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public List<Historique> listHistoriques() {
		return historiqueMetier.listHistoriques();
	}

	@RequestMapping(value="/historiques/{idhistorique}", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public Historique getHistoriqueByCode(@PathVariable long idhistorique) {
		return historiqueMetier.getHistoriqueByCode(idhistorique);
	}
	
	

}
