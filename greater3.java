 public class greater3{
     public static void main(String arg[]){
         int num1,num2,num3;
         num1=500;
         num2=200;
         num3=300;
         if(num1>num2&&num1>num3){
             System.out.println("num1 is greatest");
         }
         else if(num2>num3){
             System.out.println("num2 is greatest");
         }
         else{
             System.out.println("num3 is greatest");
         }
     }
 }