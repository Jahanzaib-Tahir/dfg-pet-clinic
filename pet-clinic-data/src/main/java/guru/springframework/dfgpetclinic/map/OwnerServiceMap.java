package guru.springframework.dfgpetclinic.map;

import guru.springframework.dfgpetclinic.model.Owner;
import guru.springframework.dfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner,Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
    super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }
}
