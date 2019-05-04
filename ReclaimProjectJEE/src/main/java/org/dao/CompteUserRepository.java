package org.dao;


import org.entities.CompteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteUserRepository extends JpaRepository<CompteUser, String> {

}
