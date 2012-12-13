package edu.espritCs.immoPortailEJB.domain.basicListing;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;

@Remote
public interface BasicListingServicesRemote {
	public List<Gouvernorat> getAllGouvernorats();
	public List<TypeDuBien> getAllTypeDuBien();
	public List<Delegation> getAllDelegationsByGouvernorats(String gouvernorat);
}
