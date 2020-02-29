package rajasoft.in;

import java.util.Scanner;

public class StringIntegerToInteger {
	public static int myStringToInteger(String str) {
	    int answer = 0, factor = 1;
	    for (int i = str.length()-1; i >= 0; i--) {
	        answer += (str.charAt(i) - '0') * factor;
	        factor *= 10;
	    }
	    return answer;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.nextLine();

		
		int i = myStringToInteger(s);
	    System.out.println("String decoded to number " + i);
	  }
	}


