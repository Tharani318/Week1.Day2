package assignments.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count = 0;
		char[] array = str.toCharArray();
		int l = array.length;
		for (int i = 0; i < l; i++) {
			if (array[i] == 'e') {
				count++;
			}
		}
		System.out.println(count);
	}

}
