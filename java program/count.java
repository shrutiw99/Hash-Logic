package test;

public class count {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String ss="sakshijuly90@gmail.com is my gmailid";
		ss=ss.toLowerCase();
		int countl=0,countn=0,counts=0,countc=0;
		for(int i=0;i<ss.length();i++)
		{
			if(ss.charAt(i)>='a'&&ss.charAt(i)<='z')
			{
				countl++;
			}
			else if(ss.charAt(i)>='0'&&ss.charAt(i)<='9')
			{
				countn++;
			}
			else if(ss.charAt(i)==' ')
			{
				counts++;
			}
			else
			{
				countc++;
			}
		}
		System.out.println("letters:"+countl);
		System.out.println("numbers:"+countn);
		System.out.println("spaces:"+counts);
		System.out.println("special character:"+countc);
	}

}
