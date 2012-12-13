package edu.espritCs.immoPortailEJB.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Annonce
 * 
 */
@Entity
public class Annonce implements Serializable {

	@Id
	private int numAnnonce;
	private String titreAnnonce;
	@ManyToOne
	private Gouvernorat gouvernorat;
	@ManyToOne
	private Delegation delegation;
	@Column(length = 1000)
	private String texteAnnonce;
	@ManyToOne
	private User user;
	@Temporal(TemporalType.DATE)
	private Date dateAnnonce;
	private String typeAnnonce; // OFFRE | DEMANDE
	@ManyToOne
	private TypeDuBien typeDuBien;
	private double prix;
	@Temporal(TemporalType.DATE)
	private Date dateEcheance;
	private static final long serialVersionUID = 1L;
	private String typeOperation; // VENTE+ACHAT | LCATON
	@Column(name="etat",nullable=false,columnDefinition = "integer DEFAULT 1")
	private int etat; // 1:active 2:périmée
    @OneToMany(mappedBy="annonce",fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.REMOVE})   
	private List<AdPicture> pictures;
	

	public Annonce() {
		super();
	}

	public int getNumAnnonce() {
		return this.numAnnonce;
	}

	public void setNumAnnonce(int numAnnonce) {
		this.numAnnonce = numAnnonce;
	}

	public String getTitreAnnonce() {
		return this.titreAnnonce;
	}

	public void setTitreAnnonce(String titreAnnonce) {
		this.titreAnnonce = titreAnnonce;
	}

	public Date getDateAnnonce() {
		return this.dateAnnonce;
	}

	public void setDateAnnonce(Date dateAnnonce) {
		this.dateAnnonce = dateAnnonce;
	}

	public String getTypeAnnonce() {
		return this.typeAnnonce;
	}

	public void setTypeAnnonce(String typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}

	public TypeDuBien getTypeDuBien() {
		return this.typeDuBien;
	}

	public void setTypeDuBien(TypeDuBien typeDuBien) {
		this.typeDuBien = typeDuBien;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDateEcheance() {
		return this.dateEcheance;
	}

	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public String getTexteAnnonce() {
		return texteAnnonce;
	}

	public void setTexteAnnonce(String texteAnnonce) {
		this.texteAnnonce = texteAnnonce;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public Gouvernorat getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(Gouvernorat gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public Delegation getDelegation() {
		return delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}

}
