package test;

public class Adress {
	private String street;
	private String city;
	
	Adress(){
		
	}
	Adress(String street,String city){
		this.street=street;
		this.city=city;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	
	public String toString() {
		return street + "," + city;
	}
	
}
