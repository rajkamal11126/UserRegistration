import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password atleast 1 numeric case");
		String password = scan.nextLine();
		String regex = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		System.out.println(matcher.matches());
	}

}
