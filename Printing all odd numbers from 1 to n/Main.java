import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=1;
      for(num=1;num<=n;num=num+1)
      { if(num%2==1)
            System.out.println(num);
      }
	}
}