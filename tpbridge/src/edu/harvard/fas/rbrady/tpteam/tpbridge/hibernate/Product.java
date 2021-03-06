package edu.harvard.fas.rbrady.tpteam.tpbridge.hibernate;

// Generated Nov 10, 2006 5:22:58 PM by Hibernate Tools 3.2.0.beta8

import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	// Fields    

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private String description;

	private Set<Project> projects = new HashSet<Project>(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(int id) {
		this.id = id;
	}

	/** full constructor */
	public Product(int id, String name, String description,
			Set<Project> projects) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.projects = projects;
	}

	// Property accessors
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

}
