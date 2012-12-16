package edu.espritCs.immoPortailClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.espritCs.immoPortailEJB.domain.basicManagement.ManagementServicesRemote;
import edu.espritCs.immoPortailEJB.entities.Gouvernorat;


public class TestAddGouvernorat {
	public static void main(String[] args) {
		 
		try {
			Context context = new InitialContext();
			ManagementServicesRemote managementServicesRemote = (ManagementServicesRemote)context
					.lookup("edu.espritCs.immoPortail/edu.espritCs.immoPortailEJB/ManagementServices!edu.espritCs.immoPortailEJB.domain.basicManagement.ManagementServicesRemote");

			Gouvernorat gouvernorat = new Gouvernorat();
			
			gouvernorat.setCodeGouvernorat("SLN");
			gouvernorat.setNomGouvernorat("SILIANA");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("MNB");
			gouvernorat.setNomGouvernorat("MANNOUBA");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("TNS");
			gouvernorat.setNomGouvernorat("TUNIS");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("ARN");
			gouvernorat.setNomGouvernorat("ARIANA");
			managementServicesRemote.createGouvernorat(gouvernorat);
		
			gouvernorat.setCodeGouvernorat("TTN");
			gouvernorat.setNomGouvernorat("TATAOUINE");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("MDN");
			gouvernorat.setNomGouvernorat("MEDENINE");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("BZT");
			gouvernorat.setNomGouvernorat("BIZERTE");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("SSE");
			gouvernorat.setNomGouvernorat("SOUSSE");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("MNS");
			gouvernorat.setNomGouvernorat("MOUNASTIR");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("BJA");
			gouvernorat.setNomGouvernorat("BEJA");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("JND");
			gouvernorat.setNomGouvernorat("JENDOUBA");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("KEF");
			gouvernorat.setNomGouvernorat("LE KEF");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("SDB");
			gouvernorat.setNomGouvernorat("SIDI BOUZID");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("KSR");
			gouvernorat.setNomGouvernorat("KASSERINE");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("GFS");
			gouvernorat.setNomGouvernorat("GAFSA");
			managementServicesRemote.createGouvernorat(gouvernorat);
		
			gouvernorat.setCodeGouvernorat("KBL");
			gouvernorat.setNomGouvernorat("KEBILI");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("TZR");
			gouvernorat.setNomGouvernorat("TOZEUR");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("KRN");
			gouvernorat.setNomGouvernorat("KAIROUAN");
			managementServicesRemote.createGouvernorat(gouvernorat);
		
			gouvernorat.setCodeGouvernorat("ZGN");
			gouvernorat.setNomGouvernorat("ZAGHOUAN");
			managementServicesRemote.createGouvernorat(gouvernorat);
		
			gouvernorat.setCodeGouvernorat("GBS");
			gouvernorat.setNomGouvernorat("GABES");
			managementServicesRemote.createGouvernorat(gouvernorat);
		

			gouvernorat.setCodeGouvernorat("MHD");
			gouvernorat.setNomGouvernorat("MAHDIA");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("SFX");
			gouvernorat.setNomGouvernorat("SFAX");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("NBL");
			gouvernorat.setNomGouvernorat("NABEUL");
			managementServicesRemote.createGouvernorat(gouvernorat);
			
			gouvernorat.setCodeGouvernorat("BNA");
			gouvernorat.setNomGouvernorat("BEN AROUS");
			managementServicesRemote.createGouvernorat(gouvernorat);
			

		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}

}
