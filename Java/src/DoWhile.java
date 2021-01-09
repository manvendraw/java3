import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int abc = 0;
	do {
		System.out.println("Enter a number");
		abc = scanner.nextInt();
	} while (abc != 5);
	System.out.println("Got 5!");
}
}
