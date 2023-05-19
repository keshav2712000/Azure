package com.keshav.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keshav.App.Model.Watch;
@Repository
public interface AppRepository extends JpaRepository<Watch, Long> {

	
	public Watch findByCode(int code);

	

	

}
