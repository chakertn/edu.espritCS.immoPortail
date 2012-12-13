package edu.espritCs.immoPortailEJB.domain.basicListing;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;

/**
 * Session Bean implementation class managementReporting
 */
@Stateless
public class BasicListingServices implements BasicListingServicesRemote,
		BasicListingServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public BasicListingServices() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Gouvernorat> getAllGouvernorats() {
		return entityManager.createQuery("select g from Gouvernorat g")
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Delegation> getAllDelegationsByGouvernorats(
			String codeGouvernorat) {
		Query query = entityManager
				.createQuery("select d from Delegation d where d.gouvernorat.codeGouvernorat=:codeGouvernorat");
		query.setParameter("codeGouvernorat", codeGouvernorat);

		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TypeDuBien> getAllTypeDuBien() {
		return entityManager.createQuery("select t from TypeDuBien t")
				.getResultList();
	}

}
