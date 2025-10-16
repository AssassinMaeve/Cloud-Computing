import java.rmi.server.UnicastRemoteObject; 
import java.rmi.RemoteException;

public class FindRepCharImpl extends UnicastRemoteObject implements FindRepCharInterface{ 
	public FindRepCharImpl() throws RemoteException{ 
 		super();
 	}
 	public boolean findRepChar(String str) throws RemoteException{ 
 		for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
 	}
}
