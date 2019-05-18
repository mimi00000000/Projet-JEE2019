package org.dao;

import org.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins ="http://localhost:4200")
public interface VilleRepository  extends JpaRepository<Ville, String>{
}
