package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ashokit.Model.Contact;
import in.ashokit.service.ContactService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/ashokit")
@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	ContactService cs;
	
	@PostMapping("/contact")
	
	public ResponseEntity<String> addContact(@RequestBody Contact contact)
	
	
	{
		log.info("Add Contact Detail Controller");
		
		Contact con=cs.addcontact(contact);
		
		if(contact!=null)
		{
			return new ResponseEntity<String>("The Contact details saved successfully.", HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity<String>("The Contact details not saved.", HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts()
	{
		log.info("The Contact information Fetching");
		
		List<Contact> conlist=cs.findallcontact();
		
		if (conlist!=null) 
		{
			return new ResponseEntity<List<Contact>>(conlist, HttpStatus.OK);
		} 
		else 
		{
			return new ResponseEntity<List<Contact>>(conlist, HttpStatus.NOT_FOUND);
		}
	}
	
	
}
