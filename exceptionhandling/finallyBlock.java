
package com.mycompany.exceptionhandling;


public class finallyBlock 
{
    public static void main(String[] args) {
       try
       { 
           int n = 50/10;
        System.out.println(n);
        int m = 20/0;
    
       }
       catch(NullPointerException e)
       {
           System.out.println(e);
       }
       catch(ArithmeticException e)
       {
           System.out.println(e);
       }
       finally
       {
           System.out.println("this is final block,its always excuted");
       }
    }
}
