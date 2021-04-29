package demo_ScienceDirect.demo_ScienceDirect;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

import com.demo_ScienceDirect.services.TestService;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MyTest{
	
	TestService testService;
	
	@Before
	public void setUp() throws Exception {
		testService = new TestService();
	}
	
	@After
	public void tearDown() throws Exception {
		testService = null;
	}


	
	public static void main(String[] args)
	{
		
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(MyTest.class);

	}
	
	@Test
	public void testSomme()
	{
		assertEquals(7,testService.somme(4, 2));
	}
	@Test
	public void testSub()
	{
		assertEquals(2,testService.sub(4, 2));
	}
	
	
	}


