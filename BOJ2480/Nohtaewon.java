import java.util.Scanner;

public class Nohtaewon {
   public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  int num1, num2, num3;
	  num1=sc.nextInt(); num2=sc.nextInt(); num3=sc.nextInt();
	  if(num1==num2&&num2==num3) {
		  System.out.println(10000+num1*1000);
	  }else if(num1==num2||num3==num1) {
		  System.out.println(1000+num1*100);
	  }else if(num2==num3) {
		  System.out.println(1000+num2*100);
	  }else {
		  System.out.println(Math.max(num1, Math.max(num2, num3))*100);
	  }  
	  sc.close();
   }
}
