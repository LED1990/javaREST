package com.tutorialspoint;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
/*
 * @XmlRootElement - annotation which define class representation as XML 
 */
@XmlRootElement(name = "myData") 
public class Data implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String profession;

	public Data() {
	}

	public Data(int id, String name, String profession) {
		super();
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

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

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
