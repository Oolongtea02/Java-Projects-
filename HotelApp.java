package testing;

public class HotelApp {

	public static void main(String[] args) {
		Hotel hilton = new Hotel("Hilton", 5);
		
		Reservation r1 = hilton.requestRoom("Cathy");
		Reservation r2 = hilton.requestRoom("Tom");
		Reservation r3 = hilton.requestRoom("Amy");
		Reservation r4 = hilton.requestRoom("Gary");
		System.out.println(hilton);
		System.out.println("Total guest: "+ Hotel.totalGuests);
		System.out.println();
		
		hilton.cancelAndReassign(r3);
		System.out.println("After removing Amy");
		System.out.println(hilton);
		System.out.println();
		
		//Add four more guests. 
		Reservation r5 = hilton.requestRoom("Frank");
		Reservation r6 = hilton.requestRoom("Jim");
		Reservation r7 = hilton.requestRoom("Danny");
		Reservation r8 = hilton.requestRoom("Henry");
		System.out.println("After adding four more");
		System.out.println(hilton);
		System.out.println("Total guest: "+ Hotel.totalGuests);
		System.out.println("how many are waiting: " + hilton.numWaitings());
		System.out.println();
		
		hilton.cancelAndReassign(r5);  // Frank canceled. 
		System.out.println("After removing Frank");
		System.out.println(hilton);
		System.out.println("Total guest: "+ Hotel.totalGuests);
		System.out.println("how many are waiting: " + hilton.numWaitings());
		System.out.println();
	}

}
