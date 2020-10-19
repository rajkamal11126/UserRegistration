import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password should be eight character");
		String password = scan.nextLine();
		String regex = "^[a-zA-Z0-9]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		System.out.println(matcher.matches());
	}

}
