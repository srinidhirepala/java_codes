1.Create a class called Invoice that a hardware store might use to represent an invoice for an item sold  at  the  store.  An  Invoice  should  include  four  pieces  of  information  as  instance variables-a part number(type String),a part description(type String),a quantity of the item being purchased (type int) and a price per item (double). Your class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoiceAmount that calculates the invoice amount.

import java.util.*;
class Invoice
{
  String Number;
 String Description;
 int Quantity;
double price;

  Invoice()
{
         Scanner sc = new Scanner(System.in);
	 Number=sc.nextLine();
	 Description=sc.nextLine();
 	 Quantity=sc.nextInt();
	 price=sc.nexDouble();
}

  
 void getInvoiceAmount()
    {

      System.out.println(quantity*price);
  
 public static void main(String s[])
 {
      Invoice in= new Invoice(Motor,It is used in water pumps,and in case of generators, 3,4500);
      in.getInvoiceAmount();
}

       

