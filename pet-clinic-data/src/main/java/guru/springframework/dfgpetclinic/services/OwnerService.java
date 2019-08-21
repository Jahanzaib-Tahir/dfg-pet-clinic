package guru.springframework.dfgpetclinic.services;

import guru.springframework.dfgpetclinic.model.Owner;



public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastname);

}
