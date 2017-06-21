package com.example.chhaichivon.crud_retrofit.models;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chhaichivon on 6/21/17.
 */

public class Category implements Serializable {

	private Long id;
	private String name;
	private String description;
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
