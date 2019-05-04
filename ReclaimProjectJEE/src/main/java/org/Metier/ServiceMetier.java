package org.Metier;

import java.util.List;

import org.entities.ServiceR;
import org.springframework.stereotype.Component;

@Component
public interface ServiceMetier {
	public ServiceR saveService(ServiceR s);
	public List<ServiceR> listServices();
	public ServiceR getServiceByCode(long idService);
}
