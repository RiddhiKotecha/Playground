import java.util.Scanner;
class Main
{
  
  public static int square(int a)
  {
    int sq=a*a;
  return sq;
  }
  
  public static void main (String[] args)
    {
	 // Type your code here 
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    System.out.println(square(num));
    
	} 
}