import java.util.*;


public class Patient extends Person {
	public String address;
	public ArrayList<Medicine> perscribedMedicine;
	
	
	public Patient(String _fname, String _lname, int _age, boolean _gender, String _address) {
		super(_fname, _lname, _age, _gender);
		this.address = _address;
		this.perscribedMedicine = new ArrayList<>();
	}
	
	//setter methods
	public void setAddress(String _address) { this.address = _address; }
	
	//getter methods
	public String getAddress() { return address; }
	
	
	// methods
	public void perscribeMedicine(Medicine med) { 
		if (!perscribedMedicine.contains(med)) 
			perscribedMedicine.add(med);
	}

}
