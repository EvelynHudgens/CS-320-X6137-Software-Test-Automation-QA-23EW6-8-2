package contactService;

import baseClass.BaseErrors;

public class ContactErrors extends BaseErrors {
	private Boolean firstNameTooLong = false;
	private Boolean lastNameTooLong = false;
	private Boolean phoneTooLong = false;
	private Boolean addressTooLong = false;
	
	public Boolean getFirstNameTooLong() {
		return firstNameTooLong;
	}
	public void setFirstNameTooLong(Boolean firstNameTooLong) {
		this.firstNameTooLong = firstNameTooLong;
	}
	public Boolean getLastNameTooLong() {
		return lastNameTooLong;
	}
	public void setLastNameTooLong(Boolean lastNameTooLong) {
		this.lastNameTooLong = lastNameTooLong;
	}
	public Boolean getPhoneTooLong() {
		return phoneTooLong;
	}
	public void setPhoneTooLong(Boolean phoneTooLong) {
		this.phoneTooLong = phoneTooLong;
	}
	public Boolean getAddressTooLong() {
		return addressTooLong;
	}
	public void setAddressTooLong(Boolean addressTooLong) {
		this.addressTooLong = addressTooLong;
	}
}
