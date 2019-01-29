package myszon.springframework.sfgpetclinic.reprositories;

import myszon.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitsRepository extends CrudRepository<Visit, Long> {
}
