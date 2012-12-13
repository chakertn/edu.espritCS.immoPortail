package edu.espritCs.immoPortailEJB.domain.advertsManagement;

import javax.ejb.Remote;

import edu.espritCs.immoPortailEJB.entities.Annonce;

@Remote
public interface AdvertsManagementServicesRemote {
	public void createAnnonce(Annonce annonce);

	public Annonce getAnnonceByNum(int numAnnonce);
}
