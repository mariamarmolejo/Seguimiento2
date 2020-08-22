package exceptions;

public class IDNoMatchException extends Exception{
	  private int day;
	  private int number;
	  public IDNoMatchException(int d, int n){
	    super("Your ID does not have permission today, come back tomorrow");
	    day = d;
	    number = n;
	  }

	  public int getDay(){
		  return day;
	  }

	  public int getNumber(){
	    return number;
	  }
}
