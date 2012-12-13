package edu.espritCs.immoPortailEJB.domain.basicManagement;

import javax.ejb.Local;

import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;

@Local
public interface ManagementServicesLocal {

	public void createGouvernorat(Gouvernorat gouvernorat);

	public Gouvernorat getGouvernoratByCode(String code);

	public void createDelegation(Delegation delegation);

	public Delegation getDelegationByCode(String code);

}
