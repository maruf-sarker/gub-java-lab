/* Name					        : Md. Maruf Sarker
 * Program			      	: BSC in CSE
 * Section			      	: 221 D4
 * Instructor		      	: Humayun Kabir Rana
 * Date					        : 11-6-22
 * problem name		    	: Prime number generation code in java
 * problem description	: Prime number generation code in java
 */

import java.util.Scanner;
public class Maruf{
  public static void main(String args[]){
    // variable initialization
    int num, i, count=0;
    Scanner scan = new Scanner(System.in);
    // take input from user
    System.out.print("Enter a Number = ");
    num = scan.nextInt();

    for(i=2; i<num; i++){
      if(num%i == 0){
        count++;
        break;
      }
    }
    if(count == 0){
      System.out.println("This is a Prime Number");
    }else{
      System.out.println("This is not a Prime Number");
    }
  }
}
