package testNG;



import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class AssersionExample {

	String name="Thenna";
	public void checkEqual() {
		Assert.assertNotEquals(name, "thenna");
	}
	
			
}
