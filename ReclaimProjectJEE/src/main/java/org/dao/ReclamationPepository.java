package org.dao;

import org.entities.Reclamation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationPepository  extends JpaRepository<Reclamation, String>{

}
