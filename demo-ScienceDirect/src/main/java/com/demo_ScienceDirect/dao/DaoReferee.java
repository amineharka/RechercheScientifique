package com.demo_ScienceDirect.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo_ScienceDirect.entity.Referee;


public interface DaoReferee extends JpaRepository<Referee, Long> {

}
