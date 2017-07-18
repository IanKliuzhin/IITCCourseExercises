import java.util.Scanner;

public class IndexInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество элементов в массиве: ");
		length = scanner.nextInt();
		int[] numbers = new int[length];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Количество оставшихся элементов: " + (length - i) + ". Введите следующий: ");
			numbers[i] = scanner.nextInt();
			System.out.print("Массив: ");
			for (int j = 0; j <= i; j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
		}
		int unknown, unknownIndex = -1;
		System.out.print("Введите значение элемента, индекс которого необходимо вывести: ");
		unknown = scanner.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == unknown) {
				unknownIndex = i;
			}
		}
		if (unknownIndex == -1) {
			System.out.println("Искомый элемент не найден в массиве.");
		} else {
			System.out.println("Индекс искомого элемента: " + unknownIndex);
		}
	}

}
