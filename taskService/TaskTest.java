package taskService;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTest {
	
	@Test
	public void testTaskNameMaxLength() throws Throwable {
		String task_id = "";
		String nameError = "THIS_STRING_IS_TOO_LONG_AFAFSDFVSDVDSVSAVEFBEFBESBESFBSFEB";
		String nameValid = "";
		String description = "";
		
		Task taskError = new Task(task_id, nameError, description);
		Task taskValid = new Task(task_id, nameValid, description);
		
		assertEquals(taskError.getErrors().hasErrors(), true);
		assertEquals(taskValid.getErrors().hasErrors(), true);
	}
	
	@Test
	public void testTaskDescriptionMaxLength() throws Throwable {
		String task_id = "";
		String name = "";
		String descriptionError = new String(new char[51]).replace('\0', ' ');
		String descriptionValid = "";
		
		Task taskError = new Task(task_id, name, descriptionError);
		Task taskValid = new Task(task_id, name, descriptionValid);
		
		assertEquals(taskError.getErrors().hasErrors(), true);
		assertEquals(taskValid.getErrors().hasErrors(), true);
	}
}
