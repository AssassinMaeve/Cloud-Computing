
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class MaxEleServer {
    public static void main(String[] args) {
        try {
            MaxEleClass obj = new MaxEleClass();
            Registry reg = LocateRegistry.createRegistry(8000); 
            reg.rebind("maxele", obj);
			
            System.out.println("Server is started....");
        } 
		catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
