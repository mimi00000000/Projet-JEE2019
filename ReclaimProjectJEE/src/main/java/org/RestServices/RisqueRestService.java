package org.RestServices;

import java.util.List;

import org.Metier.RisqueMetier;
import org.entities.Risque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RisqueRestService {
	
	@Autowired
	private RisqueMetier  risqueMetier;
	
	@RequestMapping(value="/risques", method=RequestMethod.POST)
	@ResponseBody
	public Risque saveRisque(Risque risque) {
		return risqueMetier.saveRisque(risque);
	}

	@RequestMapping(value="/risques", method=RequestMethod.GET)
	public List<Risque> listRisques() {
		return risqueMetier.listRisques();
	}

	@RequestMapping(value="/risques/{nomRisque}", method=RequestMethod.GET)
	public Risque getRisqueByCode(@PathVariable String nomRisque) {
		return risqueMetier.getRisqueByCode(nomRisque);
	}

	
}
