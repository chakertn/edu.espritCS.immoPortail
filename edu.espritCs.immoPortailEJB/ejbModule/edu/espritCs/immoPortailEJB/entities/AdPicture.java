package edu.espritCs.immoPortailEJB.entities;

import edu.espritCs.immoPortailEJB.entities.Annonce;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AdPicture
 *
 */
@Entity

public class AdPicture implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPicture;
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column(length=1)
	private byte[] picture;
	@ManyToOne
	private Annonce annonce;   
	
	private static final long serialVersionUID = 1L;

	public AdPicture() {
		super();
	}   
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}   
	public Annonce getAnnonce() {
		return this.annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}   
	public int getIdPicture() {
		return this.idPicture;
	}

	public void setIdPicture(int idPicture) {
		this.idPicture = idPicture;
	}
   
}
