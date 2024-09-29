//12.	Write a Java program that perform integer divisions. The user enters two numbers, Num1 and Num2. The division of Num1 and Num 2 is displayed in the Result. If Num1 or Num2 were not an integer, the program would throw a Number Format Exception. If Num2 were Zero, the program would throw an Arithmetic Exception


Source code

import java.util.*;

class Exceptions
{
  public static void main(String s[])
 {
   Scanner sc = new Scanner(System.in);
   int a,b,c;
   
try
{
 a=Integer.parseInt(sc.next());
 b=Integer.parseInt(sc.next());
 c=a/b;
System.out.println("The Divison Result is:"+c);
}
catch(ArithmeticException e1)
{
  b=1;
  c=a/b;
  System.out.println("B value is zero so the result is"+c);
}
catch(NumberFormatException e2)
{
  System.out.println("A or B is not an integer");
}
}

