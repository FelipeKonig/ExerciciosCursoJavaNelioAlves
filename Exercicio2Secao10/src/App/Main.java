package App;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantity of lines:");
		int lines = new Random().nextInt(9) + 1;
		System.out.println(lines);

		System.out.println("Quantity of columns:");
		int columns = new Random().nextInt(9) + 1;
		System.out.println(columns);

		int mat[][] = new int[lines][columns];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int number = (new Random().nextInt(50)) + 1;
				mat[i][j] = number;
			}
		}

		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 2; i++) {
			int linePosition = new Random().nextInt(lines);
			int columnPosition = new Random().nextInt(columns);

			System.out.println("Position: " + linePosition + "," + columnPosition + ":");

			int top = linePosition - 1;
			int down = linePosition + 1;
			int left = columnPosition - 1;
			int right = columnPosition + 1;

			if (left >= 0 && left < columns) {
				System.out.println("Left: " + mat[linePosition][left]);
			}

			if (right >= 0 && right < columns) {
				System.out.println("Rigth: " + mat[linePosition][right]);
			}

			if (top >= 0 && top < lines) {
				System.out.println("Up: " + mat[top][columnPosition]);
			}

			if (down >= 0 && down < lines) {
				System.out.println("Down: " + mat[down][columnPosition]);
			}
			System.out.println();
		}

		sc.close();
	}

}
