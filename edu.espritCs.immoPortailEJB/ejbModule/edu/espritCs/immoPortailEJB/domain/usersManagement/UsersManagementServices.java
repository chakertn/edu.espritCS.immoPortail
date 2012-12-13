package edu.espritCs.immoPortailEJB.domain.usersManagement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.immoPortailEJB.entities.User;

/**
 * Session Bean implementation class UsersManagementServices
 */
@Stateless
@LocalBean
public class UsersManagementServices implements UsersManagementServicesRemote, UsersManagementServicesLocal {
	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public UsersManagementServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createUser(User user) {
		entityManager.persist(user);	
		
	}

	@Override
	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public User getUserByLogin(String login) {
		return entityManager.find(User.class, login);
	}

}
