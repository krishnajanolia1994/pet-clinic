package pet.clinic.data.service;

import java.util.Set;

public interface CrudeService<T,ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void deleteById(ID object);

}
