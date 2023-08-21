package appointmentService;

import java.util.List;

import baseClass.BaseService;

public class AppointmentService extends BaseService<AppointmentErrors, Appointment> {
	public List<Appointment> getAppointments() {
		return this.class_objects;
	}
}
