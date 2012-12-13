package edu.espritCs.immoPortailEJB.domain.reporting;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.immoPortailEJB.entities.User;

/**
 * Session Bean implementation class UsersReportingServices
 */
@Stateless
@LocalBean
public class UsersReportingServices implements UsersReportingServicesRemote, UsersReportingServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;
	/**
     * Default constructor. 
     */
    public UsersReportingServices() {
        // TODO Auto-generated constructor stub
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		return entityManager.createQuery("select u from User u")
				.getResultList();
	}

}
