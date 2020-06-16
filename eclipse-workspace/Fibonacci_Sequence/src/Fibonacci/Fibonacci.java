package Fibonacci;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Fibonacci {
   
   
   public static void main(String[] args) throws NumberFormatException, IOException {   
      long total=0;                                                                           //total��
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //ó���ð��� ���� ���۸����� �Է��� ����
      HashMap<Long,Long> dp = new HashMap<Long,Long>();               //�Ϲ� ��� ����� ������������� ȿ���� ���� HashMap���(������ȹ��),�޸������̼�
      String str1 = "Which Fibonacci number would you like? ";
      while(true) {
         System.out.print(str1);
         long num=Integer.parseInt(br.readLine());
            if(num<0||num>=70) {               //���������� �������� 70����
            System.out.print(str1);
            num=Integer.parseInt(br.readLine());
            }else {                                 
               
                  //total=fibo(num);                  //�Ǻ���ġ �Լ� ȣ���ؼ� total���� ����.
               
               
               total = DP_fibo(num,dp);
               //total =DP_fibo2(num);
                  System.out.println(num+" : "+total);
               }
      }

   }
   public static int fibo(int n)
   {
   
      if(n<=1)
         return n;
      else {
         return fibo(n-1) + fibo(n-2);
      }
      
               // ū���� �Է¹޾����� ó���ð��� �����(���)

   }
   public static long DP_fibo(Long n,HashMap<Long,Long>dp)
   {
      if(dp.containsKey(n))
      {
         return dp.get(n);      
      }else if(n==0)
      {
         return 0;
      }else if(n<=2) {
         return 1;
      }else {
    	  long value =DP_fibo(n-1,dp)+DP_fibo(n-2,dp);
         dp.put( n,  value);
         return  value;
      }
   }                  //�Է°��� 47�� �Ǹ� ���� ���
   
   
   public static int DP_fibo2(int n)
   {
      int last1,last2,result=0;
      
      
      if(n<=1)
         return 1;
      
      last1=1;
      last2=1;
      
      for(int i=1;i<n;i++)
      {
         result = last1+last2;
         last1=last2;
         last2=result;
      }
      return result;
   }

}