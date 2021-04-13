/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    bank obj=new bank();
	    obj.show();
	}
}

class bank{
    int balance,amount,pretrans,option=0;
    
    public void deposit(int amount){
        
        balance=balance+amount;
        pretrans=amount;
    }
    
    public void withdraw(int amount){
         
        balance=balance-amount;
        pretrans=-amount;
    }
    
    public void previous(){
        if(pretrans>0)
        {
           System.out.println("AMOUNT DEPOSIT IN ACCOUNT ="+pretrans); 
        }
       else if(pretrans<0)
        {
           System.out.println("AMOUNT WITHDRAWAL IN ACCOUNT ="+pretrans); 
        }
        else
        {
            System.out.println("NO TRANSACTION DONE");
        }
    }
    
    public void getintrest(int year){
         
        double interest=(balance*1.5*year)/100;
        double newbal=balance+interest;
         System.out.println("\nINTEREST FOR " +year+ " is  "+interest);
         System.out.println("AMOUNT AFTER INTEREST="+newbal);
    }
 
    public void show(){
        do{
        System.out.println("\n****WELCOME****");
        System.out.println("");
        System.out.println("1. CHECK YOUR BALANCE");
        System.out.println("2. MAKE A DEPOSIT");
        System.out.println("3. MAKE A WITHDRAWAL");
        System.out.println("4. VIEW PREVIOUS TRANSACTION");
        System.out.println("5. CALCULATE INTEREST");
        System.out.println("6. EXIT THE APPLICATION");
       
       Scanner op=new Scanner(System.in);
        System.out.println("\n********************************");
        System.out.println("\nENTER OPTION YOU WANT TO CHOOSE:");
        int option=op.nextInt();
        
         switch(option){
            case 1:
                System.out.println("\nBALANCE IN YOUR ACCOUNT="+balance);
                break;
            case 2:
                System.out.println("ENTER A AMOUNT TO DEPOSIT :");
                int d=op.nextInt();
                deposit(d);
                System.out.println();
                break;
            case 3:
                System.out.println("ENTER A AMOUNT TO WITHDRAWAL :");
                int w=op.nextInt();
                withdraw(w);
                System.out.println();
                break;
            case 4:
                previous();
                System.out.println();
                break;
            case 5:
                System.out.println("ENTER NUMBER OF YEAR TO CALCULATE INTEREST :");
                int y=op.nextInt();
                getintrest(y); 
                System.out.println();
                break;
            case 6:
                System.out.println("\nTHANK YOU FOR BANKING WITH US!!!");
                System.out.println();
                System.exit(0);
                break;
            default:
                System.out.println("\nWRONG INPUT");
                System.out.println();
                break;
        }}while(option<=6);
    }
}





