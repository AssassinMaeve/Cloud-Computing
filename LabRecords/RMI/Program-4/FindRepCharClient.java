import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner; 

public class FindRepCharClient{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		try{
			Registry reg = LocateRegistry.getRegistry(5000); 
			FindRepCharInterface temp = (FindRepCharInterface) reg.lookup("findrepchar");
			System.out.println("Client is accessing...");
			String st = args[0]; 
			if(temp.findRepChar(st))
				System.out.println("\nThe given string have repeatedcharacters.....");
			else
				System.out.println("\nThe given string does not have repeated characters....."); 
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			sc.close();
		}
	}
}
