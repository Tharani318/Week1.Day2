package assignments.day2;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if (i != arr[i - 1]) {
				System.out.println(i);
				break;
			}
		}
	}
}
