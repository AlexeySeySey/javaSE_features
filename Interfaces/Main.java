import Services.PoopMaker;
import Services.JawBreaker;
import Services.Handler;

class Main 
{
	public static void main(String[] args)
	{
		System.out.println(Handler.makeFrom(new PoopMaker()));
		System.out.println(Handler.makeFrom(new JawBreaker()));
	}
}
