package edu.espritCs.immoPortailEJB.domain.reporting;

import java.util.List;

import javax.ejb.Remote;

import edu.espritCs.immoPortailEJB.entities.Annonce;
import edu.espritCs.immoPortailEJB.entities.User;

@Remote
public interface AdvertsReportingServicesRemote {
	public List<Annonce> getAllAnnonces();
	public List<Annonce> getAllActiveAnnonces();
	public List<Annonce> getAllOffresActivesLocation();
	public List<Annonce> getAllOffresActivesVente();
	public List<Annonce> getAllDemandesActivesLocation();
	public List<Annonce> getAllDemandesActivesVente();
	public List<Annonce> getAllAnnoncesByUser(User user);
}
