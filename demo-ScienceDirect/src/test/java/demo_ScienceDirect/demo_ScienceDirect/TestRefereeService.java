package demo_ScienceDirect.demo_ScienceDirect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo_ScienceDirect.entity.Referee;
import com.demo_ScienceDirect.services.RefereeService;

public class TestRefereeService {
	

	RefereeService refereeService;
	
	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
			refereeService = context.getBean(RefereeService.class);
	}
	
	@After
	public void tearDown() throws Exception {
		refereeService = null;
	}
	
	public static void main(String[] args)
	{
		
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(TestRefereeService.class);

	}
	
	@Test
	public void testAjouter()
	{
		Referee referee = new Referee();
		referee.setNom("Ziad");
		referee.setPrenom("Mid");
refereeService.saveReferee(referee);
		assertTrue(referee.getIdReferee()>0);
		System.out.println(referee.getIdReferee());
		
	}
	
	@Test
	public void testGetOne()
	{
		Referee ref = new Referee();
		ref.setNom("Ziad");
		ref = refereeService.saveReferee(ref);
		assertEquals("Ziad",refereeService.getReferee(1L).get().getNom());
	}
	
	@Test
	public void testSupprimer()
	{
		Referee ref = new Referee();
		ref =refereeService.saveReferee(ref);
refereeService.deleteReferee(ref.getIdReferee());
		Optional<Referee>article2 = refereeService.getReferee(ref.getIdReferee());
		assertFalse(article2.isPresent());
	}
	
	
	
	
	
	
}
