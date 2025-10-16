import java.rmi.server.UnicastRemoteObject; 
import java.rmi.RemoteException;

public class StrVowImpl extends UnicastRemoteObject implements StrVowInterface{ 
	public StrVowImpl() throws RemoteException{ 
 		super();
 	}
 	public boolean findVow(String str) throws RemoteException{ 
 		boolean isVow = false ;
 		for (int i = 0 ; i < str.length() ; i++)
 			if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'){
 				isVow = true;
 				break;
 			}
 		return isVow;
 	}
}
