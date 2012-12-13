package edu.espritCs.immoPortailEJB.domain.basicManagement;

import javax.ejb.Remote;

import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;

@Remote
public interface ManagementServicesRemote {

	public void createGouvernorat(Gouvernorat gouvernorat);

	public Gouvernorat getGouvernoratByCode(String code);

	public void createDelegation(Delegation delegation);

	public Delegation getDelegationByCode(String code);
	
	public void createTypeDuBien(TypeDuBien typeDuBien);
	
	public TypeDuBien getTypeDuBienByCode(String code);

}
