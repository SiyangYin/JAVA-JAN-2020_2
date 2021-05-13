package ExceptionHandling;

import java.util.Scanner;
class NagendraException extends Exception 
{ 
NagendraException(String s) 
 { 
 super(s); 
 } 
} 
class Voting1 
{ 
public static void main(String args[])throws Exception 
 { 
 try 
  { 
	 System.out.println("Enter the Age :");
 int age;
 Scanner s=new Scanner(System.in);
 age=s.nextInt();
 if(age<18) 
  throw new NagendraException("Invalid age to vote"); 
 else 
  System.out.println("Valid age to vote"); 
  } 
  catch(NagendraException e) 
  { 
   System.out.println(e.getMessage()); 
  } 
 } 
} 