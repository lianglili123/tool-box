package org.eclilipse.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sample")
public class Sample {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Sample(){
		
	}
	private int id;
	private String name;

}
