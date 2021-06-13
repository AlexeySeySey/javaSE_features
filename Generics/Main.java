import Utils.Something;

class Main
{
  public static void main(String[] args)
  {
	  int foo = (new Something<Integer>()).setData(10).getData();
	  String bar = (new Something<String>()).setData("Butter").getData();

	  System.out.println(foo);
	  System.out.println(bar);
  }
}
