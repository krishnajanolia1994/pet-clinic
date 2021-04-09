package pet.clinic.data.service.map;

import java.util.Set;

import pet.clinic.data.model.Owner;
import pet.clinic.data.service.CrudeService;

public class OwnerServiceMap extends AbsractMapService<Owner, Long> implements CrudeService<Owner, Long>{

	
	@Override
	public Set<Owner> findAll(){
		return this.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return map.get(id);
		
	}
	
	@Override
	public Owner save(Long id, Owner object) {
		map.put(id, object);
		return object;
	}
	
	@Override
	public void deleteById(Long id) {
		map.remove(id);
	}
	
	@Override
	public void delete(Owner object) {
		map.entrySet().removeIf(entry-> entry.getValue().equals(object));
	}

	@Override
	public Owner save( Owner object) {
		
		return this.save(object);
	}

	
}
