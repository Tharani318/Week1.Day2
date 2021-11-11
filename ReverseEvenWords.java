package assignments.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] str = test.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (i % 2 != 0) {

				 char[] words = str[i].toCharArray();		
				
				for (int j = words.length - 1; j >= 0; j--) {
					System.out.println(words[j]);
				}
			} else {
				System.out.println(str[i]);
			}

		}
	}
}
