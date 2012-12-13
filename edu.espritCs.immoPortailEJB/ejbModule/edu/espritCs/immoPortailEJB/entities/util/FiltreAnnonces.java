package edu.espritCs.immoPortailEJB.entities.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;
import edu.espritCs.immoPortailEJB.entities.User;

public class FiltreAnnonces {
	private String titreAnnonce;
	private String texteAnnonce;
	private String gouvernorat;
	private String delegation;
	private User user;
	private Date dateAnnonceMin;
	private Date dateAnnonceMax;
	private String typeAnnonce; // OFFRE | DEMANDE
	private TypeDuBien typeDuBien;
	private double prixMin;
	private double prixMax;
	private Date dateEcheance;
	private String typeOperation; // VENTE+ACHAT | LCATON
	private int etat;// 1:active 2:périmée  3:all
	
	public FiltreAnnonces() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		this.titreAnnonce = null;
		this.texteAnnonce = null;
		this.gouvernorat = null;
		this.delegation = null;
		this.user = null;
		try {
			this.dateAnnonceMin = sdf.parse("01/01/2000");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			this.dateAnnonceMax = sdf.parse("31/12/2050");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.prixMin = 0;
		this.prixMax = 2147483647; //valeur max d'un double
		this.dateEcheance = null;
		this.typeOperation = null;
		this.typeAnnonce = null;
		this.typeDuBien = null;
		this.etat = 1;
	}
	public String getTitreAnnonce() {
		return titreAnnonce;
	}
	public void setTitreAnnonce(String titreAnnonce) {
		this.titreAnnonce = titreAnnonce;
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
	public Date getDateAnnonceMin() {
		return dateAnnonceMin;
	}
	public void setDateAnnonceMin(Date dateAnnonceMin) {
		this.dateAnnonceMin = dateAnnonceMin;
	}
	public Date getDateAnnonceMax() {
		return dateAnnonceMax;
	}
	public void setDateAnnonceMax(Date dateAnnonceMax) {
		this.dateAnnonceMax = dateAnnonceMax;
	}
	public String getTypeAnnonce() {
		return typeAnnonce;
	}
	public void setTypeAnnonce(String typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}
	public TypeDuBien getTypeDuBien() {
		return typeDuBien;
	}
	public void setTypeDuBien(TypeDuBien typeDuBien) {
		this.typeDuBien = typeDuBien;
	}
	public double getPrixMin() {
		return prixMin;
	}
	public void setPrixMin(double prixMin) {
		this.prixMin = prixMin;
	}
	public double getPrixMax() {
		return prixMax;
	}
	public void setPrixMax(double prixMax) {
		this.prixMax = prixMax;
	}
	public Date getDateEcheance() {
		return dateEcheance;
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
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getDelegation() {
		return delegation;
	}
	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}




}
