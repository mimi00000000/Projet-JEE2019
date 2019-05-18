package org.RestServices;

import java.util.List;

import org.Metier.ServiceMetier;
import org.entities.ServiceR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRestService {
	
	@Autowired
	private ServiceMetier serviceMetier;

	@RequestMapping(value="/services", method=RequestMethod.POST)
	@ResponseBody
	public ServiceR saveService(ServiceR s) {
		return serviceMetier.saveService(s);
	}

	@RequestMapping(value="/services", method=RequestMethod.GET)
	public List<ServiceR> listServices() {
		return serviceMetier.listServices();
	}

	@RequestMapping(value="/services/{idService}", method=RequestMethod.GET)
	public ServiceR getServiceByCode(@PathVariable long idService) {
		return serviceMetier.getServiceByCode(idService);
	}
	
}
