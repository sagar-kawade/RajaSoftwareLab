/*1.Write a Java program to convert a hexadecimal to a binary number
*/
package rajasoft.in;

import java.util.Scanner;

public class HexaToBinary {
	public static int hextodec(String s){
		String digit="0123456789ABCDEF";
		s=s.toUpperCase();
		int val=0;
for (int i = 0; i < s.length(); i++) {
	char c=s.charAt(i);
int d=digit.indexOf(c);
val=16*val+d;

}		
return val;
	}

	public static void main(String[] args) {
String hex_num;
int dec_num,i=1,j;
int bin_num []=new int [100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hex number:");

		hex_num=sc.nextLine();
		dec_num=hextodec(hex_num);
		while(dec_num!=0){
			bin_num[i++]=dec_num%2;
			dec_num=dec_num/2;
		}
		for(j=i-1;j>0;j--){
			System.out.print(bin_num[j]);
		}
		System.out.print("\n");
	}

}
