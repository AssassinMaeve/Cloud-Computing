import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class StrVowServer {
    public static void main(String args[]){
        try{
            StrVowImpl obj = new StrVowImpl();
            Registry registry = LocateRegistry.createRegistry(4000);
            registry.rebind("checkvow", obj);
            System.out.println("Server is started...");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}