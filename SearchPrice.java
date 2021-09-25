package com.greatlearning.search;

public class SearchPrice {
	public void searchValue(double[] sharePrice, int left, int right, double searchKey) {
		left = 0;
		right = sharePrice.length - 1;
		int mid = left + (right - left) / 2;
		
			while (left <= right) {

				if (searchKey < sharePrice[mid]) {
					// range is l to mid-1
					right = mid - 1;
				} else if (searchKey > sharePrice[mid]) {
					// range is mid+1 to r
					left = mid + 1;
				} else {
					System.out.println("Stock of value " + searchKey + " is present");
					break;
				}
				mid = left + (right - left) / 2;
			}
			if (left > right) {
				System.out.println("Value not found");
			}
		} 
	}