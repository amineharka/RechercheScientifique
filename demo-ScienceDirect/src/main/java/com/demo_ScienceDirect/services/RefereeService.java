package com.demo_ScienceDirect.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo_ScienceDirect.dao.DaoReferee;
import com.demo_ScienceDirect.entity.Referee;



@Component()
public class RefereeService {
	
	@Autowired
	private DaoReferee daoReferee;
	
	public Optional<Referee> getReferee(final Long id) {
		Optional<Referee> ref = daoReferee.findById(id);
		return ref;
	}
	
	public Iterable<Referee> getReferees() {
		return daoReferee.findAll();
	}
	
	public void deleteReferee(final Long id) {
		daoReferee.deleteById(id);
	}
	
	public Referee saveReferee(Referee Referee) {
		Referee savedReferee = daoReferee.save(Referee);
		return savedReferee;
	}

}
