package no16;

import java.util.Scanner;

public class Menu {

	public double subTotal;
	public static double runningTotal;
	private static double itemPrice;
	static boolean ordering = true;
	static Scanner input = new Scanner(System.in);
	static long tax = (long) 0.15;
	public static int n = 0;

	public static void menu() {
		System.out.println("Menu: ");
		System.out.println("1 Tuna Sandwich (mengandung ikan) = 43k");
		System.out.println("2 Spagheti Carbonara \t = 50k");
		System.out.println("3 Tea pitcher \t\t = 30k");
		System.out.println("4 Pizza \t\t = 70k");
		System.out.println("5 Salad \t\t = 30k");
		System.out.println("6 Exit" );
	}

	public static double itemPrice(int foodItem) {
		if (foodItem == 1) {
			System.out.println("Order Tuna");
			itemPrice = 43000;
		}
		if (foodItem == 2) {
			System.out.println("Spaghetti Carbonara");
			itemPrice = 50000;
		}
		if (foodItem == 3) {
			System.out.println("Order Tea");
			itemPrice = 30000;
		}
		if (foodItem == 4) {
			System.out.println("Order Pizza");
			itemPrice = 70000;
		}
		if (foodItem == 5) {
			System.out.println("Order Salad");
			itemPrice = 30000;
		}
		quantity();
		return itemPrice;
	}

	public static double quantity() {
		System.out.println("Pesan berapa: ");
		double quantity = input.nextDouble();
		subTotal(quantity, itemPrice);
		return quantity;
	}

	public static double subTotal(double quantity, double itemPrice) {
		double subTotal = quantity * itemPrice;
		System.out.println("Subtotal: " + subTotal);
		return subTotal;
	}

	public static void done(double runningTotal) {
		ordering = false;
		System.out.println(runningTotal);
		
		long countTax = (long) (runningTotal*0.15);
		
		System.out.println("Total bayar = "+(countTax+runningTotal));
		
		if (n>0) {
			int pay = (int) ((countTax+runningTotal)/3);
			System.out.println("Jumlah patungan: "+pay);
		}else if (n==0) {
			int pay = (int) ((countTax+runningTotal)/4);
			System.out.println("Jumlah patungan: "+pay);
		}
	}
	

	public static void main(String[] args) {

		int menuOption;
		int foodItem = 0;
		input = new Scanner(System.in);
		double runningTotal = 0;
		do {
			menu();
			menuOption = input.nextInt();
			switch (menuOption) {
			case 1:
				foodItem = 1;
				runningTotal += itemPrice(foodItem);
				n +=1;
				break;
			case 2:
				foodItem = 2;
				runningTotal += itemPrice(foodItem);
				break;
			case 3:
				foodItem = 3;
				runningTotal += itemPrice(foodItem);
				break;
			case 4:
				foodItem = 3;
				runningTotal += itemPrice(foodItem);
				break;
			case 5:
				foodItem = 3;
				runningTotal += itemPrice(foodItem);
				break;
			case 6:
				done(runningTotal);
				 
				break;
			default:
				System.out.println("Invalid.");
			}
		} while (ordering);
		//System.out.println("Total : " + runningTotal);

	}

}
