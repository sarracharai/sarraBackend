package com.RH.ressourcesHumaines.service;

import java.util.List;

import com.RH.ressourcesHumaines.entities.Conge;
import com.RH.ressourcesHumaines.entities.Departement;
import com.RH.ressourcesHumaines.entities.Personnel;
import com.RH.ressourcesHumaines.entities.Pret;

public interface PersonnelService {

	Personnel savePersonnel(Personnel p);
	Personnel updatePersonnel(Personnel p);
	void deletePersonnel(Personnel p);
	void deletePersonnelById(Long id);
	Personnel getPersonnel(Long id);
	List<Personnel> getAllPersonnels();
	List<Personnel> findByNomPersonnel(String nom);
	List<Personnel> findByDepartementIdDep(Long id);
	List<Personnel> findByDepartement(Departement departement);
	List<Personnel> findByNomPersonnelContains(String nomPersonnel);
	
	Conge saveConge(Conge c);
	Conge updateConge(Conge c);
	void deleteConge(Conge c);
	void deleteCongeById(Long id);
	Conge getConge(Long id);
	List<Conge>getAllConges();
	Conge getCongeById(Long id);
	
	
	
	Pret savePret(Pret p);
	Pret updatePret(Pret p);
	void deletePret(Pret p);
	void deletePretById(Long id);
	Pret getPret(Long id);
	List<Pret>getAllPrets();
	
	
	
	
	
}
