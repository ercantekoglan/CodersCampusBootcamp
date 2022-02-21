package exercise_sorting_practice;


public class Pig{

	// CREATE the field "name" which is a String
	// CREATE the field "status" which is a String
	private String name;
	private String status;
	
	// CREATE the constructor
	public Pig(String name, String status) {
		
		this.name = name;
		this.status = status;
	}
	
	// Create getter and setter for name and status

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
