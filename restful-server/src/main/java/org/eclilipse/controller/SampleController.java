package org.eclilipse.controller;

import org.eclilipse.entity.Sample;
import org.eclilipse.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@RequestMapping(value="/xml/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_XML_VALUE)
	Sample getXml(@PathVariable int id) {
		return sampleRepository.getOne(id);
	}
	
	@RequestMapping(value="/json/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	Sample getJson(@PathVariable int id) {
		return sampleRepository.getOne(id);
	}
	

}
