package edu.espritCs.immoPortailClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.espritCs.immoPortailEJB.domain.basicManagement.ManagementServicesRemote;
import edu.espritCs.immoPortailEJB.entities.TypeDuBien;

public class TestAddTypeDuBien {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			ManagementServicesRemote managementServicesRemote = (ManagementServicesRemote)context
					.lookup("edu.espritCs.immoPortail/edu.espritCs.immoPortailEJB/ManagementServices!edu.espritCs.immoPortailEJB.domain.basicManagement.ManagementServicesRemote");

			TypeDuBien typeDuBien = new TypeDuBien();
			typeDuBien.setCodeType("TRN");
			typeDuBien.setNomType("TERRAIN");
			managementServicesRemote.createTypeDuBien(typeDuBien);
			
			typeDuBien.setCodeType("VIL");
			typeDuBien.setNomType("VILLA");
			managementServicesRemote.createTypeDuBien(typeDuBien);
			
			typeDuBien.setCodeType("AP1");
			typeDuBien.setNomType("APPARTEMENT S+1");
			managementServicesRemote.createTypeDuBien(typeDuBien);

			typeDuBien.setCodeType("AP2");
			typeDuBien.setNomType("APPARTEMENT S+2");
			managementServicesRemote.createTypeDuBien(typeDuBien);
			
			typeDuBien.setCodeType("AP3");
			typeDuBien.setNomType("APPARTEMENT S+3");
			managementServicesRemote.createTypeDuBien(typeDuBien);
			
			typeDuBien.setCodeType("GRG");
			typeDuBien.setNomType("GARAGE");
			managementServicesRemote.createTypeDuBien(typeDuBien);
			
			typeDuBien.setCodeType("BRO");
			typeDuBien.setNomType("BUREAU");
			managementServicesRemote.createTypeDuBien(typeDuBien);
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

}
