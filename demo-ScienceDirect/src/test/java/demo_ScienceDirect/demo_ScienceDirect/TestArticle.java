package demo_ScienceDirect.demo_ScienceDirect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo_ScienceDirect.entity.Article;
import com.demo_ScienceDirect.services.ArticleService;
import com.demo_ScienceDirect.services.TestService;

public class TestArticle {

	ArticleService articleService;
	
	@Before
	public void setUp() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		articleService = context.getBean(ArticleService.class);
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
	
	
	public void testAjouter()
	{
		Article article = new Article();
		article.setResume("article about health");
		articleService.ajouterArticle(article);
		assertTrue(article.getIdArticle()>0);
		System.out.println(article.getIdArticle());
		
	}
	
	public void testGetOne()
	{
		Article article = new Article();
		article.setResume("Hello Me");
		article = articleService.ajouterArticle(article);
		assertEquals("Hello Me",articleService.getOne(1L).get().getResume());
	}
	
	@Test
	public void testSupprimer()
	{
		Article article = new Article();
		article =articleService.ajouterArticle(article);
		articleService.supprimerArticle(article.getIdArticle());
		article = articleService.getOne(article.getIdArticle());
		assertNull(article);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
