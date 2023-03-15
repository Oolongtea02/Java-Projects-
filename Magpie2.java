/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement=statement.trim();
		if (statement.length()==0)
		{
			response = "Say something, please.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		//<SZ> change response to 'pets'
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		//<SZ> change response to 'teacher'
		else if (statement.indexOf("Mr. ") >= 0)
		{
			response = "He sounds like a good teacher.";
		}
		else if (statement.indexOf("nah") >= 0)
		{
			response = "Is that it?";
		}
		else if (statement.indexOf("stepbrother") >= 0
				|| statement.indexOf("stepsister") >= 0)
		{
			response = "Tell me more about your extended family.";
		}
		else if (statement.indexOf("moon") >= 0)
		{
			response = "The moon is shining bright.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	//<SZ> The code prioritizes the responses with the following orders: keyword 'no' first, then the keyword 'mother', and finally the keyword 'cat' and 'dog'.

	//<SZ> 1. The keyword 'no' is in the statement "I know..." but the statement is not related to the word 'no'.
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		//<SZ> new random response 
		else if (whichResponse == 4)
		{
			response = "That sounds interesting.";
		}
		//<SZ> new random response
		else if (whichResponse == 5)
		{
			response = "Wow, I'm impressed.";
		}
		return response;
	}
}

