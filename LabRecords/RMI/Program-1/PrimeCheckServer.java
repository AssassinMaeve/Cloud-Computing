import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class PrimeCheckServer{
    public static void main(String args[]){
        try{
        PrimeCheckImplement obj = new PrimeCheckImplement();
        Registry registry = LocateRegistry.createRegistry(4000);
        registry.bind("PrimeCheck", obj);
        System.out.println("PrimeCheck Server is ready.");


    }catch(Exception e){
        System.out.println("Unexpected error: "+e);
    }
    
    }
}