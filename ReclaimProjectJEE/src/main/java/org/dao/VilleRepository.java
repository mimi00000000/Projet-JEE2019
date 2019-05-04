package org.dao;

import org.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleRepository  extends JpaRepository<Ville, String>{

}
