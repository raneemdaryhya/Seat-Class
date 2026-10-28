package test;

public class Train {
	private static Seat[][] trainSeat = new Seat[24][];

	Train() {
		trainSeat[1] = new Seat[3];
		trainSeat[23] = new Seat[3];
		for (int i = 2; i <= 22; i++) {
			trainSeat[i] = new Seat[5];
		}
	}

	public boolean reserveSeat(int seatNumber, String passName) {
		if (!Seat.isValid(seatNumber)) {
			return false;
		}
		int row = Seat.getRow(seatNumber);
		int c = Seat.getColumn(seatNumber);

		if (trainSeat[row][c] == null) {
			trainSeat[row][c] = new Seat(000000, "raneem");
			return true;
		} else {
			trainSeat[row][c].setPassName(passName);
			trainSeat[row][c].setSeatNumber(seatNumber);

			return true;
		}
	}

	public boolean deletReservedSeat(int seatNumber) {
		if (!Seat.isValid(seatNumber)) {
			return false;
		}
		int row = Seat.getRow(seatNumber);
		int c = Seat.getColumn(seatNumber);

		if (trainSeat[row][c] != null) {
			trainSeat[row][c].setPassName(null);
			trainSeat[row][c].setSeatNumber(0);
			return true;
		}
		return false;
	}

	public static void deleteAllReservedSeat() {
		for (int i = 0; i < trainSeat.length; i++) {
			if(trainSeat[i] !=null) {
				for (int j = 0; j < trainSeat[i].length; j++) {
					if(trainSeat[i][j] !=null) {
						trainSeat[i][j].setPassName(null);
						trainSeat[i][j].setSeatNumber(0);
					}
				}
			}
		}
	}

	public void printInfo() {
		for (int i = 0; i < trainSeat.length; i++) {
			for (int j = 0; i < trainSeat[i].length; j++) {
				if (trainSeat[i][j] == null) {
					System.out.println("y");
				} else if (trainSeat[i][j].getSeatNumber() == -1) {
					System.out.println("y");
				} else {
					System.out.println(trainSeat[i][j].toString());
				}
			}
		}
	}

	public static Seat[][] getAllSeats() {
		// TODO Auto-generated method stub
		return trainSeat;
	}

	
	}

