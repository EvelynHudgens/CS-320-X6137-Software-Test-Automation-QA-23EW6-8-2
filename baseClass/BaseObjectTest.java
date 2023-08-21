package baseClass;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BaseObjectTest {
	@Test
	public void testIdLength() throws Throwable {
		String id0 = "THIS_ID_IS_TO_LONG";
		BaseObject<BaseErrors> baseObjectError = new BaseObject<BaseErrors>(id0);
		
		String id1 = "CORRECT_ID";
		BaseObject<BaseErrors> baseObjectNoError = new BaseObject<BaseErrors>(id1);
		
		assertEquals(baseObjectError.getErrors().hasErrors(), true);
		assertEquals(baseObjectNoError.getErrors().hasErrors(), false);
	}
}
