// by Samuel Zhang
package testing;

public class Reservation {
  private String guestName;
  private int roomNumber;
 
  //Todo: implement a constructor for class Reservation.
  //Parameter: name: guest name
  //           number: room number
  public Reservation(String name, int number) {
	  // Your code is here.
	  guestName = name;
	  roomNumber = number;
  }
  
  //Todo: implement the method that returns the room number 
  //      of this reservation.
  public int getRoomNumber()
  { 
     // Your code is here.
	  return roomNumber;
  }
  
  //Todo: implement the method that returns the guest name 
  //      of this reservation.
  public String getGuestName() {
	//Your code is here.
	  return guestName;
  }
  
  //Todo: implement the method that returns a string to describe 
  //      a reservation info in the form: 
  //          [room_number:guest_name]
  public String toString() {
	  // Your code is here.
	  return "[" + roomNumber + ":" + guestName +"]";
  }
  
}

