

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelClassesTestOne {
	/*@BeforeClass
	public void beforeClass() {
		long id = Thread.currentThread().getId();
		System.out.println("before ParallelClassesTestOne:....................................... " + id);
	}
	
	@AfterClass
	public void afterClass() {
		long id = Thread.currentThread().getId();
		System.out.println("after ParallelClassesTestOne:....................................... " + id);
	}*/

	@Test
	public void testMethodOne1() {
		long id = Thread.currentThread().getId();
		System.out.println("ParallelClassesTestOne testMethodOne1:....................................... " + id);
	}

	@Test
	public void testMethodOne2() {
		long id = Thread.currentThread().getId();
		System.out.println("ParallelClassesTestOne testMethodOne2:....................................... " + id);
	}

	
}