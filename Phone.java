import java.util.Scanner;
import java.util.Random;
abstract class Phonepay
{
static int otp;
static int otp()
 {
	Random t=new Random();
	int n=t.nextInt(8999)+1000;
	otp=n;
	return n;
 }
static Scanner sc=new Scanner(System.in);
abstract void viewBalance(int a);
abstract void toMobile(long Mobileno,float Amount,int upi);
abstract void toBank(long Accountno,String ifc,float Amount,int upi);
}



class Sbi extends Phonepay
{
float balance = 5000.0f;
private long debitcard=12345678;
private int upi=1234;
private int cvv=123;
static int flagsbi=0;

long getdc()
 {
	return debitcard;
 }
int getcvv()
 {
	return cvv;
 } 
void setupi(int upi)
 {
	this.upi=upi;
 }
void viewBalance(int pin)
 {	
	if(pin==upi)//1234
	{
		flagsbi =1;
		System.out.println(balance);
	}
	else
	{
		System.out.println();	
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.println();
		System.out.print("\t PLease Enter correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
			System.out.println("\t ~ ~ ~ ~ you Enter wrong pin ~ ~ ~ ~");
			System.out.println();
			System.out.print("\t Please Enter Correct upi pin: ");
			}
			else
			{
			flagsbi=1;
			System.out.println(balance);
			break;
			}
		}	
	}
	
 } 
void toMobile(long Mobileno,float Amount,int pin)
 {
	if(pin==upi)
	{
		if(Amount<balance)
		{
			flagsbi=1;
			balance=balance-Amount;
			System.out.print(balance);
		}
		else
		{
			flagsbi=1;
			System.out.print(" ? ? ? ? NO MONEY ? ? ? ? ");
		}
	}
	else
	{			System.out.println();

		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.println();
		System.out.print("\t Please Enter correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
				System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
  				System.out.println();
				System.out.print("\t Please Enter Correct upi pin: ");
			}
			else
			{
				flagsbi=1;
				if(Amount<balance)
				{
					balance=balance-Amount;
					System.out.print(balance);
				}
				else
				{
					System.out.print("\t ? ? ? ? NO MONEY ? ? ? ? ");
				}
				break;
			}
		}	
	}

}	

void toBank(long Accountno,String ifc,float Amount,int pin)
 {
	
	if(pin==upi)
	{
		if(Amount<balance)
		{
			flagsbi=1;
			balance=balance-Amount;
			System.out.print(balance);
		}
		else
		{
			flagsbi=1;
			System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ?  ");
		}
	}
	else
	{	
		System.out.println();
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.println();
		System.out.print("\t Please Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
				System.out.println("\t ~ ~ ~ ~ you Enter Wrong Pin ~ ~ ~ ~ ");
 				System.out.println();
				System.out.print("\t Please Enter correct upi pin: ");
			}
			else
			{
				flagsbi=1;
				if(Amount<balance)
				{
					balance=balance-Amount;
					System.out.print(balance);
				}
				else
				{
					System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ?  ");
				}
				break;
			}
		}	
	}
 }
}
class Kotak extends Phonepay			
{
float balance = 10000.5f;;
private long debitcard=7896321;
private int upi=3575;
private int cvv=123;
static int flagkotak=0;
long getdc()
 {
	return debitcard;
 }
int getcvv()
 {
	return cvv;
 } 
void setupi(int upi)
 {
	this.upi=upi;
 }

void viewBalance(int pin)
 {
	if(pin==upi)//1234
	{
		flagkotak =1;
		System.out.println(balance);
	}
	else
	{	
		System.out.println();
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.println();
		System.out.print("\t Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
			System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.print("\t Please Enter Correct upi pin: ");
			}
			else
			{
			flagkotak=1;
			System.out.println(balance);
			break;
			}
		}	
	}
	
 } 
void toMobile(long Mobileno,float Amount,int pin)
 {
	if(pin==upi)
	{
		if(Amount<balance)
		{
			flagkotak=1;
			balance=balance-Amount;
			System.out.print(balance);
		}
		else
		{
			flagkotak=1;
			System.out.print(" \t  ? ? ? ? NO MONEY ? ? ? ?  ");
		}
	}
	else
	{	
		System.out.println();
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~");
		System.out.println();
		System.out.print("\t Please Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
				System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
				System.out.println();
				System.out.print("\t Please Enter Correct upi pin: ");
			}
			else
			{
				flagkotak=1;
				if(Amount<balance)
				{
					balance=balance-Amount;
					System.out.print(balance);
				}
				else
				{
					System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ? ");
				}
				break;
			}
		}	
	}
 }
