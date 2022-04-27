package in.ashokit.service;

import java.util.List;

import in.ashokit.Model.Contact;

public interface ContactService {

	public Contact addcontact(Contact contact);

	public List<Contact> findallcontact();

}
