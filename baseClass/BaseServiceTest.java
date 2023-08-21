package baseClass;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestErrors extends BaseErrors {
	private Boolean testNotValid = false;

	public Boolean getTestNotValid() {
		return testNotValid;
	}

	public void setTestNotValid(Boolean testValid) {
		this.testNotValid = testValid;
	}
}
class TestObject extends BaseObject<TestErrors> {
	private String test = "";

	public String getTest() {
		return test;
	}

	public Boolean setTest(String test) {
		if (test.length() > 10) return false;
		this.test = test;
		return true;
	}
	
	public TestObject(String id, String test) {
		super(id);
		if (!this.setTest(test)) this.getErrors().setTestNotValid(true);
	}
}
class TestService extends BaseService<TestErrors, TestObject> {}
public class BaseServiceTest {
	
	private TestService generateService() {
		TestService service = new TestService();
		List<TestObject> objectList = new ArrayList<TestObject>();
		TestObject obj1 = new TestObject("0000000001", "test1");
		TestObject obj2 = new TestObject("0000000002", "test2");
		TestObject obj3 = new TestObject("0000000003", "test3");
		TestObject obj4 = new TestObject("0000000004", "test4");
		objectList.add(obj1);
		objectList.add(obj2);
		objectList.add(obj3);
		objectList.add(obj4);
		service.setClassObjects(objectList);
		return service;
	}
	@Test
	public void testGet() throws Throwable {
		TestService service = generateService();
		TestObject obj3 = service.get("0000000003");
		TestObject obj1 = service.get("0000000001");
		TestObject objNull = service.get("10");
		assertEquals(obj3.getTest(), "test3");
		assertEquals(obj3.getId(), "0000000003");
		assertEquals(obj1.getTest(), "test1");
		assertEquals(obj1.getId(), "0000000001");
		assertEquals(objNull, null);
	}
	@Test
	public void testPost() throws Throwable {
		TestService service = generateService();
		TestObject obj5 = new TestObject("placeholder", "test5");
		service.post(obj5);
		TestObject obj5Get = service.get("0000000005");
		assertEquals(obj5Get.getTest(), "test5");
		assertEquals(obj5Get.getId(), "0000000005");
	}
	
	@Test
	public void testDelete() throws Throwable {
		TestService service = generateService();
		TestObject deletedObject = service.delete("0000000001");
		TestObject shouldBeNull = service.get("0000000001");
		assertEquals(deletedObject.getId(), "0000000001");
		assertEquals(deletedObject.getTest(), "test1");
		assertEquals(shouldBeNull, null);
	}
	
	@Test
	public void testPatch() throws Throwable {
		TestService service = generateService();
		TestObject newObj1 = new TestObject("0000000001", "test1Updated");
		service.patch(newObj1);
		TestObject updatedObj1 = service.get("0000000001");
		assertEquals(updatedObj1.getTest(), "test1Updated");
	}
	
}
