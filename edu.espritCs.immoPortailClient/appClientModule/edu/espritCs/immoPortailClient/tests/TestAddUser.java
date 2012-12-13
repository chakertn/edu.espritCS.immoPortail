package edu.espritCs.immoPortailClient.tests;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.espritCs.immoPortailEJB.domain.usersManagement.UsersManagementServicesRemote;
import edu.espritCs.immoPortailEJB.entities.User;

public class TestAddUser {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UsersManagementServicesRemote usersManagementServicesRemote = (UsersManagementServicesRemote) context
					.lookup("edu.espritCs.immoPortail/edu.espritCs.immoPortailEJB/UsersManagementServices!edu.espritCs.immoPortailEJB.domain.usersManagement.UsersManagementServicesRemote");

			User user = new User();

			user.setFirstName("chaker");
			user.setLastName("tahri");
			user.setLogin("admin");
			user.setPassword("admin");
			user.setTypeUser(1); // 1:admin
			user.setEmail("chaker.tahri@gmail.com");
			user.setTelephone("99 999 999");
			user.setDateAdhesion(new Date());
			usersManagementServicesRemote.createUser(user);

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
