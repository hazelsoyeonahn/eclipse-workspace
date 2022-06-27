package lectureCode;

public class Prescription {
	private String drugDescription;
	private String startDate;
	private int nWeeksToRepeat;
	private double dosage;
	
	
	public String getDrugDescription() {
		return drugDescription;
	}


	public void setDrugDescription(String drugDescription) {
		this.drugDescription = drugDescription;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public int getnWeeksToRepeat() { 
		return nWeeksToRepeat;
	}


	public void setnWeeksToRepeat(int nWeeksToRepeat) {
		this.nWeeksToRepeat = nWeeksToRepeat;
	}


	public double getDosage() {
		return dosage;
	}


	public void setDosage(double dosage) {
		this.dosage = dosage;
	}


	public Prescription(String drugDescription, String startDate, int nWeeksToRepeat, double dosage) {
		this.drugDescription = drugDescription;
		this.startDate = startDate;
		this.nWeeksToRepeat = nWeeksToRepeat;
		this.dosage = dosage;
	}
}
