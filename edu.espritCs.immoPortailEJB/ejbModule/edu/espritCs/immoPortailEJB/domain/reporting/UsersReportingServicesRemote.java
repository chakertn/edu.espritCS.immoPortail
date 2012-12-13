package edu.espritCs.immoPortailEJB.domain.reporting;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCs.immoPortailEJB.entities.User;



@Remote
public interface UsersReportingServicesRemote {
	public List<User> getAllUsers();
}
