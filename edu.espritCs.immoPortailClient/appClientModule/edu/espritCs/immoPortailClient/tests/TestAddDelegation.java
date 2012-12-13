package edu.espritCs.immoPortailClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.espritCs.immoPortailEJB.domain.basicManagement.ManagementServicesRemote;
import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;

public class TestAddDelegation {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ManagementServicesRemote managementServicesRemote = (ManagementServicesRemote)context
					.lookup("edu.espritCs.immoPortail/edu.espritCs.immoPortailEJB/ManagementServices!edu.espritCs.immoPortailEJB.domain.basicManagement.ManagementServicesRemote");

			Gouvernorat gouvernorat = new Gouvernorat();
			gouvernorat.setCodeGouvernorat("SLN");
			gouvernorat.setNomGouvernorat("SILIANA");
			
			Delegation delegation = new Delegation();
			
			delegation.setCodeDelegation("MKT");
			delegation.setNomDelegation("MAKTHAR");
			delegation.setGouvernorat(gouvernorat);
			managementServicesRemote.createDelegation(delegation);
			
			delegation.setCodeDelegation("BRG");
			delegation.setNomDelegation("BARGOU");
			managementServicesRemote.createDelegation(delegation);
			
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
