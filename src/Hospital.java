import java.util.*;

public class Hospital {
	public ArrayList<Patient> patients;
	public ArrayList<Physician> staff;
	
	public Hospital() {
		this.patients = new ArrayList<>();
		this.staff = new ArrayList<>();
	}
	
	public void addPatient(Patient p) {
		if (!patients.contains(p))
			patients.add(p);
	}
	
	public void addPhysician(Physician d) {
		if (!staff.contains(d))
			staff.add(d);
	}
	
	public void removePatient(Patient p) {
		patients.remove(patients.indexOf(p));
	}
	
	public void removePhysician(Physician d) {
		staff.remove(staff.indexOf(d));
	}
}
