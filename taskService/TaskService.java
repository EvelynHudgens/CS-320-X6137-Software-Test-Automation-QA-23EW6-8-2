package taskService;

import java.util.List;

import baseClass.BaseService;

public class TaskService extends BaseService<TaskErrors, Task> {
	public List<Task> getTasks() {
		return this.class_objects;
	}
}
