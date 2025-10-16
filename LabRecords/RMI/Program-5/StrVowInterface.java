import java.rmi.Remote; 
import java.rmi.RemoteException;

public interface StrVowInterface extends Remote{ 
	public boolean findVow(String str) throws RemoteException;
}
