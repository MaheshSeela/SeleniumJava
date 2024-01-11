package Strings;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Mahesh Seela";
		char[] reverse = name.toCharArray();
		for(int i=reverse.length-1;i>=0;i--) {
			System.out.print(reverse[i]);
		}
	}

}
