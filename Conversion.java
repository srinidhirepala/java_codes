10.Develop a java application to inherit currency converter (Dollar to INR, EURO to INR, Yen to INR and vice versa), distance converter (meter to KM, miles to KM and vice versa) , time converter (hours to minutes, seconds and vice versa) from a base class Converter


import java.util.*;
class Converter
 {
     
 }
 class CurrencyConverter extends Converter
{
 void DollartoINR(double dollars)
  {
    System.out.println(dollars+"USD= "+(dollars*80)+"INR");
   }
 void INRtoDollar(double rupees)
  {
    System.out.println(rupess +"INR= "+(rupees/80)+"USD");
   }
}
class TimeCoverter extends Converter
{
 void HourstoMinutes(int hours)
{
  System.out.println(hours+"hours="+(hours*60)+"minutes);
}
void MinutestoHours(int minutes)
{
   System.out.println(minutes+"minutes="+(minutes/60)+"hours");
}
}

class DistanceConverter extends Converter
{
  void KMtoM(double Km)
{
  System.out.println(Km+"Km="+(km*1000)+"metres);
}
 void MtoKM(double m)
{
  System.out.println(m+"m="+(m/1000)+"kilometres);
}
}
class Conversion
{
 public static void main(String s[])
{
  CurrencyConverter c = new CurrencyConverter();
 DistanceConverter d = new DistanceConverter();
 TimeConverter t = new TimeConverter();

  c.DollartoINR(120000);
  c.INRtoDollar(10000);
  t.HourstoMinutes(12);
  t.MinutestoHours(1468);
  d.KMtoM(1345);
  d.MtoKM(178967);



