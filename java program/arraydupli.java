package test;

public class arraydupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="hello how are you";
		boolean b[]=new boolean[256];
		for(int i=0;i<=st.length();i++)
		{
			if(b[st.charAt(i)])
			{		b[st.charAt(i)]=false;}
		
			b[st.charAt(i)]=true;
		
		}
		for(int i=0;i<256;i++)
		{
			System.out.println(b[i]);
		}
	}

}
