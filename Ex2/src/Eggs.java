import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eggs = "я";
		int fullNumber;
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите число: ");
		fullNumber = scanner.nextInt();
		number = fullNumber % 100;
//		System.out.println();
		if (number % 10 == 2 | number % 10 == 3 | number % 10 == 4 && number != 12 && number != 13 && number != 14) {
				eggs += "йца";
			} else if (number % 10 == 1){
				eggs += "йцо";
		} else {
			eggs += "иц";
		}
		System.out.println("У вас " + fullNumber + " " + eggs);
	}
}
