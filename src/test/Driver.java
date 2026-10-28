
package test;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	// 1
	public static void readPassFile() {
		File f = new File("Passengers.txt");
		if (f.exists()) {
			try {
				Scanner s = new Scanner(f);
				int row, c;
				while (s.hasNext()) {
					String line=s.nextLine().trim();
					if(!line.isEmpty()) {
					String[] t1 = line.split(":");
					int seatNumber = Integer.parseInt(t1[0].trim());
					row = Seat.getRow(seatNumber);
					c = Seat.getColumn(seatNumber);
					Train t = new Train();
					if (Seat.isValid(seatNumber)) {
						if (t.reserveSeat(seatNumber, t1[1])) {
						} else {
							System.out.println("Error : Seat " + t1[0] + "invalid!!");
						}
					} else {
						System.out.println("Error : Seat Number is invalid !!!");
					}
					}
					//inFile.close();
					System.out.println("passengers file loded successfully! ");
				}

			} catch (FileNotFoundException e) {
				System.out.println("error File not found  ");
			}
		} else {
			System.out.println("Error : File does'nt exist!!");
		}
	}

	// 2
	public static void UpdatePassengersFile() {
		try {
			PrintWriter writer = new PrintWriter("passengers.txt");

			Seat[][] trainSeat = Train.getAllSeats();
			for (int i = 0; i < trainSeat.length; i++) {
				if(trainSeat[i] != null) {
				for (int j = 0; j < trainSeat[i].length; j++) {
					if ( trainSeat[i][j] !=null && !trainSeat[i][j].isEmpty()) {
						writer.println("seat Number: " + trainSeat[i][j].getSeatNumber() + " : "
								+ trainSeat[i][j].getPassName());
					}
				}
			}
			}

			writer.close();

			System.out.println("pass file updated successfully ");
		} catch (FileNotFoundException e) {
			System.out.println("error writing to file ");
		}
	}

	// 3
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Train t = new Train();
		int choice = 0;
		do {
			System.out.println(" ----train menu----");
			System.out.println("1.Read passengers file ");
			System.out.println("2.Reserve a new empty seat ");
			System.out.println("3.Delete a reserved seat ");
			System.out.println("4.Delete all reserved seats ");
			System.out.println("5.Update passengers file ");
			System.out.println("6.Quit ");

			while (!in.hasNextInt()) {
				System.out.println("invalid input please enter a number btween 1 and 6");
				in.next();
			}
			choice = in.nextInt();
			in.nextLine();
			switch (choice) {
			case 1:
				readPassFile();
				break;
			case 2:
				System.out.println("Enter seat number (1-92) ");
				int seatNumber = in.nextInt();
				in.nextLine();
				System.out.println("enter passnger name: ");
				String passName = in.nextLine();
				boolean reseved = t.reserveSeat(seatNumber, passName);

				if (reseved) {
					System.out.println("seat successfully reserved ");
				} else {
					System.out.println("reservation filed seat is invalid or already occupied ");
				}
				break;
			case 3:
				System.out.println("Enter seat number (1-92) ");
				int delSeat = in.nextInt();
				in.nextLine();
				boolean deleted = t.deletReservedSeat(delSeat);

				if (deleted) {
					System.out.println("seat reservation deleted successfully  ");
				} else {
					System.out.println("deletion filed seat is invalid or already empty ");
				}
				break;
			case 4:
				Train.deleteAllReservedSeat();
				System.out.println("all seat reservations have been deleted ");
				break;
			case 5:
				UpdatePassengersFile();
				break;
			case 6:
				System.out.println("exiting program GoodBye");
				break;
			default:
				System.out.println("invalid choice please choose btween 1 and 6");
			}
		} while (choice != 6);

		//in.close();
	}

}
	
	
	
	
	
	
	
	