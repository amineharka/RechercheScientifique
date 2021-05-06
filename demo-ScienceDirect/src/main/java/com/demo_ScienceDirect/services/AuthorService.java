package com.demo_ScienceDirect.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo_ScienceDirect.dao.DaoAuthor;
import com.demo_ScienceDirect.entity.Author;

@Component
public class AuthorService {
	
	@Autowired
	private DaoAuthor daoAuthor ;
	
	
	public void addAuthor(Author author)
	{
		daoAuthor.save(author);
	}

}
