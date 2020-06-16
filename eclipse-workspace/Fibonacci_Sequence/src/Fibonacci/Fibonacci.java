package Fibonacci;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class Fibonacci {
   
   
   public static void main(String[] args) throws NumberFormatException, IOException {   
      long total=0;                                                                           //total값
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //처리시간을 위해 버퍼리더로 입력을 받음
      HashMap<Long,Long> dp = new HashMap<Long,Long>();               //일반 재귀 방식을 사용했을때보다 효율이 좋아 HashMap사용(동적계획법),메모이제이션
      String str1 = "Which Fibonacci number would you like? ";
      while(true) {
         System.out.print(str1);
         long num=Integer.parseInt(br.readLine());
            if(num<0||num>=70) {               //양의정수와 양의정수 70제한
            System.out.print(str1);
            num=Integer.parseInt(br.readLine());
            }else {                                 
               
                  //total=fibo(num);                  //피보나치 함수 호출해서 total값에 저장.
               
               
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
      
               // 큰값을 입력받았을때 처리시간이 길어짐(재귀)

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
   }                  //입력값이 47이 되면 음수 출력
   
   
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