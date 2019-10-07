
public class Person {
	public String fname;
	public String lname;
	public int age;
	public boolean gender;
	
	public Person(String _fname, String _lname, int _age, boolean _gender) {
		this.fname = _fname;
		this.lname = _lname;
		this.age = _age;
		this.gender = _gender;
	}
	
	// setter methods
	public void setfName(String _name) { this.fname = _name; }
	public void setlName(String _name) { this.lname = _name; }
	public void setAge(int _age) { this.age = _age; }
	public void setGender(boolean _gender) { this.gender = _gender; }
	
	//getter methods
	public String getFname() { return fname; }
	public String getLname() { return lname; }
	public int getAge() { return this.age; }
	public boolean getGender() { return this.gender; }
	
}
