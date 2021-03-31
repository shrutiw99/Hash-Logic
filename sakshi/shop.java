package practice;

import java.util.Scanner;

public class shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner ob=new Scanner(System.in);
        System.out.println("enter name:");
        String name=ob.next();
        
        System.out.println("enter address:");
        String add=ob.next();
        
        System.out.println("enter purchase item code:");
        System.out.println("1.L for Lptop");
        System.out.println("2.D for Desktop PC");
         char item=ob.next().charAt(0);
        
        System.out.println("enter amount:");
        long amunt=ob.nextLong();
        
        switch (item)
        {
        
        case 'l':
        case 'L':
        {
        	if(amunt<=25000)
        	{
        		double ddis=(0.0/100)*amunt;
        		double nnet=amunt-ddis;
                System.out.println("name: "+name);
        	    System.out.println("address: "+add);
        	    System.out.println("net amount of "+item+" is "+nnet);
        	}
        	
        	else if( amunt<=57000)
        	{
        		double ddis=(5.0/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
       	   }	
        	
        	else if(amunt<=100000)
        	{
        		double ddis=(7.5/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
       	   }	
        	
        	else 
        	{
        		double ddis=(10.0/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
       	   }	
        		
        			break;
        }
       
        
        
        case'd':
        case'D':
        {
        
        	if(amunt>=25000)
        	{
        		double ddis=(5.0/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
        	}
        	
        	else if(amunt<=57000)
        	{
        		double ddis=(5.0/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
       	   }	
        	
        	else if(amunt<=100000)
        	{
        		double ddis=(7.5/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
       	   }	
        	
        	else
        	{
        		double ddis=(10.0/100)*amunt;
        		double nnet=amunt-ddis;
        		System.out.println("name: "+name);
    	        System.out.println("address: "+add);
    	        System.out.println("net amount of "+item+" is "+nnet);
       	   }	
      
        	break;	
        }
        
        default:
        {
        	System.out.println("it has something error:");
        }
        
        
     }
       
        
	}

}
