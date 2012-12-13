package edu.espritCs.immoPortailEJB.domain.advertsManagement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.immoPortailEJB.entities.Annonce;

/**
 * Session Bean implementation class AdvertsManagementServices
 */
@Stateless
@LocalBean
public class AdvertsManagementServices implements AdvertsManagementServicesRemote, AdvertsManagementServicesLocal {
	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public AdvertsManagementServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createAnnonce(Annonce annonce) {
		entityManager.persist(annonce);
		
	}

	@Override
	public Annonce getAnnonceByNum(int numAnnonce) {
		return entityManager.find(Annonce.class, numAnnonce);
	}

}
