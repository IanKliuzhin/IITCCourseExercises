import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user, attemptCounter = 0;
        // Генерируем случайное целое число от 1 до 10
        do {
        	prog = (int)(Math.random() * 21) - 10;
        } while (prog == -10);
        System.out.println("Я загадала число от -10 до 10 (кроме 0), отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);  
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == prog) {
                	attemptCounter++;
                    System.out.println("Вы угадали!");
                } else {
                    // Проверяем, входит ли число в отрезок [-10;10]\{0}
                    if (user >= -10 && user <= 10 && user != 0) {
                    	attemptCounter++;
                        System.out.print("Вы не угадали! ");
                        if (prog*user < 0) {
                        	if (prog < 0) {
                        		System.out.println("Моё число отрицательное.");
                        	} else {
                        		System.out.println("Моё число положительное.");
                        	}
                        }
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            System.out.println("Моё число меньше.");
                        } else {
                            System.out.println("Моё число больше.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while( user != prog );
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("Количество попыток: " + attemptCounter + ". До свиданья!");
    }
}