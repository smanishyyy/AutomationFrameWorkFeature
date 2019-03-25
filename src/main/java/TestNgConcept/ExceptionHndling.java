package TestNgConcept;

import org.testng.annotations.Test;

public class ExceptionHndling {

	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
}
