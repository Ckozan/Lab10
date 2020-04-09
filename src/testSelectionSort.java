
/* * testSelectionSort.java ** To change this template, choose Tools | Template Manager * and open the template in the editor. */
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	
	@Test
	public void test() {
		testPositive();
		testNegative();
		testZeros();
		testDuplicates();
	}

	public testSelectionSort() {
	}

	public void testPositive() {
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/
		SelectionSort sort = new SelectionSort();
		int[] newArray = sort.basicSelectionSort(arr);
		
		assertTrue(Arrays.equals(newArray, Sortedarr));
	}

	public void testNegative() {
		/** Test data contains negative values only **/
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = -9;
		arr[2] = -7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -10;
		Sortedarr[1] = -9;
		Sortedarr[2] = -8;
		Sortedarr[3] = -7;
		Sortedarr[4] = -2;
		/** add tests to check for this unit test **/
		SelectionSort sort = new SelectionSort();
		int[] newArray = sort.basicSelectionSort(arr);
		
		assertTrue(Arrays.equals(newArray, Sortedarr));
		
	}
	public void testZeros() {
		/** Test data contains zero values only **/
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 0;
		arr[2] = 9;
		arr[3] = 2;
		arr[4] = 1;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 0;
		Sortedarr[1] = 1;
		Sortedarr[2] = 2;
		Sortedarr[3] = 5;
		Sortedarr[4] = 9;
		/** add tests to check for this unit test **/
		SelectionSort sort = new SelectionSort();
		int[] newArray = sort.basicSelectionSort(arr);
		
		assertTrue(Arrays.equals(newArray, Sortedarr));
	}

	public void testMixed() {
		/** Test data contains with both positive, negative and zeros **/
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 7;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -8;
		Sortedarr[1] = -2;
		Sortedarr[2] = 0;
		Sortedarr[3] = 1;
		Sortedarr[4] = 7;
		/** add tests to check for this unit test **/
		SelectionSort sort = new SelectionSort();
		int[] newArray = sort.basicSelectionSort(arr);
		
		assertTrue(Arrays.equals(newArray, Sortedarr));
	}

	public void testDuplicates() {
		/** Test data contains duplicates **/
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 8;
		Sortedarr[2] = 10;
		Sortedarr[3] = 10;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/
		SelectionSort sort = new SelectionSort();
		int[] newArray = sort.basicSelectionSort(arr);
		
		assertTrue(Arrays.equals(newArray, Sortedarr));
	}
}