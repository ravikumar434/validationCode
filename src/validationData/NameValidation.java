package validationData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidation {
	  Scanner s=new Scanner(System.in);
  public void nameValidation(){
	  boolean flag=true;
	  System.out.println("enter adhar name");
		String adhName = s.nextLine();
		Pattern compile1 = Pattern.compile("[A-Za-z\\s]{4,20}");
		Matcher matcher1 = compile1.matcher(adhName);
		boolean matches1 = matcher1.matches();
		if (matches1) {
			System.out.println("adhar name is valid:" + adhName);
			flag = false;
		} else {
			System.out.println("adhar name is invalid");
		}
  }
}
