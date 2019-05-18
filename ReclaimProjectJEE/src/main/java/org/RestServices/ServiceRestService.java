package org.RestServices;

import java.util.List;

import org.Metier.ServiceMetier;
import org.entities.ServiceR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
public class ServiceRestService {
	
	@Autowired
	private ServiceMetier serviceMetier;

	@RequestMapping(value="/services", method=RequestMethod.POST)
	@ResponseBody
	@CrossOrigin("http://localhost:4200")
	public ServiceR saveService(ServiceR s) {
		return serviceMetier.saveService(s);
	}

	@RequestMapping(value="/services", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public List<ServiceR> listServices() {
		return serviceMetier.listServices();
	}

	@RequestMapping(value="/services/{idService}", method=RequestMethod.GET)
	@CrossOrigin("http://localhost:4200")
	public ServiceR getServiceByCode(@PathVariable long idService) {
		return serviceMetier.getServiceByCode(idService);
	}
	
}
