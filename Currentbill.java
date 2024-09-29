//2.Develop a Java application to generate Electricity bill. Create a class with the following  members:  Consumer  no.,  consumer  name,  previous  month  reading, current month reading, and type of EB connection (i.e. domestic or commercial). Compute the bill amount using the user defined tariff.

import java.util.*;
class Currentbill
{
String Consumerno;
String Consumername;
double Previousreading;
double Currentreading;
String Connectiontype;
Currentbill()
{
Scanner sc=new Scanner(System.in);
        ConsumerNo=sc.nextLine();
        ConsumerName=sc.next();
        currentreading=sc.nextDouble();
        previousreading=sc.nextDouble();
        connectiontype=sc.next();
    }
    void display()
    {
        System.out.println("Consumer number: "+ConsumerNo);
        System.out.println("Consumer name: "+ConsumerName);
        System.out.println("Current reading: "+currentreading);
        System.out.println("previous reading: "+previousreading);
        System.out.println("Connection type: "+connectiontype);
    }
    void bill()
    {
      double domestic=5.0;
      double commercial=8.0;
      double units=currentreading-previousreading;
      if(connectiontype.equals("domestic"))
      {

        System.out.println(units*domestic);
      }
      else if(connectiontype.equals("commercial"))
      {
        System.out.println(units*commercial);
      }
      else{
        System.out.println("wrong connection");
      }

    }

    public static void main(String s[])
    {

      currentbill b=new currentbill();
      b.display();
      b.bill();
    }
}


    
