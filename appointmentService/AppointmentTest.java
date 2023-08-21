package appointmentService;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;

/*
 * 
 * 	Id test is not needed as it is in BaseObjectTest.java
 * 
 */
public class AppointmentTest {
	@Test
	public void testAppointmentDateCantBeBeforeToday() throws Throwable {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Appointment appointmentError = new Appointment("0", formatter.parse("26-09-2000"), "Valid Description");
		Appointment appointmentValid = new Appointment("0", formatter.parse("26-09-2030"), "Valid Description");
		assertEquals(appointmentError.getErrors().getAppointmentDateInvalid(), true);
		assertEquals(appointmentValid.getErrors().getAppointmentDateInvalid(), false);
	}
	
	@Test
	public void testAppointmentDescriptionLength() throws Throwable {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Appointment appointmentError = new Appointment("0", formatter.parse("26-09-2030"), "Valid Description");
		Appointment appointmentValid = new Appointment("0", formatter.parse("26-09-2030"), new String(new char[51]).replace('\0', ' '));
		assertEquals(appointmentError.getErrors().getAppointmentDescriptionTooLong(), true);
		assertEquals(appointmentValid.getErrors().getAppointmentDescriptionTooLong(), false);
	}
}
