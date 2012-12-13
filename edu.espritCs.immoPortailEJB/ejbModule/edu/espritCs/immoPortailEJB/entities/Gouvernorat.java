package edu.espritCs.immoPortailEJB.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Gouvernorat
 * 
 */
@Entity
public class Gouvernorat implements Serializable {

	private String codeGouvernorat;
	private String nomGouvernorat;
	private List<Delegation> delegations;
	private static final long serialVersionUID = 1L;

	public Gouvernorat() {
		super();
	}

	@Id
	public String getCodeGouvernorat() {
		return this.codeGouvernorat;
	}

	public void setCodeGouvernorat(String codeGouvernorat) {
		this.codeGouvernorat = codeGouvernorat;
	}

	public String getNomGouvernorat() {
		return this.nomGouvernorat;
	}

	public void setNomGouvernorat(String nomGouvernorat) {
		this.nomGouvernorat = nomGouvernorat;
	}
    @OneToMany(mappedBy="gouvernorat",fetch=FetchType.EAGER,cascade={CascadeType.PERSIST,CascadeType.REMOVE})   
	public List<Delegation> getDelegations() {
		return delegations;
	}

	public void setDelegations(List<Delegation> delegations) {
		this.delegations = delegations;
	}

}
