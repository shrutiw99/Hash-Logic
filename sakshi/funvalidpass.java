package practice;

public class funvalidpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pass("asdaseyh32dsfgh");
	}

	public static void pass(String pas)
	{
		
		int countn=0;
		int countc=0;
		int ch=0;
		int len=pas.length();
		System.out.println(len);
		if(len>=10)
		{
			ch=1;
			
		}
		if(ch==1)
		{
			ch=0;
			
			for(int i=0;i<len;i++)
			{
					
			if(pas.charAt(i)>='a'&&pas.charAt(i)<='z') 
			{
				ch=1;
				countc++;
			}
			}
			
		}
		
		if(ch==1)
		{
			ch=0;
			
			for(int i=0;i<len;i++)
			{
					
			if(pas.charAt(i)>='0'&&pas.charAt(i)<='9') 
			{
				ch=1;
				countn++;
			}
			}
			
		}
		
		
			
			System.out.println(ch);	
			System.out.println(countn);	
			System.out.println(countc);	
				
		if(countc>=8 &&countn>=2 &&ch==1)
		{
			System.out.println("password is valid");
		}
		else
		{
			System.out.println("password is not valid");
		}
			
		}
		
	}

