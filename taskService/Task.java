package taskService;

import baseClass.BaseObject;

public class Task extends BaseObject<TaskErrors> {
	private String name = "";
	private String description = "";
	
	
	public String getName() {
		return this.name;
	}
	public Boolean setName(String name) {
		if (name.length() > 20) return false;
		this.name = name;
		return true;
	}
	
	public String getDescription() {
		return this.description;
	}
	public Boolean setDescription(String description) {
		if (description.length() > 50) return false;
		this.description = description;
		return true;
	}
	
	public Task(String id, String name, String description) {
		super(id);
		if (!this.setName(name)) this.getErrors().setNameTooLong(true);
		if (!this.setDescription(description)) this.getErrors().setDescriptionTooLong(true);
	}
}
