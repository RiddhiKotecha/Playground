import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=n1/100;
     int n3=n1%10; 
     int n4=(n1/10)%10;
    int n5=n3*100+n4*10+n2*1;
    System.out.println(n5);
}
}