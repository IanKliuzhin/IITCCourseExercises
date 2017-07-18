import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String fullName, firstName, middleLastName, middleName, lastName;
Scanner scanner = new Scanner(System.in);
System.out.print("Введите ваше полное имя: ");
fullName = scanner.nextLine();
firstName = fullName.substring(0, fullName.indexOf(" "));
middleLastName = fullName.substring(fullName.indexOf(" ") + 1, fullName.length());
middleName = middleLastName.substring(0, middleLastName.indexOf(" "));
lastName = middleLastName.substring(middleLastName.indexOf(" ") + 1, middleLastName.length());
//System.out.println("_" + firstName + "_" + middleName + "_" + lastName + "_");
System.out.println(lastName + ", " + firstName + " " + middleName.substring(0, 1) + ".");
	}

}
