package baseClass;

import java.lang.reflect.Field;

public abstract class BaseErrors {
	protected Boolean idTooLong = false;

	public Boolean getIdTooLong() {
		return this.idTooLong;
	}

	public void setIdTooLong(Boolean idTooLong) {
		this.idTooLong = idTooLong;
		
	}
	public Boolean hasErrors() {
		for (Field f : this.getClass().getDeclaredFields()) {
			try {
				if (f.getBoolean(this) == true) return true;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				return true;
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				return true;
			}
		}
		return false;
	}
}
