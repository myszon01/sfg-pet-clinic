package myszon.springframework.sfgpetclinic.services.map;

import myszon.springframework.sfgpetclinic.model.Speciality;
import myszon.springframework.sfgpetclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

}
