package com.example.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class WorkingSet implements Serializable {

	private static final long serialVersionUID = 9078864293416892563L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	@ManyToMany
	@JoinTable
	private List<Exercise> exercises;

	@OneToOne
	private PersonalTrainer personalTrainer;

	@PrePersist
	protected void onCreate() {
		this.creationDate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public PersonalTrainer getPersonalTrainer() {
		return personalTrainer;
	}

	public void setPersonalTrainer(PersonalTrainer personalTrainer) {
		this.personalTrainer = personalTrainer;
	}

}
