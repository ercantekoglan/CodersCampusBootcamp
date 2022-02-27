package ifPresent_Practice;


public class SuspectLocation {
	private String name;
	private String country;






	@Override
	public String toString() {
		return "SuspectLocation [name=" + name + ", country=" + country + "]";
	}

	public SuspectLocation(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
