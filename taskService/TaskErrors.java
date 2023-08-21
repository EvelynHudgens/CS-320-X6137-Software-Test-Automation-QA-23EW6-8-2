package taskService;

import baseClass.BaseErrors;

public class TaskErrors extends BaseErrors {
	private Boolean nameTooLong = false;
	private Boolean descriptionTooLong = false;
	
	public Boolean getNameTooLong() {
		return nameTooLong;
	}
	public void setNameTooLong(Boolean nameTooLong) {
		this.nameTooLong = nameTooLong;
	}
	public Boolean getDescriptionTooLong() {
		return descriptionTooLong;
	}
	public void setDescriptionTooLong(Boolean descriptionTooLong) {
		this.descriptionTooLong = descriptionTooLong;
	}
}
