package com.RH.ressourcesHumaines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RH.ressourcesHumaines.entities.Conge;
import com.RH.ressourcesHumaines.entities.Departement;
import com.RH.ressourcesHumaines.entities.Personnel;
import com.RH.ressourcesHumaines.entities.Pret;
import com.RH.ressourcesHumaines.repos.CongeRepository;
import com.RH.ressourcesHumaines.repos.PersonnelRepository;
import com.RH.ressourcesHumaines.repos.PretRepository;



@Service
public class PersonnelServiceImpl implements PersonnelService{
	
	@Autowired
	PersonnelRepository personnelRepository;
	
	@Autowired
	CongeRepository congeRepository;
	
	@Autowired
	PretRepository pretRepository;
	

	@Override
	public Personnel savePersonnel(Personnel p) {
		return personnelRepository.save(p);
	}

	@Override
	public Personnel updatePersonnel(Personnel p) {
		return personnelRepository.save(p);
	}

	@Override
	public void deletePersonnel(Personnel p) {
		personnelRepository.save(p);
	}

	
	@Override
	public void deletePersonnelById(Long id) {
		personnelRepository.deleteById(id);
	}

	@Override
	public Personnel getPersonnel(Long id) {
		return personnelRepository.findById(id).get();
	}

	@Override
	public List<Personnel> getAllPersonnels() {
		return personnelRepository.findAll();
	}

	@Override
	public List<Personnel> findByNomPersonnel(String nom) {
		return personnelRepository.findByNomPersonnel(nom) ;
	}
	

 	@Override
	public List<Personnel> findByDepartement(Departement departements) {
		return personnelRepository.findByDepartement(departements);
	}

	@Override
	public List<Personnel> findByDepartementIdDep(Long id) {
		return personnelRepository.findByDepartementIdDep(id);
	}

	@Override
	public List<Personnel> findByNomPersonnelContains(String nomPersonnel) {
		return personnelRepository.findByNomPersonnelContains(nomPersonnel);
	}

	
	
	
	@Override
	public Conge saveConge(Conge c) {
		return congeRepository.save(c);
	}

	@Override
	public Conge updateConge(Conge c) {
		return congeRepository.save(c);
	}

	@Override
	public void deleteConge(Conge c) {
		congeRepository.save(c); 
		
	}

	@Override
	public void deleteCongeById(Long id) {
		congeRepository.deleteById(id);
		
	}

	@Override
	public Conge getConge(Long id) {
		return congeRepository.findById(id).get();
	}

	@Override
	public List<Conge> getAllConges() {
		return congeRepository.findAll();
	}
 

	@Override
	public Conge getCongeById(Long id) {
		return congeRepository.findById(id).get();
	}
	
	
	
	
	@Override
	public Pret savePret(Pret p) {
		return pretRepository.save(p);
	}

	@Override
	public Pret updatePret(Pret p) {
		return pretRepository.save(p);
	}

	@Override
	public void deletePret(Pret p) {
		pretRepository.save(p); 
		
	}

	@Override
	public void deletePretById(Long id) {
		pretRepository.deleteById(id);
		
	}

	@Override
	public Pret getPret(Long id) {
		return pretRepository.findById(id).get();
	}

	@Override
	public List<Pret> getAllPrets() {
		return pretRepository.findAll();
	}

	
 
	
	
}
