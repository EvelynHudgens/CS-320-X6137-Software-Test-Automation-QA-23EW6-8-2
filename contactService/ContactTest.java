package contactService;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ContactTest {
	@Test
	public void testFirstNameMaxLength() throws Throwable {
		String contact_id = "";
		String first_name_error = "THIS_FIRST_NAME_IS_TOO_LONG";
		String first_name_valid = "";
		String last_name = "";
		String phone = "";
		String address = "";
		
		Contact contactError = new Contact(contact_id, first_name_error, last_name, phone, address);
		Contact contactValid = new Contact(contact_id, first_name_valid, last_name, phone, address);
		
		assertEquals(contactError.getErrors().hasErrors(), true);
		assertEquals(contactValid.getErrors().hasErrors(), false);
	}
	
	@Test
	public void testLastNameMaxLength() throws Throwable {
		String contact_id = "";
		String first_name = "";
		String last_name_error = "THIS_LAST_NAME_IS_TOO_LONG";
		String last_name_valid = "";
		String phone = "";
		String address = "";
		
		Contact contactError = new Contact(contact_id, first_name, last_name_error, phone, address);
		Contact contactValid = new Contact(contact_id, first_name, last_name_valid, phone, address);
		
		assertEquals(contactError.getErrors().hasErrors(), true);
		assertEquals(contactValid.getErrors().hasErrors(), false);
	}
	
	@Test
	public void testPhoneMaxLength() throws Throwable {
		String contact_id = "";
		String first_name = "";
		String last_name = "";
		String phone_error = "THIS_PHONE_IS_TOO_LONG";
		String phone_valid = "";
		String address = "";
		
		Contact contactError = new Contact(contact_id, first_name, last_name, phone_error, address);
		Contact contactValid = new Contact(contact_id, first_name, last_name, phone_valid, address);
		
		assertEquals(contactError.getErrors().hasErrors(), true);
		assertEquals(contactValid.getErrors().hasErrors(), false);
	}
	
	@Test
	public void testAddressMaxLength() throws Throwable {
		String contact_id = "";
		String first_name = "";
		String last_name = "";
		String phone = "";
		String address_error = "THIS_ADDRESS_IS_TOO_LONG_BSBERBerbeRERBERBERBERBERBERBERBERBERBERBERBERERBERREER";
		String address_valid = "";
		
		Contact contactError = new Contact(contact_id, first_name, last_name, phone, address_error);
		Contact contactValid = new Contact(contact_id, first_name, last_name, phone, address_valid);
		
		assertEquals(contactError.getErrors().hasErrors(), true);
		assertEquals(contactValid.getErrors().hasErrors(), false);
	}
}
