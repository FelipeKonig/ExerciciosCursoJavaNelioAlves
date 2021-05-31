package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = sc.nextLine();
		
		System.out.println("Note 1:");
		Double n1 = sc.nextDouble();
		
		System.out.println("Note 2:");
		Double n2 = sc.nextDouble();
		
		System.out.println("Note 3:");
		Double n3 = sc.nextDouble();
		
		System.out.println("Note 4:");
		Double n4 = sc.nextDouble();
		
		Student student = new Student(name, n1, n2, n3, n4);
		
		student.calculateMedia();
		
		System.out.println(student);
		

	}

}
