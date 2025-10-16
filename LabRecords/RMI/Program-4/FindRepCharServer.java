import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 
import java.rmi.*;

public class FindRepCharServer{ 
	public static void main(String args[]){
		try{ 
			FindRepCharImpl obj = new FindRepCharImpl(); 
			Registry reg = LocateRegistry.createRegistry(5000); 
			reg.rebind("findrepchar",obj);
 			System.out.println("Server is started..."); 
 		}
 		catch (Exception e){ 
 			System.out.println(e.getMessage());
 		}
 	}
 }
