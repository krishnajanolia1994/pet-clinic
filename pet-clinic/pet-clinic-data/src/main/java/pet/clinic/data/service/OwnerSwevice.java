package pet.clinic.data.service;

import pet.clinic.data.model.Owner;

public interface OwnerSwevice extends CrudeService<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
}
