package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.Model.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer>{

}
