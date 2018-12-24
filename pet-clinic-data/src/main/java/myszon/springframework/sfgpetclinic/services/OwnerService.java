package myszon.springframework.sfgpetclinic.services;

import myszon.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastName(String lastName);
}
