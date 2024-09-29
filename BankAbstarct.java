//9.Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and  'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'

import java.util.*;

abstract class Bank
{
 abstract double getbalance();
}

BankA extends Bank{
 double balance = 100;
double getbalance()
{
  return balance;
}
BankB extends Bank{
 double balance = 150;
double getbalance()
{
  return balance;
}

BankC extends Bank{
 double balance = 200;
double getbalance()
{
  return balance;
}
}
 class BankAbstract
{
  public static void main(String s[])
{
BankA a = new BankA();
System.out.println("Balance in Bank A is $"+a.getbalance());

BankB b = new BankB();
System.out.println("Balance in Bank B is $"+b.getbalance());

BankC c = new BankC();
System.out.println("Balance in Bank C is $"+c.getbalance());
  }
}
