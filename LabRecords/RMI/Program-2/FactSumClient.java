import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.*;
import java.util.Scanner;
public class FactSumClient
{	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			Registry reg=LocateRegistry.getRegistry(5000);
			FactSumInter temp=(FactSumInter) reg.lookup("factsum");
            
			System.out.println("Client is accessing...");
			System.out.print("\nEnter an Integer: ");
			int num=sc.nextInt();
			System.out.println("The sum of the factorials of each digit in an integer   "+num+" is: "+temp.sumFact(num));
		}
		catch(Exception e){
			System.out.println(e.getMessage());}
	}
}
