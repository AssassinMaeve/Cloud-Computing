import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry; 

public class DelRepCharServer{ 
	public static void main(String args[]){
		try{ 
			DelRepCharImpl obj = new DelRepCharImpl(); 
			Registry reg = LocateRegistry.createRegistry(5000); 
			reg.rebind("delrepchar",obj);
 			
 			System.out.println("Server is started..."); 
 		}
 		catch (Exception e){ 
 			System.out.println(e.getMessage());}
 	}
 }
