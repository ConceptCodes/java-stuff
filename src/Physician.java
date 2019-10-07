import java.util.*;

public class Physician extends Person {
	
	public ArrayList<Patient> patients;
	public boolean clockedIn;
	
	public Physician(String _fname, String _lname, int _age, boolean _gender) {
		super(_fname,_lname,_age,_gender);
		this.patients = new ArrayList<>();
		this.clockedIn = false;
	}
	
	public void addPatient(Patient  p) {
		if(!patients.contains(p))
			patients.add(p);
	}
	
	public void removePatient(Patient p) {
		patients.remove(patients.indexOf(p));
	}
	
	public void toggleClockedIn() { this.clockedIn = !this.clockedIn; }
}
