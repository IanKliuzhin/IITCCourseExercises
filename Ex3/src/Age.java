import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = -1;
		System.out.print("Введите Ваш возраст: ");
		age = scanner.nextInt();
		if (age < 0 | age > 100) {
			System.out.println("Указан неверный возраст.");
		} else if (age < 18 | age > 59) {
				System.out.println("Вы находитесь в непризывном возрасте.");
			} else if (age < 28) {
				System.out.println("Вы подлежите призыву на срочную службу или можете служить по контракту.");
				} else {
					System.out.println("Вы можете служить по контракту.");
				}
	}
}
