package com.greatlearning.mergesort;

public class SortPrice {

	public void sortArrayAscending(double sharePrice[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sortArrayAscending(sharePrice, left, mid);
			sortArrayAscending(sharePrice, mid + 1, right);
			mergeAscending(sharePrice, left, mid, right);
		}

	}

	public void mergeAscending(double[] sharePrice, int left, int mid, int right) {

		double n1 = mid - left + 1;
		double n2 = right - mid;
		double L[] = new double[(int) n1];
		double R[] = new double[(int) n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = sharePrice[left + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = sharePrice[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				sharePrice[k] = L[i];
				i++;
			} else {
				sharePrice[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			sharePrice[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			sharePrice[k] = R[j];
			j++;
			k++;
		}

	}

	public void sortArrayDescending(double sharePrice[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sortArrayDescending(sharePrice, left, mid);
			sortArrayDescending(sharePrice, mid + 1, right);
			mergeDescending(sharePrice, left, mid, right);
		}
	}

	public void mergeDescending(double[] sharePrice, int left, int mid, int right) {

		double n1 = mid - left + 1;
		double n2 = right - mid;
		double L[] = new double[(int) n1];
		double R[] = new double[(int) n2];

		for (int i = 0; i < n1; ++i) {
			L[i] = sharePrice[left + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = sharePrice[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (L[i] >= R[j]) {
				sharePrice[k] = L[i];
				i++;
			} else {
				sharePrice[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			sharePrice[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			sharePrice[k] = R[j];
			j++;
			k++;
		}

	}

}
