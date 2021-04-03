package pet.clinic.data.service;

import java.util.Set;

import pet.clinic.data.model.Pet;

public interface PetSwevice {
	
	
	Pet findById(String Id);
	
	Pet save(Pet pet);
	
	Set<Pet>  findAll();
	
	

}
