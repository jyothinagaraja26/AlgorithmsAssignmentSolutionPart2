package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.compairprice.ComparePrice;
import com.greatlearning.mergesort.SortPrice;
import com.greatlearning.search.SearchPrice;

public class Driver {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			SortPrice sortprice = new SortPrice();
			ComparePrice compareprice = new ComparePrice();
			SearchPrice searchprice = new SearchPrice();

			System.out.println("Enter the number of companies");
			int numberOfCompanies = sc.nextInt();

			// Two arrays to store values
			double[] sharePrice = new double[numberOfCompanies];
			boolean[] comparedSharePrice = new boolean[numberOfCompanies];

			// Creating objects for company stock price and comparison
			for (int i = 0; i < numberOfCompanies; i++) {
				System.out.println("Enter current stock price of the company: " + (i + 1));
				sharePrice[i] = sc.nextDouble();

				System.out.println("Whether company's stock price rose today compare to yesterday?");
				comparedSharePrice[i] = sc.nextBoolean();
			}
			while (true) {
				System.out.println("\n---------------------------------------------");
				System.out.println("Enter the operation that you want to perform\n"
						+ "1.Display the companies stock prices in ascending order\n"
						+ "2.Display the companies stock prices in descending order\n"
						+ "3.Display the total no of companies for which stock prices rose today\n"
						+ "4.Display the total no of companies for which stock prices declined today\n"
						+ "5.Search a specific stock price\n" 
						+ "6.press 0 to exit");
				System.out.println("---------------------------------------------\n");
				int operation = sc.nextInt();
				switch (operation) {
				case 0:
					System.out.println("Exited succesfully");
					System.exit(0);

				case 1:
					System.out.println("Stock prices in ascending order are: ");
					sortprice.sortArrayAscending(sharePrice, 0, sharePrice.length - 1);
					for (int k1 = 0; k1 < sharePrice.length; k1++) {
						System.out.println(sharePrice[k1]);
					}
					break;
				case 2:
					System.out.println("Stock prices in descending order are: ");
					sortprice.sortArrayDescending(sharePrice, 0, sharePrice.length - 1);
					for (int k1 = 0; k1 < sharePrice.length; k1++) {
						System.out.println(sharePrice[k1]);
					}
					break;
				case 3:
					System.out.println("Total no of companies whose stock price rose today:");
					compareprice.compareStockRose(comparedSharePrice);
					break;
				case 4:
					System.out.println("Total no of companies whose stock price declined today: ");
					compareprice.compareStockDecline(comparedSharePrice);

					break;
				case 5:
					System.out.println("Enter the key value");
					sortprice.sortArrayAscending(sharePrice, 0, sharePrice.length - 1);
					double searchKey = sc.nextDouble();
					searchprice.searchValue(sharePrice, 0, sharePrice.length - 1, searchKey);
					break;
				default:
					System.out.println("Please enter valid option");
				}
			}
		} catch (Exception e) {
			System.out.println(e + " Invalid input -Program Exited");
		}
	}
}
