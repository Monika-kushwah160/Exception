
package com.mycompany.exceptionhandling;


public class nestedTryBlock 
{
    public static void main(String args[]){   
     
     try
     {    
         try
        {    
           
          int n =40/0;    
        }  
      
        catch(ArithmeticException e)  
        {  
          System.out.println(e);  
        }    
         
        try
        {    
          int arr[]=new int[10];    
          arr[10]=4;    
        }  
        catch(ArrayIndexOutOfBoundsException e)  
        {  
           System.out.println(e);  
        }    
  
      
       
  }  
  
  catch(Exception e)  
  {  
    System.out.println("handled the other exception ");  
  }    
    
   
 }    

    
}
