import java.util.Scanner;

public class FirstAndLastCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите строку: ");
		string = scanner.nextLine();
		System.out.println(string.length() + " " + string.substring(0, 1) + " " + string.substring(string.length() - 1, string.length()));
		System.out.println("Символ в середине строки: " + string.substring(string.length() / 2 - 1, string.length() / 2));
	}

}
