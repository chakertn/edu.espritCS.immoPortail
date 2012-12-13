package edu.espritCs.immoPortailEJB.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TypeDuBien
 *
 */
@Entity

public class TypeDuBien implements Serializable {

	
	private String codeType;
	private String nomType;
	private static final long serialVersionUID = 1L;

	public TypeDuBien() {
		super();
	}   
	@Id 
	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}   
	public String getNomType() {
		return this.nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
   
}
