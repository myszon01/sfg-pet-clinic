package myszon.springframework.sfgpetclinic.services.map;

import myszon.springframework.sfgpetclinic.model.Vet;
import myszon.springframework.sfgpetclinic.services.CRUDService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CRUDService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
