11.	Write a Java program that works as a simple calculator. Use a switch statement to accept 2 numbers and an operator for the +, -,*, % operations. Perform arithmetic operation display the result. Handle any possible exceptions like divided by zero for division operation

class Exception1
{
 public static void main(String s[])
  {
    Scanner sc = new Scanner(System.in);
    num1 = sc.nextInt();
    num2= sc.nextInt();
    int num1,num2,result;
    int op;
     switch (operator) {
                case 1:
                    result = num1 + num2;
		    System.out.println("the sum is"+result.");
                    break;
                case 2:
                    result = num1 - num2;
		   System.out.println("the difference is"+result.");
                    break;
                case 3:
                    result = num1 * num2;
		    System.out.println("the product is"+result.");
                    break;
                case 4:
                    try{
                         result=num1/num2;
                         System.out.println("the remainder is"+result.");
			}
 		    catch(ArithmeticException e1)
			{
			  num2=	1;
 			result=num1/num2;
                         System.out.println("num2 cannot be zero"+result.");
         	default:
                    System.out.println("Invalid operator.");
            }
        }
   }

