package pet.clinic.data.service;

import java.util.Set;

import pet.clinic.data.model.Vet;

public interface VetSwevice extends CrudeService<Vet, Long>{
	
	
	Vet findById(String Id);
	
	Vet save(Vet Vet);
	
	Set<Vet>  findAll();
	
	

}
