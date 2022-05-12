package Week1.BOJ2048;

import java.util.Random;

public class Main {
   public static void main(String[] args) {
   
      Random ran =new Random();
      
      int num1=0;
      int num2=0;
      int num3=0;
      boolean result1=false;
      boolean result2=false;
      boolean result3=false;
      boolean result4=false;
      int big=0;
      
      num1=ran.nextInt(6)+1;
      num2=ran.nextInt(6)+1;
      num3=ran.nextInt(6)+1;
   
      result1=(num1==num2)&&(num1==num3);
      result2=(num1==num2)||(num1==num3)||(num2==num3);
      result3=(num2==num3);
      result4=(num1!=num2)&&(num1!=num3);
      if(result1==true) {
         System.out.println(10000+num1*1000);
      }else if(result2==true) {
         System.out.println(1000+num1*100);
      }else if(result3==true) {
         System.out.println(1000+num2*100);
      }else if(result4==true) {
         big = (num1>num2)&&(num1>num3)?num1:(num3>num2?num3:num2);
         System.out.println(big*100);
      }
   }
}
