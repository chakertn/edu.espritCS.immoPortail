package edu.espritCs.immoPortailEJB.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Delegation
 * 
 */
@Entity
public class Delegation implements Serializable {

	private String codeDelegation;
	private String nomDelegation;
	private Gouvernorat gouvernorat;
	private static final long serialVersionUID = 1L;

	public Delegation() {
		super();
	}

	@Id
	public String getCodeDelegation() {
		return this.codeDelegation;
	}

	public void setCodeDelegation(String codeDelegation) {
		this.codeDelegation = codeDelegation;
	}

	public String getNomDelegation() {
		return this.nomDelegation;
	}

	public void setNomDelegation(String nomDelegation) {
		this.nomDelegation = nomDelegation;
	}

	@ManyToOne
	public Gouvernorat getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(Gouvernorat gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

}
