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
		
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}


		else
		{
			int psn = findKeyword(statement, "you", 0);


			if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else if(psn >= 0 && findKeyword(statement, "I", 0) >= 0)
			{
				response = transformIYouStatement(statement);
			}
			else
			{
				response = getRandomResponse();
			}
		}
		
		return response;
	}
	
	private String transformIWantToStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() - 1);
		
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psn = findKeyword(statement, "i want to", statement.toLowerCase().indexOf("i want to"));
		
		String restOfStatement = statement.substring(psn + 10);
	
		return "What would it mean to " + restOfStatement + "?";
	}
	
	private String transformYouMeStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() - 1);
		
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnOfYou = findKeyword(statement, "you");
		int psnOfMe = findKeyword(statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
		
		return "What makes you think that I" + restOfStatement + "you?";
	}
	
	private String transformIYouStatement(String statement)
	{
		String phrase = statement.trim().toLowerCase();
		String lastChar = phrase.substring(phrase.length() - 1);
		
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() - 1);
		}
		
		int psnOfI = findKeyword(statement, "I");
		int psnOfYou = findKeyword(statement, "You", psnOfI);
		
		String restOfStatement = statement.substring(psnOfI, psnOfYou);
		
		return "Why do you" + restOfStatement + "me?";
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		
		int psn = statement.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		String before = " ";
		String after = " ";
		
		while(psn >= 0)
		{
			if(psn > 0)
			{
				before = statement.substring(psn - 1, psn).toLowerCase();
			}

			if(psn + goal.length() < statement.length())
			{
				after = statement.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			if(((before.compareTo("a") < 0) || (before.compareTo("z")) > 0) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = statement.indexOf(goal.toLowerCase(), psn + 1);
		}

		return -1;

	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

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
