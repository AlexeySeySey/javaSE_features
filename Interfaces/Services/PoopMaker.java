package Services;

import Contracts.IMaker;

public class PoopMaker implements IMaker 
{
	private static String stuff;

	{
		this.stuff = "Poop";
	}

	public String make()
	{
		return stuff;
	}
}
