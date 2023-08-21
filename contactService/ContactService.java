package contactService;

import java.util.List;

import baseClass.BaseService;

public class ContactService extends BaseService<ContactErrors, Contact> {
	public List<Contact> getContacts() {
		return this.class_objects;
	}
}
