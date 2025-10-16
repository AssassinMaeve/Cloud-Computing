import java.rmi.Remote; 
import java.rmi.RemoteException;

public interface FindRepCharInterface extends Remote{ 
	public boolean findRepChar(String str) throws RemoteException;
}
