package Enum;

public enum Size 
{
   SMALL,MEDIUM,LARGE,EXTRALARGE;
	public String getSize()
	{
		switch(this)
		{
		case SMALL:
			return "small";
		case MEDIUM:
			return "medium";
		case LARGE:
			return "large";
		case EXTRALARGE:
			return "extralarge";
		default:
			return null;
		}
	}
  public static void main(String args[])
  {
	  System.out.println(Size.SMALL);
	  System.out.println(Size.MEDIUM);
	  System.out.println(Size.LARGE);
	  System.out.println(Size.EXTRALARGE);
	  System.out.println("The Size of the Popcorn is:"+Size.SMALL.getSize());
	  System.out.println("The Size of the Popcorn is:"+Size.SMALL.name());
	  System.out.println("The Size of the Popcorn is:"+Size.SMALL.toString());
	  System.out.println("The Size of the Popcorn is:"+Size.SMALL.compareTo(Size.MEDIUM));
	  System.out.println("The Size of the Popcorn is:"+Size.EXTRALARGE.ordinal());
  }
}
