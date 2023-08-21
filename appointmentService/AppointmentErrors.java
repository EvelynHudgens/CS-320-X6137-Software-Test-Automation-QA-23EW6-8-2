package appointmentService;
import baseClass.BaseErrors;
public class AppointmentErrors extends BaseErrors {
	private Boolean appointmentDateInvalid = false;
	private Boolean appointmentDescriptionTooLong = false;

	public Boolean getAppointmentDateInvalid() {
		return appointmentDateInvalid;
	}

	public void setAppointmentDateInvalid(Boolean appointmentDateTooLong) {
		this.appointmentDateInvalid = appointmentDateTooLong;
	}

	public Boolean getAppointmentDescriptionTooLong() {
		return appointmentDescriptionTooLong;
	}

	public void setAppointmentDescriptionTooLong(Boolean appointmentDescriptionTooLong) {
		this.appointmentDescriptionTooLong = appointmentDescriptionTooLong;
	}
	
}