void toBank(long Accountno,String ifc,float Amount,int pin)
 {

	if(pin==upi)
	{
		if(Amount<balance)
		{
			flagkotak=1;
			balance=balance-Amount;
			System.out.print(balance);
		}
		else
		{
			flagkotak=1;
			System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ?  ");
		}
	}
	else
	{
		System.out.println();	
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~");
		System.out.println();
		System.out.print("\t Please Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
				System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
				System.out.println();
				System.out.print("\t Please Enter Correct upi pin: ");
			}
			else
			{
				flagkotak=1;
				if(Amount<balance)
				{
					balance=balance-Amount;
					System.out.print(balance);
				}
				else
				{
					System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ? ");
				}
				break;
			}
		}	
	}
 }
}
class Hdfc extends Phonepay			
{
//long accountno = sc.nextLong();
float balance = 500000.0f;
private long debitcard=32484517;
private int upi=3582;
private int cvv=1234;
static int flaghdfc=0;
long getdc()
 {
	return debitcard;
 }
int getcvv()
 {
	return cvv;
 } 
void setupi(int upi)
 {
	this.upi=upi;
 }
void viewBalance(int pin)
 {
	if(pin==upi)//1234
	{
		flaghdfc =1;
		System.out.println(balance);
	}
	else
	{	
		System.out.println();
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.println();
		System.out.print("\t Please Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
			System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
			System.out.println();	
			System.out.print("\t Please Enter Correct upi pin: ");
			}
			else
			{
			flaghdfc=1;
			System.out.println(balance);
			break;
			}
		}	
	}
 } 

void toMobile(long Mobileno,float Amount,int pin)
 {
	if(pin==upi)
	{
		if(Amount<balance)
		{
			flaghdfc=1;
			balance=balance-Amount;
			System.out.print(balance);
		}
		else
		{
			flaghdfc=1;
			System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ? ");
		}
	}
	else
	{
		System.out.println();	
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.println();
		System.out.print("\t PLease Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{		System.out.println();
				System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
				System.out.println();
				System.out.print("\t PLease Enter Correct upi pin: ");
			}
			else
			{
				flaghdfc=1;
				if(Amount<balance)
				{
					balance=balance-Amount;
					System.out.print(balance);
				}
				else
				{
					System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ? ");
				}
				break;
			}
		}	
	}
 }
