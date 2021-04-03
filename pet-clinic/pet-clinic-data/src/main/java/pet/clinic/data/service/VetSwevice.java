package pet.clinic.data.service;

import java.util.Set;

import pet.clinic.data.model.Vet;

public interface VetSwevice {
	
	
	Vet findById(String Id);
	
	Vet save(Vet Vet);
	
	Set<Vet>  findAll();
	
	

}
