import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int primesAmount = 0, N, divisorAmmount = 0;
Scanner scanner = new Scanner(System.in);
System.out.print("Введите N > 2: ");
N = scanner.nextInt();

for (int i = 2; i <= N; i++) {
	for (int j = 1; j <= i; j++) {
		if (i % j == 0) {
			divisorAmmount++;
		}
	}
	if (divisorAmmount == 2) {
		primesAmount++;
	}
	divisorAmmount = 0;
}
System.out.println("Количество простых чисел от 2 до N: " + primesAmount);
	}

}
