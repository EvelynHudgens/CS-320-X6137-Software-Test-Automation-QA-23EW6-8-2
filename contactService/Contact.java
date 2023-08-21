package contactService;

import baseClass.BaseObject;

public class Contact extends BaseObject<ContactErrors> {
	private String first_name;
	private String last_name;
	private String phone;
	private String address;
	
	public String getFirstName() {
		return this.first_name;
	}
	public Boolean setFirstName(String first_name) {
		if (first_name.length() > 10) {
			return false;
		}
		this.first_name = first_name;
		return true;
	}
	
	public String getLastName() {
		return this.last_name;
	}
	public Boolean setLastName(String last_name) {
		if (last_name.length() > 10) {
			return false;
		}
		this.last_name = last_name;
		return true;
	}
	
	public String getPhone() {
		return this.phone;
	}
	public Boolean setPhone(String phone) {
		if (phone.length() > 10) {
			return false;
		}
		this.phone = phone;
		return true;
	}
	
	public String getAddress() {
		return this.address;
	}
	public Boolean setAddress(String address) {
		if (address.length() > 30) {
			return false;
		}
		this.address = address;
		return true;
	}
	
	public Contact(String id, String first_name, String last_name, String phone, String address) {
		super(id);
		if (!this.setPhone(phone)) this.getErrors().setPhoneTooLong(true);
		if (!this.setFirstName(first_name)) this.getErrors().setFirstNameTooLong(true);
		if (!this.setLastName(last_name)) this.getErrors().setLastNameTooLong(true);
		if (!this.setAddress(address)) this.getErrors().setAddressTooLong(true);
	}
}
