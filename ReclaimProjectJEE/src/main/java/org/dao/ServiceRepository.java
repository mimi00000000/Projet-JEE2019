package org.dao;

import org.entities.ServiceR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins ="http://localhost:4200")
public interface ServiceRepository  extends JpaRepository<ServiceR, Long>{
}
