package edu.espritCs.immoPortailEJB.domain.reporting;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;

import edu.espritCs.immoPortailEJB.entities.Annonce;
import edu.espritCs.immoPortailEJB.entities.User;
import edu.espritCs.immoPortailEJB.entities.util.FiltreAnnonces;

/**
 * Session Bean implementation class AdvertsReportingServices
 */
@Stateless
@LocalBean
public class AdvertsReportingServices implements AdvertsReportingServicesRemote, AdvertsReportingServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;
	
    /**
     * Default constructor. 
     */
    public AdvertsReportingServices() {
        // TODO Auto-generated constructor stub
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Annonce> getAllAnnonces() {
		return entityManager.createQuery("select a from Annonce a").getResultList();
	}

	@Override
	public List<Annonce> getAllActiveAnnonces() {
		FiltreAnnonces filtre = new FiltreAnnonces();
		filtre.setEtat(1);
		return findListAnnoncesByFilter(filtre);
	}

	@Override
	public List<Annonce> getAllOffresActivesLocation() {
		FiltreAnnonces filtre = new FiltreAnnonces();
		filtre.setEtat(1);
		filtre.setTypeAnnonce("OFFRE");
		filtre.setTypeOperation("LOCATION");
		return findListAnnoncesByFilter(filtre);
	}

	@Override
	public List<Annonce> getAllOffresActivesVente() {
		FiltreAnnonces filtre = new FiltreAnnonces();
		filtre.setEtat(1);
		filtre.setTypeAnnonce("OFFRE");
		filtre.setTypeOperation("VENTE");
		return findListAnnoncesByFilter(filtre);
	}

	@Override
	public List<Annonce> getAllDemandesActivesLocation() {
		FiltreAnnonces filtre = new FiltreAnnonces();
		filtre.setEtat(1);
		filtre.setTypeAnnonce("DEMANDE");
		filtre.setTypeOperation("LOCATION");
		return findListAnnoncesByFilter(filtre);
	}

	@Override
	public List<Annonce> getAllDemandesActivesVente() {
		FiltreAnnonces filtre = new FiltreAnnonces();
		filtre.setEtat(1);
		filtre.setTypeAnnonce("DEMANDE");
		filtre.setTypeOperation("VENTE");
		return findListAnnoncesByFilter(filtre);
	}

	
	
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<Annonce> findListAnnoncesByFilter(FiltreAnnonces filter) {

		String req = "select a from Annonces a where a.prix<="+ filter.getPrixMax() + "and a.prix>=" + filter.getPrixMin() + 
					 " and a.dateAnnonce BETWEEN :startDate AND :endDate"/*
		
					 " and a.dateAnnonce >= to_date('" + filter.getDateAnnonceMin().getDate() + "/" + 
					 								filter.getDateAnnonceMin().getMonth() + "/" + 
					 								filter.getDateAnnonceMin().getYear() + "','DD/MM/RR')" +
					 " and a.dateAnnonce <= to_date('" + filter.getDateAnnonceMax().getDate() + "/" + 
					 								filter.getDateAnnonceMax().getMonth() + "/" + 
					 								filter.getDateAnnonceMax().getYear() + "','DD/MM/RR')"*/;
		
		
		
		/** Recherche par Gouvernorat */
		if (filter.getGouvernorat() != null) 
				req += " and a.gouvernorat.codeGouvernorat = '" + filter.getGouvernorat() + "'";


		/** Recherche par Delegation */
		if (filter.getDelegation() != null) 
				req += " and a.delegation.codeDelegation = '" + filter.getDelegation() + "'";


		/** Recherche par Etat de l'annonce */
		if (filter.getEtat() != 3) 						// 1:active 2:périmée  3:all
				req += " and a.etat = " + filter.getEtat();		


		/** Recherche par Type d'opération */
		if (filter.getTypeOperation() != null) 			// 'VENTE'   ou   'LOCATION'
				req += " and a.typeOperation = '" + filter.getTypeOperation() + "'";
		
		
		/** Recherche par Type de l'annonce */
		if (filter.getTypeAnnonce() != null)  			// 'DEMANDE'   ou   'OFFRE'
				req += " and a.typeAnnonce = '" + filter.getTypeAnnonce() + "'";
		

		/** Recherche par Titre */
		if (filter.getTitreAnnonce() != null)
				req += " and a.titreAnnonce like %'" + filter.getTitreAnnonce() + "'%";
		
	
		/** Recherche par Texte */
		if (filter.getTexteAnnonce() != null)
				req += " and a.texteAnnonce like %'" + filter.getTexteAnnonce() + "'%";
		
		/** Recherche par Type du bien */
		if (filter.getTypeDuBien() != null) 			
				req += " and a.typeDuBien = '" + filter.getTypeDuBien().getCodeType() + "'";	
		


		System.out.println("\nREQ findListAnnoncesByFilter --> " + req + "\n");		//pour débogage
		return entityManager.createQuery(req)
				.setParameter("startDate", filter.getDateAnnonceMin(), TemporalType.DATE)
				.setParameter("endDate", filter.getDateAnnonceMax(), TemporalType.DATE)
				.getResultList();

	}

	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Annonce> getAllAnnoncesByUser(User user) {
		return entityManager.createQuery("select a from Annonce a where a.User.idUser=" + user.getIdUser()).getResultList();
	}
	
	
}
