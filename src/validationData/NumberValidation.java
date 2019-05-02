package validationData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
	Scanner s=new Scanner(System.in);
  public void numVali(){
	  boolean flag=true;
	  System.out.println("Enter adhar number");
		String ano = s.nextLine();

		Pattern compile = Pattern.compile("[0-9]{4}\\p{Punct}[0-9]{4}\\p{Punct}[0-9]{4}");
		Matcher matcher = compile.matcher(ano);
		boolean matches = matcher.matches();
		if (matches) {
			System.out.println("Adhar number is valid");
			flag = false;
		}

		else {
			System.out
					.println("Adhar number is invalid, please enter a valid adhar number in 0000-0000-0000 format");
		}
	     
  }
}
