package iso.edu.vn;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class testcaseTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	private testcase createTestSubject() {
		return new testcase();
	}


	@Test
	public void testDiv() throws Exception {
		testcase testSubject;
		int a = 4;
		int b = 5;
		int result;
		int expected = 9;

		// default test 1
		testSubject = createTestSubject();
		result = testSubject.div(a, b);
		assertEquals(expected, result);

	
		
	}

	@Test
	public void testAdd() throws Exception {
		testcase testSubject;
		int a = 4;
		int b = 5;
		int result;
		int expected = 1;

		// default test
		testSubject = createTestSubject();
		result = testSubject.add(a, b);
		assertEquals(expected, result);
	}

	
	@Test
	public void testSub() throws Exception {
		testcase testSubject;
		int a = 0;
		int b = 0;
		int result;
		int expected = 0;
		// default test
		testSubject = createTestSubject();
		result = testSubject.sub(a, b);
		assertEquals(expected, result);
	}

	
	@Test
	public void testMul() throws Exception {
		testcase testSubject;
		int a = 0;
		int b = 0;
		int result;
		int expected = 0;
		// default test
		testSubject = createTestSubject();
		result = testSubject.mul(a, b);
		assertEquals(expected, result);
	}

	
	@Test
	public void testDiv_1() throws Exception {
		testcase testSubject;
		int a = 0;
		int b = 0;
		int result;

		// default test 1
		testSubject = createTestSubject();
		result = testSubject.div(a, b);
		assertEquals(expected, result);
	}
}