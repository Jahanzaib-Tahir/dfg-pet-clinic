package guru.springframework.dfgpetclinic.services;

import guru.springframework.dfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByLastName(String lastname);
    Pet findById(Long id);
    Pet save(Pet owner);

    Set<Pet> findAll();


}
