package guru.springframework.dfgpetclinic.map;

import guru.springframework.dfgpetclinic.model.Pet;
import guru.springframework.dfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
       deleteById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

}