void toBank(long Accountno,String ifc,float Amount,int pin)
 {
	
	if(pin==upi)
	{
		if(Amount<balance)
		{
			flaghdfc=1;
			balance=balance-Amount;
			System.out.print(balance);
		}
		else
		{
			flaghdfc=1;
			System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ? ");
		}
	}
	else
	{	
		System.out.println();
		System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
		System.out.print("\t PLease Enter Correct upi pin: ");
		for(int i=1;i<=3;i++)
		{	
			if(sc.nextInt()!=upi)
			{
		System.out.println();
				System.out.println("\t ~ ~ ~ ~ You Enter Wrong Pin ~ ~ ~ ~ ");
				System.out.println();	
				System.out.print("\t Please Enter correct upi pin: ");
			}
			else
			{
				flaghdfc=1;
				if(Amount<balance)
				{
					balance=balance-Amount;
					System.out.print(balance);
				}
				else
				{
					System.out.print("\t  ? ? ? ? NO MONEY ? ? ? ? ");
				}
				break;
			}
		}	
	}
 }
}
class User											
{
 		static Scanner sc=new Scanner(System.in);
		void reset(Sbi sbi)
 		{
				
				System.out.println("your OTP : "+Phonepay.otp());
				System.out.print("\t Please Enter OTP number: ");
				if(sc.nextInt()==Phonepay.otp)
				{
				
				System.out.println("\t your debet card number : "+sbi.getdc());
				System.out.println("\t your cvv number : "+sbi.getcvv());
				System.out.println("\t Please Enter the debet card number ");
				System.out.println("\t Please Enter the cvv number");
				long dc=sc.nextLong();
				int cv=sc.nextInt();
				if(dc==sbi.getdc() && cv==sbi.getcvv())
				{
					System.out.print("\t Please Enter upi pin: ");
					sbi.setupi(sc.nextInt());
					System.out.println("\t * * * * Your New UPI Pin Set * * * * ");
					
				}
				else
				{
					System.out.println("\t * * * * Incorrect debit card and cvv * * * * ");	
					System.out.println("\t # # # # Thank You # # # # ");
				}
				}
				else
				{
					System.out.println("\t * * * * * You Entred Wrong OTP * * * * * * \n \t \t  * *  * * Thank You * * * * ");
				}
		}
void reset(Kotak kotak)
 {				
				System.out.println("\t Tour OTP : "+Phonepay.otp());
				System.out.println();
				System.out.print("\t Please Enter OTP Number: ");
				if(sc.nextInt()==Phonepay.otp)
				{
				System.out.println("\t Your Debet Card Number : "+kotak.getdc());
				System.out.println();
				System.out.println("\t Your cvv Number : "+kotak.getcvv());
				System.out.println();
				System.out.print("\t Please Enter the Debet Card Number: ");
				System.out.println();
				System.out.print("\t Please Enter the cvv Number: ");
				System.out.println();
				long dc=sc.nextLong();
				int cv=sc.nextInt();
				if(dc==kotak.getdc() && cv==kotak.getcvv())
				{
					System.out.print("\t Please Enter upi pin:");
					kotak.setupi(sc.nextInt());
					System.out.println("\t * * * * Your New UPI Pin Set * * * * ");
					
				}
				else
				{
					System.out.println("\t * * * * Incorrect Debit Card and cvv * * * * ");	
					System.out.println();
					System.out.println("\t * * * * Thank You * * * * ");
				}
				}
				else
				{
					System.out.println("\t You Entred Wrong OTP \n \t Thank You");
				}
				
}
void reset(Hdfc hdfc)
 {
				System.out.println("\t Your OTP : "+Phonepay.otp());
				System.out.println();
				System.out.print("\t PLease Enter OTP Number: ");
				if(sc.nextInt()==Phonepay.otp)
				{
				System.out.println("\t Your Debet Card Number : "+hdfc.getdc());
				System.out.println();
				System.out.println("\t Your cvv Number : "+hdfc.getcvv());
				System.out.println();
				System.out.print("\t Please Enter the Debet Card Number: ");
				System.out.println();
				System.out.print("\t Please Enter the cvv Number: ");
				long dc=sc.nextLong();
				int cv=sc.nextInt();
				if(dc==hdfc.getdc() && cv==hdfc.getcvv())
				{
					System.out.print("\t Please Enter upi Pin: ");
					hdfc.setupi(sc.nextInt());
					System.out.println("\t * * * * Your New UPI Pin Set * * * * ");
					
				}
				else
				{
					System.out.println("\t * * * * Incorrect Debit Card and cvv * * * * ");
					System.out.println();	
					System.out.println("\t * * * * Thank You * * * *");
				}
				}
				else
				{
					System.out.println("\t You Entred Wrong OTP\n \t Thank You");
				}
}

 				
 void viewbalance()
{
System.out.println();
	System.out.println("\t 1. Through SBI");
System.out.println();
	System.out.println("\t 2. Through KOTAK");
System.out.println();
	System.out.println("\t 3. Through HDFC");
System.out.println();
System.out.print("\t Choose your Choice: ");
	int n=sc.nextInt();
	if(n==1)
	{
		Phonepay p=new Sbi();
		Sbi sbi=new Sbi();
System.out.println();
		System.out.print("\t Please Enter upi Pin: ");
		p.viewBalance(sc.nextInt());
		int flag = Sbi.flagsbi;
		if(flag==0)
		{
			System.out.println(" \t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No need");
			System.out.println();
			System.out.print("\t Enter Your Choice: ");

			int a=sc.nextInt();
			if(a==1)
			{
				reset(sbi);
			}
			else
			{
				System.out.print("\t **** Thank you ****");
			}
		}	
	}
	if(n==2)
	{
		Phonepay p=new Kotak();
		Kotak kotak =new Kotak();
		System.out.print("\t Please Enter upi Pin: ");
		p.viewBalance(sc.nextInt());
		int flag = kotak.flagkotak;
		if(flag==0)
		{
			System.out.println("\t Do you want reset the set UPI pin");
			System.out.println();
			System.out.println("\t 1. Reset ");
			System.out.println();
			System.out.println("\t 2. No Need");
System.out.println();
System.out.print("Choose your choice: ");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(kotak);
			}
			else
			{
				System.out.print("\t **** Thank you ****");
			}
		}		
	}
	if(n==3)
	{
		Phonepay p=new Hdfc();
		Hdfc hdfc =new Hdfc();
		System.out.print("\t Please Enter upi Pin: ");
		p.viewBalance(sc.nextInt());
		int flag = hdfc.flaghdfc;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No Need");
System.out.println();
System.out.print("Choose your Choice: ");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(hdfc);
			}
			else
			{
				System.out.print("\t **** Thank you ****");
			}
		}	
	}
	
}
void tomobiletransfer()
{	

System.out.println();
	System.out.println("\t 1. Through SBI");
System.out.println();
	System.out.println("\t 2. Through KOTAK");
System.out.println();
	System.out.println("\t 3. Through HDFC");
System.out.println();
System.out.print("\t Choose your Choice: ");
	int n=sc.nextInt();
	if(n==1)
	{
		Phonepay p=new Sbi();
		Sbi sbi=new Sbi();
		System.out.print("\t Please Enter account number,amount and pin");
		p.toMobile(sc.nextLong(),sc.nextFloat(),sc.nextInt());
		int flag = Sbi.flagsbi;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No need");
System.out.println();
System.out.println("Enter your Choice: ");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(sbi);
			}
			else
			{
				System.out.print("\t  * * * * Thank You * * * * ");
			}
		}	
	}
	if(n==2)
	{
		Phonepay p=new Kotak();
		Kotak kotak=new Kotak();
		System.out.print("\t PLease Enter account number,amount and pin");
		p.toMobile(sc.nextLong(),sc.nextFloat(),sc.nextInt());
		int flag = kotak.flagkotak;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No need");
System.out.println();
System.out.print("Enter Your Choice:");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(kotak);
			}
			else
			{
				System.out.print("\t * * * * Thank you * * * * ");
			}
		}	
	}
	if(n==3)
	{
		Phonepay p=new Hdfc();
		Hdfc hdfc=new Hdfc();
		System.out.print("\t  Enter account number,amount and pin");
		p.toMobile(sc.nextLong(),sc.nextFloat(),sc.nextInt());
		int flag = hdfc.flaghdfc;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t  2. No need");
System.out.println();
System.out.println("Enter your Choice: ");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(hdfc);
			}
			else
			{
				System.out.print("\t * * * * Thank you * * * *");
			}
		}	
	}
}
void tobank()
{


System.out.println();
	System.out.println("\t 1. Through SBI");
System.out.println();
	System.out.println("\t 2. Through KOTAK");
System.out.println();
	System.out.println("\t 3. Through HDFC");
System.out.println();
System.out.print("\t Choose your Choice: ");
	int n=sc.nextInt();
	if(n==1)
	{
		Phonepay p=new Sbi();
		Sbi sbi=new Sbi();
		System.out.print("\t PLease Enter account number,IFC code,amount and pin");
		p.toBank(sc.nextLong(),sc.next(),sc.nextFloat(),sc.nextInt());
		int flag = Sbi.flagsbi;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No need");
System.out.println();
System.out.println("Enter your Choice: ");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(sbi);
			}
			else
			{
				System.out.print("\t * * * * Thank You * * * * ");
			}
		}	
	}
	if(n==2)
	{
		Phonepay p=new Kotak();
		Kotak kotak=new Kotak();
		System.out.print("\t Please Enter account number,IFC code,amount and pin");
		p.toBank(sc.nextLong(),sc.next(),sc.nextFloat(),sc.nextInt());
		int flag = kotak.flagkotak;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No need");
System.out.println();
System.out.println("Enter your Choice: ");
			int a=sc.nextInt();
			if(a==1)
			{
				reset(kotak);
			}
			else
			{
				System.out.print("\t * * * * Thank you * * * *");
			}
		}	
	}
	if(n==3)
	{
		Phonepay p=new Hdfc();
		Hdfc hdfc=new Hdfc();
		System.out.print("\t Please Enter account number,amount and pin");
		p.toBank(sc.nextLong(),sc.next(),sc.nextFloat(),sc.nextInt());
		int flag = hdfc.flaghdfc;
		if(flag==0)
		{
			System.out.println("\t ~ ~ ~ ~ Do you want reset the set UPI pin ~ ~ ~ ~ ");
			System.out.println();
			System.out.println("\t 1. Reset");
			System.out.println();
			System.out.println("\t 2. No need");
System.out.println();
System.out.println("Enter your Choice: ");	
			int a=sc.nextInt();
			if(a==1)
			{
				reset(hdfc);
			}
			else
			{
				System.out.print("\t * * * * Thank you * * * * ");
			}
		}	
	}			
	
}
public static void main(String [] args)
 {
		
	User obj =new User();
System.out.println();
System.out.println();
        System.out.println("\t\t\t\t\t  -----------------------------------------     ");
        System.out.println("\t\t\t\t\t |                                         |    ");
        System.out.println("\t\t\t\t\t |   $$$$    Welcome to Phonepee    $$$$   |    ");
        System.out.println("\t\t\t\t\t |                                         |    ");
        System.out.println("\t\t\t\t\t  -----------------------------------------     ");	
System.out.println();

System.out.println();
	System.out.println("\t 1. For View Balance");
System.out.println();
	System.out.println("\t 2. For To Mobile Transfer");
System.out.println();
	System.out.println("\t 3. For To Bank");
System.out.println();
	System.out.print("\t  Choose you option: ");
	int a =sc.nextInt();
	if(a==1)
	{
		obj.viewbalance();
	}
	if(a==2)
	{
		obj.tomobiletransfer();
	}
	if(a==3)
	{
		obj.tobank();
	}
 }
}











