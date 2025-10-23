import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class FactSumServer
{
	public static void main(String args[])
	{
		try{
			FactSumImpl obj=new FactSumImpl();
			Registry reg=LocateRegistry.createRegistry(5000);
			reg.rebind("factsum",obj);
			System.out.println("Server is started...");	
		}
		catch(Exception e){
			System.out.println(e.getMessage());}
	}
}
