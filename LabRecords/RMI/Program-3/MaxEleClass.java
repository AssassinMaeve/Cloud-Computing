
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MaxEleClass extends UnicastRemoteObject implements MaxEleInterface {
    public MaxEleClass() throws RemoteException {
        super();
    }
	public int findMax(int num[]) throws RemoteException{
		int max = num[0];
		for (int i = 0; i<num.length;i++)
			if(num[i]>max)
				max = num[i];
		return max;
	}
}

