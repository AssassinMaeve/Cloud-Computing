import java.rmi.server.UnicastRemoteObject; 
import java.rmi.RemoteException;

public class DelRepCharImpl extends UnicastRemoteObject implements DelRepCharInterface{ 
	public DelRepCharImpl() throws RemoteException{ 
 		super();
 	}
 	public String delRepChar(String str) throws RemoteException{
        StringBuffer st = new StringBuffer(str); 
 		for (int i = 0; i < st.length(); i++) {
            for (int j = i + 1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    st.deleteCharAt(j);
                }
            }
        }
        String newst = st.toString();
        return newst;
 	}
}
