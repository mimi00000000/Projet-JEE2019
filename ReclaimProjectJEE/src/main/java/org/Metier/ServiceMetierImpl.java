package org.Metier;

import java.util.List;

import org.dao.ServiceRepository;
import org.entities.ServiceR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceMetierImpl implements ServiceMetier{
	
	@Autowired
	private ServiceRepository serviceRepository;

	@Override
	public ServiceR saveService(ServiceR s) {
		// TODO Auto-generated method stub
		return serviceRepository.save(s);
	}

	@Override
	public List<ServiceR> listServices() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll();
	}

	@Override
	public ServiceR getServiceByCode(long idService) {
		// TODO Auto-generated method stub
		return serviceRepository.getOne(idService);
	}

}
