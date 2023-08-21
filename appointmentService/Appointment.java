package appointmentService;

import java.util.Date;
import baseClass.BaseObject;

public class Appointment extends BaseObject<AppointmentErrors> {
	private Date appointment_date;
	private String appointment_description;
	
	public Date getAppointmentDate() {
		return this.appointment_date;
	}
	public Boolean setAppointmentDate(Date date) {
		if (date.before(new Date())) return false;
		this.appointment_date = date;
		return true;
	}
	
	public String getAppointmentDescription() {
		return this.appointment_description;
	}
	public Boolean setAppointmentDescription(String description) {
		if (description.length() > 50) return false;
		this.appointment_description = description;
		return true;
	}
	
	public Appointment(String id, Date appointment_date, String appointment_description) {
		super(id);
		if (!this.setAppointmentDate(appointment_date)) this.errors.setAppointmentDateInvalid(true);
		if (!this.setAppointmentDescription(appointment_description)) this.errors.setAppointmentDescriptionTooLong(true);
	}
}
