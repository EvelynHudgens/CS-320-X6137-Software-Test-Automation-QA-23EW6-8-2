package baseClass;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("hiding")
public class BaseService<Error extends BaseErrors, ClassObject extends BaseObject<Error>> {
	protected List<ClassObject> class_objects = new ArrayList<ClassObject>();
	
	public ClassObject post(ClassObject class_object) {
		if (class_object.getErrors().hasErrors()) return null;
		class_object.setId(generateId());
		class_objects.add(class_object);
		return class_object;
	}
	
	public ClassObject patch(ClassObject class_object) {
		if (class_object.getErrors().hasErrors()) return null;
		int index = findItemIndex(class_object.getId());
		if (index == -1) return null;
		class_objects.set(index, class_object);
		return class_object;
	}
	
	public ClassObject delete(String id) {
		int index = findItemIndex(id);
		if (index == -1) return null;
		return class_objects.remove(index);
	}
	public ClassObject get(String id) {
		int index = findItemIndex(id);
		if (index == -1) return null;
		return class_objects.get(index);
	}
	
	private String generateId() {
		ClassObject lastItem = class_objects.get(class_objects.size() - 1);
		int newId = Integer.parseInt(lastItem.getId(), 16) + 1;
		String hexString = Integer.toHexString(newId);
		return String.format("%10x", hexString);
	}
	private int findItemIndex(String id) {
		for (int i = 0; i < class_objects.size(); i++) {
			if (id == class_objects.get(i).getId()) return i;
		}
		return -1;
	}
	
	public List<ClassObject> getClassObjects() {
		return this.class_objects;
	}
	public void setClassObjects(List<ClassObject> class_objects) {
		this.class_objects = class_objects;
	}
}
