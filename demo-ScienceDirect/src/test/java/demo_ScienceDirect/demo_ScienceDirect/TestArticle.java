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
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo_ScienceDirect.entity.Article;
import com.demo_ScienceDirect.services.ArticleService;
import com.demo_ScienceDirect.services.TestService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:Context.xml")

public class TestArticle {

	@Autowired
	ArticleService articleService;
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		articleService = null;
	}
	
	public static void main(String[] args)
	{
		
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(TestArticle.class);

	}
	
	@Test
	public void testAjouter()
	{
		Article article = new Article();
		article.setResume("article about health");
		articleService.ajouterArticle(article);
		assertTrue(article.getIdArticle()>0);
		System.out.println(article.getIdArticle());
		
	}
	
	@Test
	public void testGetOne()
	{
		Article article = new Article();
		article.setResume("Hello Me");
		article = articleService.ajouterArticle(article);
		assertEquals("Hello Me",articleService.getOne(article.getIdArticle()).get().getResume());
	}
	
	@Test
	public void testSupprimer()
	{
		Article article = new Article();
		article =articleService.ajouterArticle(article);
		articleService.supprimerArticle(article.getIdArticle());
		Optional<Article>article2 = articleService.getOne(article.getIdArticle());
		assertFalse(article2.isPresent());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
