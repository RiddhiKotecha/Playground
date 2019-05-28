import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int base=sc.nextInt();
      int exponential=sc.nextInt();
      int result=1,count=0;
      while(count<exponential)
      {
         result=result*base;
         count++;
      }
      System.out.println(result);
    }
}