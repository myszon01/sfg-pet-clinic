package myszon.springframework.sfgpetclinic.reprositories;

import myszon.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
    
}
