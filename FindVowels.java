/*3.Write a Java program to find vowels from a string 
 */
package rajasoft.in;

import java.util.Scanner;

public class FindVowels {

	public static void main(String[] args) {
		int vcount=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string :");
String s=sc.nextLine();
s=s.toLowerCase();
for(int i=0;i<s.length();i++){
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		System.out.println(s.charAt(i)+" "+vcount);
		vcount++;
	}
}

	}

}
