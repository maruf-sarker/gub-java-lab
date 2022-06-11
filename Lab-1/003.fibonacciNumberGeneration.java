/* Name			        		: Md. Maruf Sarker
 * Program			       	: BSC in CSE
 * Section			      	: 221 D4
 * Instructor		      	: Humayun Kabir Rana
 * Date					        : 11-6-22
 * problem name			    : Fibonacci number generation code in java 
 * problem description	: Fibonacci number generation code in java 
 */

import java.util.Scanner;
public class Maruf Page | 3{
  public static void main(String[] args){
    int n, a = 0, b = 0, c = 1;
    Scanner s = new Scanner(System.in);
    // take input from user
    System.out.print("Enter value of n = ");
    n = s.nextInt();
    System.out.print("Fibonacci Series = ");

    for(int i = 1; i <= n; i++){
      a = b;
      b = c;
      c = a + b;
      System.out.print(a+" ");
    }
  }
}