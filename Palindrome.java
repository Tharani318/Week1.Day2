package assignments.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="madam";
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			
			}
			if(a.equals(rev)) {
				System.out.println(a+" is a palindrome");
			}
			else {
				System.out.println(a+" is not a palindrome");
			}
	}

}
