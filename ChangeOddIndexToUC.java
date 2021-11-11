package assignments.day2;

public class ChangeOddIndexToUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char arr[] = test.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {

				System.out.println(Character.toUpperCase(arr[i]));

			} else {
				System.out.println(arr[i]);
			}

		}

	}

}
