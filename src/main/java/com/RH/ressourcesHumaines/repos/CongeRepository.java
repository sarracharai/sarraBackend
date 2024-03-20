package com.RH.ressourcesHumaines.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.RH.ressourcesHumaines.entities.Conge;

@Repository
public interface CongeRepository extends JpaRepository <Conge , Long> {

}
