package baseClass;

import java.util.Date;

public class BaseObject<T extends BaseErrors> {
	protected String id;
	protected Date created_at;
	protected Date updated_at;
	protected T errors;
	
	public Date getCreatedAt() {
		return this.created_at;
	}
	public void setCreatedAt(Date date) {
		this.created_at = date;
	}
	public Date getUpdatedAt() {
		return this.updated_at;
	}
	public void setUpdatedAt(Date date) {
		this.updated_at = date;
	}
	public String getId() {
		return this.id;
	}
	public Boolean setId(String id) {
		if (id.length() > 10) return false;
		this.id = id;
		return true;
	}
	public T getErrors() {
		return this.errors;
	}
	public void setErrors(T errors) {
		this.errors = errors;
	}
	
	public BaseObject(String id) {
		if (!this.setId(id)) this.errors.setIdTooLong(true);
	}
}
