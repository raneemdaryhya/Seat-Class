package test;

public class Seat {

	public static String getColumn;
	private int seatNumber;
	private String passName;
	
	Seat(){
	}
	Seat(int seatNumber){
		this.seatNumber=seatNumber;																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber=seatNumber;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setPassName(String passName) {
		this.passName=passName;
	}
	public String getPassNumber() {
		return passName;
	}
	public boolean isEmpty() {
		return this.passName==null;
	}
	public String toString() {
		return " seatNUmber: "+ seatNumber+" passName: "+passName;
	}
	public static boolean isValid(int seatNumber) {
		if(seatNumber>=1 && seatNumber<=92) {
			return true;
		}
		return false;
	}
	public static int getRow(int seatNumber) {
		if(isValid(seatNumber)) {
			return (seatNumber-1)/4+1;
		}else {
			return -1;
		}
	}
	public static int getColumn(int seatNumber) {
		if(isValid(seatNumber)) {
			return (seatNumber-1)%4+1;
		}else {
			return -1;
		}
	}

}