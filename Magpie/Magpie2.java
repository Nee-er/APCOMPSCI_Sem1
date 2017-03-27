public class Magpie2
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	public String getResponse(String statement)
	{
		String response = "";

		if(statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		 
		if(findKeyword(statement, "no", statement.toLowerCase().indexOf("no")) >= 0)
		{
			response = "Why so negative?";
		}
		

		else if (findKeyword(statement, "mother", statement.toLowerCase().indexOf("mother")) >= 0
				|| findKeyword(statement, "father", statement.toLowerCase().indexOf("father")) >= 0
				|| findKeyword(statement, "sister", statement.toLowerCase().indexOf("sister")) >= 0
				|| findKeyword(statement, "brother", statement.toLowerCase().indexOf("brother")) >= 0
				|| findKeyword(statement, "mom", statement.toLowerCase().indexOf("mom")) >= 0
				|| findKeyword(statement, "dad", statement.toLowerCase().indexOf("dad")) >= 0)
		{
			response = "Tell me more about your family.";
		}


		else if (findKeyword(statement, "cat", statement.toLowerCase().indexOf("cat")) >= 0
				|| findKeyword(statement, "dog", statement.toLowerCase().indexOf("dog")) >= 0
				|| findKeyword(statement, "fish", statement.toLowerCase().indexOf("fish")) >= 0
				|| findKeyword(statement, "turtle", statement.toLowerCase().indexOf("turtle")) >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement, "Robinette", statement.toLowerCase().indexOf("Robinette")) >= 0)
		{
			response = "Sounds like a pretty dank teacher.";
		}
		
		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		/* New String variable phrase = a more searchable version of statement.
		 	-Use a combination of trim() and toLowerCase() modify statement.

		   New int variable psn = the location of goal in phrase after
		   startPos

			-->Refinement: Make sure we find goal by itself, and not part
			of another word ("no" vs no in "know"). if you find an occurrence
			of goal, make sure before and after aren't letters.

			As long as psn >= 0...
				Check if psn > 0 - there is no need to check for before at the
				beginning of the word
					set before = the slot in phrase before psn */

		int psn = statement.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		String before = " ";
		String after = " ";
		
		while(psn >= 0)
		{
			if(psn > 0)
			{
				before = statement.substring(psn - 1, psn).toLowerCase();
			}
		
				/*check if you can fit goal into the rest of phrase - no need to
				proceed otherwise
					set after = the slot in phrase after psn + length of goal */

			if(psn + goal.length() < statement.length())
			{
				after = statement.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}

				/* if before and after are not letters (compare before to "a"
					and after to "z")
						--return psn
				Otherwise, search for goal in phrase from psn + 1 forward */
			
			if(((before.compareTo("a") < 0) || (before.compareTo("z")) > 0) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = statement.indexOf(goal.toLowerCase(), psn + 1);
		}

		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
