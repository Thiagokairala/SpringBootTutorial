package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Exercise implements Serializable {

	private static final long serialVersionUID = 7959388577517597685L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	private String name;

	@NotNull
	private String identifeir;

	@Enumerated(EnumType.STRING)
	private MuscularGroupType muscularGroupType;

	private String description;

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

	public String getIdentifeir() {
		return identifeir;
	}

	public void setIdentifeir(String identifeir) {
		this.identifeir = identifeir;
	}

	public MuscularGroupType getMuscularGroupType() {
		return muscularGroupType;
	}

	public void setMuscularGroupType(MuscularGroupType muscularGroupType) {
		this.muscularGroupType = muscularGroupType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
