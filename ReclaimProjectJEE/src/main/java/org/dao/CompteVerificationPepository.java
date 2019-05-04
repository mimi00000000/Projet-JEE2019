package org.dao;

import org.entities.CompteVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteVerificationPepository extends JpaRepository<CompteVerification, String>{

}
