package com.fnsystems.crownsecurity.persistence.recruitement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="application")
public class ApplicationEntity {

	private @Id @GeneratedValue Long id;

	private String name;
	
	private String email;
	
	private String number;
	
	private String workExperience;
	
	private String resumePath;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the workExperience
	 */
	public String getWorkExperience() {
		return workExperience;
	}

	/**
	 * @param workExperience the workExperience to set
	 */
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	/**
	 * @return the resumePath
	 */
	public String getResumePath() {
		return resumePath;
	}

	/**
	 * @param resumePath the resumePath to set
	 */
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
}
