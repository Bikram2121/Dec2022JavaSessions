package OOP_Interface;

//multiple inheritence
public class FortisHospital extends UNHG implements USMedical, UKMedical,IndianMedical {
	
	
	//US
	@Override
	public void physioSercvices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioSercvices() {
		System.out.println("FH -- cardioServices");
	}

	@Override
	public void oncologySercvices() {
		System.out.println("FH -- oncologyServices");
		
	}

	//UK
	@Override
	public void entSercvices() {
		System.out.println("FH -- entSercvices");
		
	}

	@Override
	public void pediaSercvices() {
		System.out.println("FH -- pediaSercvices");
		
	}

	
	//INDIA
	@Override
	public void orthoSercvices() {
		System.out.println("FH -- orthoSercvices");
		
	}

	@Override
	public void dentalSercvices() {
		System.out.println("FH -- dentalSercvices");
		
	}

	
	
	// fortis
	
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}
	
	public void optServices() {
		System.out.println("FH -- optServices");
	}

	@Override // Interface can have the common methods but the class has to override only once.
	public void emergencySercvices() {
		System.out.println("FH -- emergencySercvices");		
	}
	
	@Override
	public void medInsurance() {
		System.out.println("FH med Insurance");
	}

	@Override
	public void covidTest() {
		System.out.println("FH--covid test");
		
	}
	
	
	
	
	
	
	
	
	
}
