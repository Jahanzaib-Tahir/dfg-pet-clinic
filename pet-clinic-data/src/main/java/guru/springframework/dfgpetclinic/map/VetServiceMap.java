package guru.springframework.dfgpetclinic.map;

import guru.springframework.dfgpetclinic.model.Vet;
import guru.springframework.dfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
