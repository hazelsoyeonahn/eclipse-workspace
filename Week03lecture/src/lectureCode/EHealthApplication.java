package lectureCode;

public class EHealthApplication {
	public static void main(String[] args) {
		Prescription doctorPrescription = new Prescription("Rx tab. Morphine", "30/07.2015", 2, 5.0);
		doctorPrescription.setDosage(50);
	}
}
