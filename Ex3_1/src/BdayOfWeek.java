import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BdayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String bday;
SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
Scanner scanner = new Scanner(System.in);
System.out.print("Введите дату рождения в формате YYYY-MM-DD: ");
//bday = scanner.nextLine();
Date bdate = java.sql.Date.valueOf(scanner.nextLine());
System.out.println("День вашего рождения пришёлся на " + sdf.format(bdate));
	}

}
