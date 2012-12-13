package edu.espritCs.immoPortailEJB.domain.basicManagement;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;

/**
 * Session Bean implementation class ManagementServices
 */
@Stateless
public class ManagementServices implements ManagementServicesRemote,
		ManagementServicesLocal {
	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ManagementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createGouvernorat(Gouvernorat gouvernorat) {
		entityManager.persist(gouvernorat);

	}

	@Override
	public Gouvernorat getGouvernoratByCode(String code) {
		return entityManager.find(Gouvernorat.class, code);
	}

	@Override
	public void createDelegation(Delegation delegation) {
		entityManager.persist(delegation);
	}

	@Override
	public Delegation getDelegationByCode(String code) {
		return entityManager.find(Delegation.class, code);
	}

	@Override
	public TypeDuBien getTypeDuBienByCode(String code) {
		return entityManager.find(TypeDuBien.class, code);
	}

	@Override
	public void createTypeDuBien(TypeDuBien typeDuBien) {
		entityManager.persist(typeDuBien);		
	}

}
