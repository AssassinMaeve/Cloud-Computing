import java.rmi.Remote; 
import java.rmi.RemoteException;

public interface DelRepCharInterface extends Remote{ 
	public String delRepChar(String str) throws RemoteException;
}
