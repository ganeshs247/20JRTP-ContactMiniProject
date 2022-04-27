package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Model.Contact;
import in.ashokit.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactrepo;

	@Override
	public Contact addcontact(Contact contact) {

		log.info("The AddContact ServiceIMPL");
		
		Contact contactinfo = contactrepo.save(contact);
		
		if (contactinfo != null) {
			return contactinfo;

		} else {
			return new Contact();
		}

		
	}

	@Override
	public List<Contact> findallcontact() {
		// TODO Auto-generated method stub
		
		log.info("The GetContact ServiceIMPL");
		
		List<Contact> conlist = (List<Contact>) contactrepo.findAll();
		
		return conlist;
		
//		if (conlist!=null) {
//			
//			return conlist; 
//			
//		} else {
//			
//			return conlist;
//
//		}
//		
		
	}

}
