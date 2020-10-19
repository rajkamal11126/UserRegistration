import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name");
		String fname = scan.nextLine();
		String regex1 = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(fname);
		System.out.println(matcher1.matches());
		
		System.out.println("Enter Last name");
		String lname = scan.nextLine();
		String regex2 = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(lname);
		System.out.println(matcher2.matches());
		
		System.out.println("Enter email id");
		String email = scan.nextLine();
		String regex3 = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher(email);
		System.out.println(matcher3.matches());
		
		System.out.println("Enter Phone number");
		String pnum = scan.nextLine();
		String regex4 = "^[+][9][1][ ][0-9]{10}$";
		Pattern pattern4 = Pattern.compile(regex4);
		Matcher matcher4 = pattern4.matcher(pnum);
		System.out.println(matcher4.matches());
		
		System.out.println("Enter password exactly 1 special case");
		String password = scan.nextLine();
		String regex = "^(?=.*[0-9])" + "(?=.*[@#$%]{1})" + "(?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		System.out.println(matcher.matches());
	}

}
