package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.print("Sex: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.print("Amount of beer: ");
		bill.beer = sc.nextInt();
		
		System.out.print("Amount of Soft Drink: ");
		bill.softDrink = sc.nextInt();
		
		System.out.print("Amount of Barbecue: ");
		bill.barbecue = sc.nextInt();

		System.out.println();
		System.out.println("REPORT: ");
		System.out.printf("Feeding = R$ %.2f%n", bill.feeding());
		
		if (bill.feeding() < 30.00) {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
		} else {
			System.out.println("Exempt from cover charge!");
		}
		
		System.out.printf("Ticket = R$ %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Amount to pay = R$ %.2f%n", bill.total());

		sc.close();
	}

}