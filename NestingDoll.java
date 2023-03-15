package NestingDoll;

public class NestingDoll
{
	// instance fields
	private NestingDoll innerDoll; 
	private String hairColor;
	private String name;
	private String familyName;
	private boolean wearsAScarf;
	
	// constructor for a NestingDoll with no innerDoll (base case)
	public NestingDoll(String name, String color, boolean scarf) {
		this.name = name;
		this.hairColor = color;
		this.wearsAScarf = scarf;
		
		this.innerDoll = null;
	}
	
	// second constructor with an inner doll
	public NestingDoll(String name, String color, boolean scarf, NestingDoll innerDoll) {
		this.name = name;
		this.hairColor = color;
		this.wearsAScarf = scarf;
		
		this.innerDoll = innerDoll;
	}
	
	// hasInnerDoll - returns true if this has an inner doll
	public boolean hasInnerDoll(){
		return this.innerDoll != null;
	}
	// getInnerDoll - accessor
	public NestingDoll getInnerDoll(){
		return this.innerDoll;
	}
	
	
	/** howManyDolls - returns a count of how many dolls there are; including this one.
	 */
	public int howManyDolls(){
		if (!hasInnerDoll()) {
			return 1;
		}
		return 1 + getInnerDoll().howManyDolls();
	}

	/**
	 * 
	 * @return the number of dolls wearing scarfs
	 */
	public int howManyWearingScarfs () {
		// FIXME: to return the correct count
		//Use Recursion (NO LOOPS) to return the number of dolls 
		// (including all inner dolls) that are wearing scarfs
		if (!hasInnerDoll()) {
			if (wearsAScarf == true) {
				return 1;
			} else {
			    return 0;
			}
		}
		
		if (wearsAScarf == true) {
		    return 1 + getInnerDoll().howManyWearingScarfs();
		} else {
			return getInnerDoll().howManyWearingScarfs();
		}
		
		//return 0; // remove this line when you have correctly implemented this method
	}

	/**
	 * 
	 * @return the number of dolls that have Red hair
	 */
	public int redHeadCount() {
		// FIXME: to return the correct count
		// Use Recursion (NO LOOPS) to return the number of dolls
		// (including all inner dolls) that have red hair color
		if (!hasInnerDoll()) {
			if (hairColor.equals("Red")) {
				return 1;
			} else {
			    return 0;
			}
			
		}
		
		if (hairColor.equals("Red")) {
			return 1 + getInnerDoll().redHeadCount();
		} else {
		    return getInnerDoll().redHeadCount();
		}
				
		//return 0; // remove this line when you have correctly implemented this method

	}
	
	/**
	 * 
	 * @return familyName of all the dolls in the nest of dolls which is lowest 
	 * alphabetically
	 */
	public String familyName() {
		// FIXME: to return the correct familyName
		// The familyName of a doll is the alphabetically earliest lastName of the doll 
		// or any of it's inner dolls
		
		
		// Identify the last name 
		// (each doll has a first and last name separated by a space. 
		// Only look at the last name
		//	For Example:   if the doll's name is "Peter Parker" 
		//                 then the last name will be "Parker"
		// 
		// Compare  the doll's  lastName (with all inner doll's lastNames) 
		// and return the LastName that is lowest in the alphabet
		//
		// You should use the String method compareTo to check which of two
		// strings is lowest alphabetically  For Example:
		//		"abc".compareTo("xyz") will return a negative number
		//			since abc is lower alphabetically than xyz
		//		"xyz".compareTo("abc") will return a positive number 
		//			since xyz is higher alphabetically than abc
		// 		"abc".compareTo("abc") will return 0 
		//			since abc is the same alphabetically as abc
		//
		// Be sure to use Recursion to implement this method. 
		String fname="";
		if (!hasInnerDoll()) {
			return name.split(" ")[1];
		}
		//System.out.println(name.split(" ")[1]);
		
		fname=getInnerDoll().familyName();
		if (name.split(" ")[1].compareTo(fname)>0) {
			return fname;
		} else {
			return name.split(" ")[1];
		}
		//return getInnerDoll().familyName(); // remove this line when you have correctly implemented this method
	}
	
	public String toString() {
		// FIXME: to return a String containing all the information for this doll
		// (including inner dolls)
		// Use Recursion (NO LOOPS) to return a String with all of the dolls info
		//
		// For example for the doll with the 
		//	name: "Super Spiderman" 
		//  hairColor: "Red" 
		//  wearing a scarf: TRUE
		//  innerDoll:   
		//  	name: "Peter Parker" 
		//		hairColor: "Brown"
		//		wearing a scarf: FALSE
		//		innerDoll: null
		//
		// toString would return the String:
		// "Super Spiderman HairColor: Red familyName: Parker Wears a Scarf\n innerDoll:\nPeter Parker HairColor: Brown familyName: Parker"
        String wearsScarf="";
        if ( wearsAScarf == true ) {
        	wearsScarf=" Wears a Scarf";
        } 
   
		if (!hasInnerDoll()) {
			return name+" HairColor:"+hairColor+" familyName: "+familyName()+wearsScarf+"\n";
			//return createNestingDoll().toString();
		}
		
		return name+" HairColor:"+hairColor+" familyName: "+familyName()+wearsScarf+"\ninnerDoll:\n"+getInnerDoll().toString();
		//return ""; // remove this line when you have correctly implemented this method		
	}

	public static NestingDoll createNestingDoll() 
	{
		NestingDoll doll = new NestingDoll ("Mabel Lewis", "Red", true);
		doll = new NestingDoll("Macey Zuchai", "Black", false, doll);
		doll = new NestingDoll("Maddie Abbot", "Red", false, doll);
		doll = new NestingDoll("Mara Mendleson", "Grey", true, doll);
		doll = new NestingDoll("Mary Jones", "Red", true, doll);
		doll = new NestingDoll("Max Lukaston", "Red", true, doll);
		return doll;
	}
	
	public static void main(String[] args) {
		NestingDoll doll = createNestingDoll();
		System.out.println(doll.toString());
		System.out.println();
		System.out.println("There are " + doll.howManyDolls() + " total dolls");
		System.out.println("There are " + doll.redHeadCount() + " red headed dolls");
		System.out.println("There are " + doll.howManyWearingScarfs() + " dolls wearing a scarf");
		System.out.println("The doll's familyName is " + doll.familyName());
		
	}
}