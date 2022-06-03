
import java.util.*;

public class HelloWorld {
	public static void main (String[] args) {
		int balance=15001,withdraw,deposite;
		while (true) {
			System.out.println("Welcome To Vasu ATM Center: ");
			System.out.println("Press 1 For Balance Check: ");
			System.out.println("Press 2 For Deposite: ");
			System.out.println("Press 3 For With Draw: ");
			System.out.println("Press 4 For Help: ");
			System.out.println("Press 5 For Exit: ");
			System.out.println("");
	    Scanner Input=new Scanner(System.in);
	    System.out.println("Enter Here :");
	    int choice=Input.nextInt();
	    switch(choice)
	    {
	    case 1:
	    	System.out.println("Your Balance is :"+balance);
	    	System.out.println("");
	    	break;
	    case 2:
	    	System.out.println("Enter Deposite Amount :");
	    	
	    	 deposite=Input.nextInt();
	    	 deposite=deposite;
	    	 System.out.println("Your Old Amount Is : "+deposite);
	    	 balance=balance+deposite;
	     	System.out.println("Your Amount Is Deposited");
	     	
	    	System.out.println("Your Main Balace Is : "+balance);
	    	System.out.println("");
	    	break;
	  
	    case 3:
	    	System.out.println("Enter WithDraw Amount : ");
	    	System.out.println("Old Balance is :"+ balance);
	    	withdraw=Input.nextInt();
	    	if(withdraw >=balance) {
	    		System.out.println("Insufficient balance  : ");
	    		System.out.println("");
	    		System.out.println("");
	    		break;
	    	}
	    	else{
	    		withdraw=withdraw;
	    		balance=balance-withdraw;
	    		System.out.println("Take Your Money  : "+withdraw);
	    		System.out.println("Remaining Balance Is : "+balance);
	    		System.out.println("");
	    		break;
	    	}
	    case 4:
	    	System.out.println("Contact To Bank xxxxxxxxxx : ");
	    	System.out.println("");
	    	break;
	    	
	    case 5:
	    	System.out.println("Exited ");
	    	System.exit(0);
	    
	    }
	    
		}
	}
}