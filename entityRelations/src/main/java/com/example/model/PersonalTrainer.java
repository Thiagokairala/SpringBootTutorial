package com.example.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class PersonalTrainer extends Person implements Serializable {

	private static final long serialVersionUID = 4784764958137381399L;

	@NotNull
	private String contractNumber;

	@OneToMany(mappedBy="personalTrainer")
	private List<Customer> customers;

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
