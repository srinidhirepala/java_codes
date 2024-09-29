6.Write a java program to find whether given sentence is Pangram or not. If it is pangram, then print 1 else print -1.A pangram is a sentence containing every letter in the English Alphabet. Ex: The quick brown fox jumps over the lazy Dog.

import java.util.*;
class pangram
{
 public static void main(String s[])
  {
     Scanner sc = new Scanner(System.in);
    String str = sc.next();
      String str1= str.toLowerCase();
   int a[] = new int[26];
for(i=0;i<26;i++)
{
  a[i]=0;
}
 for(i=0;i.str1.length();i++)
 {
  pos= str.charAt[i]-97;
   a[pos]=1;
  }
}
ispangram=1;
for(i=0;i<26;i++)
{
 if(a[i]==1)
  continue;
else
   ispangram=0;
}
if(ispangram==1)
 System.out.println("pangram");
else
System.out.println("Not a pangram");
}



    
  