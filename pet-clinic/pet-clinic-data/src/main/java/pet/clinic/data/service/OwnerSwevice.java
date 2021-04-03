package pet.clinic.data.service;

import java.util.Set;

import pet.clinic.data.model.Owner;

public interface OwnerSwevice {
	
	Owner findByLastName(String lastName);
	
	Owner findById(String Id);
	
	Owner save(Owner owner);
	
	Set<Owner>  findAll();
	
	

}
