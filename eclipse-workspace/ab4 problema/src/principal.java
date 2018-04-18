import java.io.IOException;
import java.text.ParseException;

public class principal {

	public static void main(String[] args) throws ParseException {
		
		loc l = new loc();
		try{
			l.citeste("C:\\Users\\aurelian96\\Desktop\\aplicatie.txt");
		}
		 catch (IOException e)
	    {
	 
	      // do something
	      e.printStackTrace();
	    }
		
        l.afisare();
	}

}
