package org.eclilipse.repository;

import org.eclilipse.entity.Sample;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {
	
	public Sample getOne(int id){
		return new Sample(id,"test"+id);
	}

}
