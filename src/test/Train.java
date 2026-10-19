package test;

public class Train {
	private static Seat[][]seat;
	public boolean reserveSeat(int seatNumber,String passName) {
		if (seat==null) {
			return true;
		}else {
			return false;
		}

	}
	public boolean deletReservedSeat(int seatNumber) {
		if(seat!=null) {
			return true;
		}else {
			return false;
		}
	}
	public static void deleteAllReservedSeat() {
		for(int r=0;r<seat.length;r++) {
			for(int c=0;c < seat[r].length;c++) {
				seat[r][c].setPassName(null);
			}
		}
	}
	public static void deleteSeat(Seat[][] seat, int i) {
		// TODO Auto-generated method stub
		
	}
	
}
