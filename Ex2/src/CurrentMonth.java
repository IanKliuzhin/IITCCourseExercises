import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today;
		today = new Date();
		SimpleDateFormat sdfMMMM;
		sdfMMMM = new SimpleDateFormat("MMMM");
		String season = "";
		if (sdfMMMM.format(today).equals("Декабрь") | sdfMMMM.format(today).equals("Январь") | sdfMMMM.format(today).equals("Февраль")) {
			season = "зима";
		} else {
			if (sdfMMMM.format(today).equals("Март") | sdfMMMM.format(today).equals("Апрель") | sdfMMMM.format(today).equals("Май")) {
				season = "весна";
			} else {
				if (sdfMMMM.format(today).equals("Июнь") | sdfMMMM.format(today).equals("Июль") | sdfMMMM.format(today).equals("Август")) {
					season = "лето";
				} else {
					if (sdfMMMM.format(today).equals("Сентябрь") | sdfMMMM.format(today).equals("Октябрь") | sdfMMMM.format(today).equals("Ноябрь")) {
					season = "осень";
				}
				}
					}
						}
		System.out.println(today);
		System.out.println("Текущий месяц – " + sdfMMMM.format(today) + ". Время года: " + season);
	}
}
