
public class Medicine {
	public String name;
	public String colour;
	public int pillCount;
	
	public Medicine(String _name, String _colour, int _pillCount) {
		this.name = _name;
		this.colour = _colour;
		this.pillCount = _pillCount;
	}
	
	//setters
	public void setName(String _name) { this.name = _name; }
	public void setColour(String _colour) { this.colour = _colour; }
	public void setPillCount(int _count) { this.pillCount = _count; }
	
	//getters
	public String getName() { return name;  }
	public String getColour() { return colour; }
	public int getPillCount() { return pillCount; }
	
}
