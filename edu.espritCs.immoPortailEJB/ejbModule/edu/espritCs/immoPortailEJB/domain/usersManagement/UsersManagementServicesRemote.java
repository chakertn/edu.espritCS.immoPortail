package edu.espritCs.immoPortailEJB.domain.usersManagement;

import javax.ejb.Remote;

import edu.espritCs.immoPortailEJB.entities.User;



@Remote
public interface UsersManagementServicesRemote {
	public void createUser(User user);
	public User getUserById(int id);
	public User getUserByLogin(String login);
}
