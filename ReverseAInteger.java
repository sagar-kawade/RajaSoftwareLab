/*2.Write a Java program to reverse a integer number
 *
 */
package rajasoft.in;

import java.util.Scanner;

public class ReverseAInteger {

	public static void main(String[] args) {
		int no;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
no=sc.nextInt();
int rev=0;
while(no!=0){
	rev=rev*10+no%10;
	no=no/10;
}
System.out.print(rev);


	}

}
