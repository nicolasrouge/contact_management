package service;

import java.util.List;

import org.lip6.struts.domain.Contact;
import org.lip6.struts.domain.PhoneNumber;

public interface IContactService {

	public boolean createContact(String firstName, String lastName, String email, String phonenumber, String street, String city, String zip, String country) throws Exception;
	
	public List<Contact> getListContact();
	
	public Contact getContact(long id);
	
	public List<PhoneNumber> getPhones(long id);
	 
	public String updateContact(Contact contact) throws Exception;
	
	public Contact displayContact(int idcontact);
	
	public int deleteContact(int id) throws Exception;
	
	public List<Contact> searchContact(String keyword);
}
