

package com.mycompany.exceptionhandling;


public class ExceptionHandling 
{

    public static void main(String[] args) 
    {
        try
        {
//            int n=100;
//            int div = n/0;//ArithmeticException
            
//            String s=null;  
//            System.out.println(s.length());//NullPointerException 
            
//            String s="monika";  
//            int i=Integer.parseInt(s);//NumberFormatException
             int a[]=new int[5];  
             a[5]=50/0; //ArrayIndexOutOfBoundsException  
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
