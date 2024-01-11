package Strings;

public class Reverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "mahesh seela";
		String reverse="";
		int length = name.length();
		for(int i=length-1;i>=0;i--) {
			reverse = reverse+name.charAt(i);
			
		}
		System.out.print(reverse);

	}

}
