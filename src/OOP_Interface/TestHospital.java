package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioSercvices();
		fh.dentalSercvices();
		fh.emergencySercvices();
		fh.entSercvices();
		fh.medInsurance();
		fh.covidTest();
		UNHG.covidGuidelines();
		fh.medicalInfo(); 
		System.out.println(USMedical.min_fees);
		
		USMedical.billing();
		
		//top casting:
		//child class object can be referred by parent interface reference variable
		
		USMedical us = new FortisHospital();
		us.cardioSercvices();
		us.emergencySercvices();
		us.oncologySercvices();
		us.physioSercvices();
		us.medInsurance();
		
		
		
		
		
		
		UKMedical uk = new FortisHospital();
		uk.emergencySercvices();
		uk.entSercvices();
		uk.pediaSercvices();
		
		
		
		
	}

}
