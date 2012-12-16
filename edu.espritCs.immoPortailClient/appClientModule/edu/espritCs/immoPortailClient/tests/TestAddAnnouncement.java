package edu.espritCs.immoPortailClient.tests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.espritCs.immoPortailEJB.domain.advertsManagement.AdvertsManagementServicesRemote;
import edu.espritCs.immoPortailEJB.entities.AdPicture;
import edu.espritCs.immoPortailEJB.entities.Annonce;
import edu.espritCs.immoPortailEJB.entities.Delegation;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;
import edu.espritCs.immoPortailEJB.entities.User;

public class TestAddAnnouncement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context;
		try {
			context = new InitialContext();

			AdvertsManagementServicesRemote advertsManagementServicesRemote = (AdvertsManagementServicesRemote) context
					.lookup("edu.espritCs.immoPortail/edu.espritCs.immoPortailEJB/AdvertsManagementServices!edu.espritCs.immoPortailEJB.domain.advertsManagement.AdvertsManagementServicesRemote");

			Annonce annonce = new Annonce();

			User user = new User();
			user.setIdUser(2);

			TypeDuBien typeDuBien = new TypeDuBien();
			typeDuBien.setCodeType("TRN");

			Gouvernorat gouvernorat = new Gouvernorat();
			gouvernorat.setCodeGouvernorat("SLN");

			Delegation delegation = new Delegation();
			delegation.setCodeDelegation("MKT");

			AdPicture adPicture1 = new AdPicture();
			AdPicture adPicture2 = new AdPicture();
			adPicture1.setAnnonce(annonce);
			adPicture2.setAnnonce(annonce);
			adPicture1.setPicture(ImageUtils.getImage("img\\1.jpg"));
			adPicture2.setPicture(ImageUtils.getImage("img\\2.jpg"));
			List<AdPicture> images = new ArrayList<AdPicture>();
			images.add(adPicture1);
			images.add(adPicture2);

			annonce.setPictures(images);
			annonce.setUser(user);
			annonce.setDateAnnonce(new Date());
			annonce.setDateEcheance(DateUtils.dateAdd(annonce.getDateAnnonce(),
					30));
			annonce.setDelegation(delegation);
			annonce.setGouvernorat(gouvernorat);
			annonce.setEtat(1);
			annonce.setPrix(35000);
			annonce.setTitreAnnonce("TERRAIN 5.3Hectares A VENDRE ");
			annonce.setTypeAnnonce("OFFRE");
			annonce.setTypeOperation("VENTE");
			annonce.setTypeDuBien(typeDuBien);
			annonce.setTexteAnnonce("Vend un terrain agricole de 5.3 hectares à makthar");

			advertsManagementServicesRemote.createAnnonce(annonce);
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
