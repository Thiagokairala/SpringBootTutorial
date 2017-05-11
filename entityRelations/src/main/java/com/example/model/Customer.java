package com.example.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Customer extends Person implements Serializable {

	private static final long serialVersionUID = 5745065901895074128L;

	@OneToMany(mappedBy = "customer")
	private List<WorkingSet> workingSets;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "personalTrainerId")
	private PersonalTrainer personalTrainer;

	@OneToMany
	public List<WorkingSet> getWorkingSets() {
		return workingSets;
	}

	public void setWorkingSets(List<WorkingSet> workingSets) {
		this.workingSets = workingSets;
	}

}
