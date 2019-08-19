package guru.springframework.dfgpetclinic.services;

import guru.springframework.dfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findByLastName(String lastname);
    Vet findById(Long id);
    Vet save(Vet owner);

    Set<Vet> findAll();


}



